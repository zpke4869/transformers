package com.zpke.bean;

public class InnodbIndexStats{

	public InnodbIndexStats(){
	}

	private String databaseName;

	private String tableName;

	private String indexName;

	private String lastUpdate;

	private String statName;

	private int statValue;

	private int sampleSize;

	private String statDescription;

	public String getDatabaseName(){
		return this.databaseName;
	}

	public String getTableName(){
		return this.tableName;
	}

	public String getIndexName(){
		return this.indexName;
	}

	public String getLastUpdate(){
		return this.lastUpdate;
	}

	public String getStatName(){
		return this.statName;
	}

	public int getStatValue(){
		return this.statValue;
	}

	public int getSampleSize(){
		return this.sampleSize;
	}

	public String getStatDescription(){
		return this.statDescription;
	}

	public void setDatabaseName(String databaseName){
		 this.databaseName = databaseName;
	}

	public void setTableName(String tableName){
		 this.tableName = tableName;
	}

	public void setIndexName(String indexName){
		 this.indexName = indexName;
	}

	public void setLastUpdate(String lastUpdate){
		 this.lastUpdate = lastUpdate;
	}

	public void setStatName(String statName){
		 this.statName = statName;
	}

	public void setStatValue(int statValue){
		 this.statValue = statValue;
	}

	public void setSampleSize(int sampleSize){
		 this.sampleSize = sampleSize;
	}

	public void setStatDescription(String statDescription){
		 this.statDescription = statDescription;
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
		InnodbIndexStats o = (InnodbIndexStats) obj;
		if(statName == null && o.getStatName() != null){
			return false;
		}else if (!statName.equals(o.getStatName())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((statName == null) ? 0 : statName.hashCode());
		return result;
	}

}