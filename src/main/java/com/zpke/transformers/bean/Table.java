package com.zpke.transformers.bean;

import java.util.List;
import java.util.Map;

/**
 * 表实体类
 * @author 28564
 *
 */
public class Table {

	//表名
	private String tableName;
	
	//表中的列
	private List<Column> columns;
	
	//表中的主键
	private PrimaryKey primaryKey;
	
	//表中的外键
	private Map<String,ForeignKey> foreignKeyMap;

	public Table() {
		super();
	}

	public Table(String tableName, List<Column> columns, PrimaryKey primaryKey, Map<String, ForeignKey> foreignKeyMap) {
		super();
		this.tableName = tableName;
		this.columns = columns;
		this.primaryKey = primaryKey;
		this.foreignKeyMap = foreignKeyMap;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public List<Column> getColumns() {
		return columns;
	}

	public void setColumns(List<Column> columns) {
		this.columns = columns;
	}

	public PrimaryKey getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(PrimaryKey primaryKey) {
		this.primaryKey = primaryKey;
	}

	public Map<String, ForeignKey> getForeignKeyMap() {
		return foreignKeyMap;
	}

	public void setForeignKeyMap(Map<String, ForeignKey> foreignKeyMap) {
		this.foreignKeyMap = foreignKeyMap;
	}

	@Override
	public String toString() {
		return "Table [tableName=" + tableName + ", columns=" + columns + ", primaryKey=" + primaryKey
				+ ", foreignKeyMap=" + foreignKeyMap + "]";
	}
}
