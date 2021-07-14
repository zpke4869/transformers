package com.zpke.transformers.bean;


/**
 * 
 * 列实体类 
 * @author 28564
 *
 */
public class Column {

	//列名
	private String name;
	//数据库中类型
	private String dataBaseType;
	//java代码中数据类型
	private String codeType;
	
	public Column() {
		super();
	}

	public Column(String name, String dataBaseType, String codeType) {
		super();
		this.name = name;
		this.dataBaseType = dataBaseType;
		this.codeType = codeType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDataBaseType() {
		return dataBaseType;
	}

	public void setDataBaseType(String dataBaseType) {
		this.dataBaseType = dataBaseType;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	@Override
	public String toString() {
		return "Column [name=" + name + ", dataBaseType=" + dataBaseType + ", codeType=" + codeType + "]";
	}

	
}
