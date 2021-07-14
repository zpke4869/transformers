package com.zpke.bean;

public class ColumnsPriv{

	public ColumnsPriv(){
	}

	private String host;

	private String db;

	private String user;

	private String tableName;

	private String columnName;

	private String timestamp;

	private String columnPriv;

	public String getHost(){
		return this.host;
	}

	public String getDb(){
		return this.db;
	}

	public String getUser(){
		return this.user;
	}

	public String getTableName(){
		return this.tableName;
	}

	public String getColumnName(){
		return this.columnName;
	}

	public String getTimestamp(){
		return this.timestamp;
	}

	public String getColumnPriv(){
		return this.columnPriv;
	}

	public void setHost(String host){
		 this.host = host;
	}

	public void setDb(String db){
		 this.db = db;
	}

	public void setUser(String user){
		 this.user = user;
	}

	public void setTableName(String tableName){
		 this.tableName = tableName;
	}

	public void setColumnName(String columnName){
		 this.columnName = columnName;
	}

	public void setTimestamp(String timestamp){
		 this.timestamp = timestamp;
	}

	public void setColumnPriv(String columnPriv){
		 this.columnPriv = columnPriv;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		ColumnsPriv o = (ColumnsPriv) obj;
		if(columnName == null && o.getColumnName() != null){
			return false;
		}else if (!columnName.equals(o.getColumnName())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((columnName == null) ? 0 : columnName.hashCode());
		return result;
	}

}