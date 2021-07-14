package com.zpke.bean;

public class EngineCost{

	public EngineCost(){
	}

	private String engineName;

	private int deviceType;

	private String costName;

	private float costValue;

	private String lastUpdate;

	private String comment;

	private float defaultValue;

	public String getEngineName(){
		return this.engineName;
	}

	public int getDeviceType(){
		return this.deviceType;
	}

	public String getCostName(){
		return this.costName;
	}

	public float getCostValue(){
		return this.costValue;
	}

	public String getLastUpdate(){
		return this.lastUpdate;
	}

	public String getComment(){
		return this.comment;
	}

	public float getDefaultValue(){
		return this.defaultValue;
	}

	public void setEngineName(String engineName){
		 this.engineName = engineName;
	}

	public void setDeviceType(int deviceType){
		 this.deviceType = deviceType;
	}

	public void setCostName(String costName){
		 this.costName = costName;
	}

	public void setCostValue(float costValue){
		 this.costValue = costValue;
	}

	public void setLastUpdate(String lastUpdate){
		 this.lastUpdate = lastUpdate;
	}

	public void setComment(String comment){
		 this.comment = comment;
	}

	public void setDefaultValue(float defaultValue){
		 this.defaultValue = defaultValue;
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
		EngineCost o = (EngineCost) obj;
		if(costName == null && o.getCostName() != null){
			return false;
		}else if (!costName.equals(o.getCostName())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((costName == null) ? 0 : costName.hashCode());
		return result;
	}

}