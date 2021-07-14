package com.zpke.transformers.bean;


/**
 * 
 * 外键实体类
 * @author 28564
 *
 */
public class ForeignKey {

	//外键名
	private String foreignKeyName;
	//外键列名
	private String columnName;
	//外键关联表名
	private String linkTableName;
	//外键关联列名
	private String linkColumnName;
	
	public ForeignKey() {
		super();
	}

	public String getForeignKeyName() {
		return foreignKeyName;
	}

	public void setForeignKeyName(String foreignKeyName) {
		this.foreignKeyName = foreignKeyName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getLinkTableName() {
		return linkTableName;
	}

	public void setLinkTableName(String linkTableName) {
		this.linkTableName = linkTableName;
	}

	public String getLinkColumnName() {
		return linkColumnName;
	}

	public void setLinkColumnName(String linkColumnName) {
		this.linkColumnName = linkColumnName;
	}

	@Override
	public String toString() {
		return "ForeignKey [foreignKeyName=" + foreignKeyName + ", columnName=" + columnName + ", linkTableName="
				+ linkTableName + ", linkColumnName=" + linkColumnName + "]";
	}
	
	
}
