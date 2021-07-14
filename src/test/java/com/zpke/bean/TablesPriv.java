package com.zpke.bean;

public class TablesPriv{

	public TablesPriv(){
	}

	private String host;

	private String db;

	private String user;

	private String tableName;

	private String grantor;

	private String timestamp;

	private String tablePriv;

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

	public String getGrantor(){
		return this.grantor;
	}

	public String getTimestamp(){
		return this.timestamp;
	}

	public String getTablePriv(){
		return this.tablePriv;
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

	public void setGrantor(String grantor){
		 this.grantor = grantor;
	}

	public void setTimestamp(String timestamp){
		 this.timestamp = timestamp;
	}

	public void setTablePriv(String tablePriv){
		 this.tablePriv = tablePriv;
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
		TablesPriv o = (TablesPriv) obj;
		if(tableName == null && o.getTableName() != null){
			return false;
		}else if (!tableName.equals(o.getTableName())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tableName == null) ? 0 : tableName.hashCode());
		return result;
	}

}