package com.zpke.transformers.dao;

import java.util.List;
import java.util.Map;

import com.zpke.transformers.bean.Column;
import com.zpke.transformers.bean.ForeignKey;
import com.zpke.transformers.bean.PrimaryKey;

/**
 * 
 * 表定义查询数据库层接口
 * @author 28564
 *
 */
public interface TableDefinitionDao {
	
	/**
	 * 根据conifg.propertites中配置的表名查询出需要转化的所有表
	 * @return
	 */
	public abstract List<String> getTableList();
	
	
	/**
	 * 根据表名查询该表的主键
	 * @param tableName
	 * @return
	 */
	public abstract PrimaryKey getPrimaryKeyByTableName(String tableName);
	
	
	/**
	 * 根据表名查询表的外键
	 * @param tableName
	 * @return
	 */
	public abstract Map<String,ForeignKey> getForeignKeyMapByTableName(String tableName);
	
	
	/**
	 * 根据表名查询所有列
	 * @param tableName
	 * @return
	 */
	public abstract List<Column> getColumnListByTableName(String tableName);
}
