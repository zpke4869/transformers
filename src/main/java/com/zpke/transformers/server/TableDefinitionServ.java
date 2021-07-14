package com.zpke.transformers.server;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zpke.transformers.bean.Column;
import com.zpke.transformers.bean.ForeignKey;
import com.zpke.transformers.bean.PrimaryKey;
import com.zpke.transformers.bean.Table;
import com.zpke.transformers.context.ConfigContext;
import com.zpke.transformers.dao.TableDefinitionDao;
import com.zpke.transformers.dao.TableDefinitionDaoFactFactory;
import com.zpke.transformers.utils.TransformUtils;

/**
 * 表定义查询服务层
 * @author 28564
 *
 */
public class TableDefinitionServ {
	
	//表定义查询数据库层
	private TableDefinitionDao dao = TableDefinitionDaoFactFactory.getTableDefinitionDao();
	
	/**
	 * 获得TableDefinition
	 * @return
	 */
	public Map<String, Table> getTableDefinition() {
		Map<String, Table> tableDefinition = new HashMap<>();
		if(dao != null) {
			List<String> tableList = dao.getTableList();
			tableList.forEach(tableName -> {
				addTableDefinitionByTableName(tableName,tableDefinition);
			});
		}else {
			System.out.println("数据库类型配置错误");
		}
		return tableDefinition;
	}
	
	
	/**
	 * 根据表名获得表实体对象
	 * @param tableName
	 * @return
	 */
	private void addTableDefinitionByTableName(String tableName,Map<String, Table> tableDefinition) {
		if(tableDefinition.containsKey(tableName)) {
			return;
		}
		
		//是否根据外键自动生成关联表对应的bean
		String autoForeignKeyTable = ConfigContext.getInstance().getAutoForeignKeyTable();

		Table table = new Table();
		table.setTableName(tableName);
		tableDefinition.put(tableName, table);
		
		PrimaryKey primaryKey = dao.getPrimaryKeyByTableName(tableName);
		if(primaryKey != null) {
			table.setPrimaryKey(primaryKey);
		}
		List<Column> columns = dao.getColumnListByTableName(tableName);
		Map<String, ForeignKey> foreignKeyMap = dao.getForeignKeyMapByTableName(tableName);
		if(foreignKeyMap != null && foreignKeyMap.size() > 0) {
			table.setForeignKeyMap(foreignKeyMap);
			if("1".equals(autoForeignKeyTable)) {
				Collection<ForeignKey> values = foreignKeyMap.values();
				values.forEach(foreignKey -> {
					addTableDefinitionByTableName(foreignKey.getLinkTableName(),tableDefinition);
				});
				columns.forEach(column ->{
					String columnName = column.getName();
					if(foreignKeyMap.containsKey(columnName)) {
						ForeignKey foreignKey = foreignKeyMap.get(columnName);
						String newName = foreignKey.getForeignKeyName().replace("fk_", "").replace(tableName +"_", "");
						column.setName(newName);
						if(primaryKey != null && !columnName.equals(newName) && columnName.equals(primaryKey.getColumnName())) {
							primaryKey.setColumnName(newName);
						}
						column.setCodeType(TransformUtils.transToHumpNamingFirstUpper(foreignKey.getLinkTableName()));
					}
				});
			}
		}
		table.setColumns(columns);
	}
	
}
