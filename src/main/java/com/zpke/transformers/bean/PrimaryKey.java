package com.zpke.transformers.bean;

/**
 * 主键实体类
 * @author 28564
 *
 */
public class PrimaryKey {
	
	//主键名
	private String primaryKeyName;
	//主键实体类
	private String columnName;
	
	public PrimaryKey() {
		super();
	}

	public PrimaryKey(String primaryKeyName, String columnName) {
		super();
		this.primaryKeyName = primaryKeyName;
		this.columnName = columnName;
	}

	public String getPrimaryKeyName() {
		return primaryKeyName;
	}

	public void setPrimaryKeyName(String primaryKeyName) {
		this.primaryKeyName = primaryKeyName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Override
	public String toString() {
		return "PrimaryKey [primaryKeyName=" + primaryKeyName + ", columnName=" + columnName + "]";
	}
	
	
	
	
}
