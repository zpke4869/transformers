package com.zpke.transformers.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zpke.transformers.bean.Column;
import com.zpke.transformers.bean.ForeignKey;
import com.zpke.transformers.bean.PrimaryKey;
import com.zpke.transformers.context.ConfigContext;
import com.zpke.transformers.utils.TransformUtils;

/**
 * 
 * 表定义查询数据库层的mysql实现
 * @author 28564
 *
 */
public class MysqlDao extends BaseDao implements TableDefinitionDao {
	
	//当前数据库
	private String dataBase = "";

	public MysqlDao() {
		super();
		initDataBase();
	}

	public MysqlDao(String dataBase) {
		super();
		this.dataBase = dataBase;
	}

	/**
	 * 查询当前链接的数据库名
	 */
	private void initDataBase() {
		String sql = "select database()";
		ResultSet query = this.query(sql, null);
		try {
			while (query.next()) {
				dataBase = query.getString(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource();
		}
	}

	@Override
	public List<String> getTableList() {
		String selectTableName = ConfigContext.getInstance().getTableName();
		List<String> tableList = new ArrayList<>();
		String sql = "select * from information_schema.tables " + 
		             "where table_schema = ? and table_name like ? " +
				     "and table_type = 'BASE TABLE' ";
		Object[] params = new Object[2];
		params[0] = dataBase;
		params[1] = selectTableName;
		ResultSet query = this.query(sql, params);
		try {
			while (query.next()) {
				String tableName = query.getString("TABLE_NAME");
				tableList.add(tableName);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource();
		}
		return tableList;
	}

	@Override
	public PrimaryKey getPrimaryKeyByTableName(String tableName) {
		ResultSet query = getConstraintByConstraintType(tableName,"PRIMARY KEY");
		PrimaryKey primaryKey = null;
		try {
			while (query.next()) {
				primaryKey = new PrimaryKey();
				primaryKey.setColumnName(query.getString("COLUMN_NAME"));
				primaryKey.setPrimaryKeyName(query.getString("CONSTRAINT_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource();
		}
		return primaryKey;
	}
	
	@Override
	public Map<String,ForeignKey> getForeignKeyMapByTableName(String tableName) {
		ResultSet query = getConstraintByConstraintType(tableName,"FOREIGN KEY");
		Map<String,ForeignKey> foreignKeyMap= null;
		try {
			while (query.next()) {
				if(foreignKeyMap == null) {
					foreignKeyMap= new HashMap<>();
				}
				ForeignKey foreignKey = new ForeignKey();
				foreignKey.setColumnName(query.getString("COLUMN_NAME"));
				foreignKey.setForeignKeyName(query.getString("CONSTRAINT_NAME"));
				foreignKey.setLinkTableName(query.getString("REFERENCED_TABLE_NAME"));
				foreignKey.setLinkColumnName(query.getString("REFERENCED_COLUMN_NAME"));
				foreignKeyMap.put(foreignKey.getColumnName(), foreignKey);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource();
		}
		return foreignKeyMap;
	}
	
	@Override
	public List<Column> getColumnListByTableName(String tableName){
		String sql = "select * from information_schema.columns " + 
				     "where table_schema = ? and table_name = ? ";
		Object[] params = new Object[2];
		params[0] = dataBase;
		params[1] = tableName;
		ResultSet query = this.query(sql, params);
		List<Column> columnList= new ArrayList<>();
		try {
			while (query.next()) {
				Column column = new Column();
				column.setName(query.getString("COLUMN_NAME"));
				column.setDataBaseType(query.getString("DATA_TYPE"));
				column.setCodeType(TransformUtils.getCodeTypeByDataBaseType(query.getString("DATA_TYPE")));
				columnList.add(column);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			this.closeResource();
		}
		return columnList;
	}
	
	private ResultSet getConstraintByConstraintType(String tableName,String constraintType) {
		String sql = "select col.*,con.constraint_type " + 
				     "from information_schema.key_column_usage col," + 
				     "information_schema.table_constraints con " + 
			         "where con.table_schema = col.table_schema " + 
			         "and con.table_name = col.table_name " + 
		             "and con.constraint_name = col.constraint_name " + 
		             "and con.constraint_type = ? " + 
			         "and col.table_schema = ? " + 
			         "and col.table_name = ? ";
		Object[] params = new Object[3];
		params[0] = constraintType;
		params[1] = dataBase;
		params[2] = tableName;
		return this.query(sql, params);
	}
}
