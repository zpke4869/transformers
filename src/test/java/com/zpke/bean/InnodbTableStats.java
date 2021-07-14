package com.zpke.bean;

public class InnodbTableStats{

	public InnodbTableStats(){
	}

	private String databaseName;

	private String tableName;

	private String lastUpdate;

	private int nRows;

	private int clusteredIndexSize;

	private int sumOfOtherIndexSizes;

	public String getDatabaseName(){
		return this.databaseName;
	}

	public String getTableName(){
		return this.tableName;
	}

	public String getLastUpdate(){
		return this.lastUpdate;
	}

	public int getNRows(){
		return this.nRows;
	}

	public int getClusteredIndexSize(){
		return this.clusteredIndexSize;
	}

	public int getSumOfOtherIndexSizes(){
		return this.sumOfOtherIndexSizes;
	}

	public void setDatabaseName(String databaseName){
		 this.databaseName = databaseName;
	}

	public void setTableName(String tableName){
		 this.tableName = tableName;
	}

	public void setLastUpdate(String lastUpdate){
		 this.lastUpdate = lastUpdate;
	}

	public void setNRows(int nRows){
		 this.nRows = nRows;
	}

	public void setClusteredIndexSize(int clusteredIndexSize){
		 this.clusteredIndexSize = clusteredIndexSize;
	}

	public void setSumOfOtherIndexSizes(int sumOfOtherIndexSizes){
		 this.sumOfOtherIndexSizes = sumOfOtherIndexSizes;
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
		InnodbTableStats o = (InnodbTableStats) obj;
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