package com.zpke.bean;

public class TimeZoneTransitionType{

	public TimeZoneTransitionType(){
	}

	private int timeZoneId;

	private int transitionTypeId;

	private int offset;

	private int isDst;

	private String abbreviation;

	public int getTimeZoneId(){
		return this.timeZoneId;
	}

	public int getTransitionTypeId(){
		return this.transitionTypeId;
	}

	public int getOffset(){
		return this.offset;
	}

	public int getIsDst(){
		return this.isDst;
	}

	public String getAbbreviation(){
		return this.abbreviation;
	}

	public void setTimeZoneId(int timeZoneId){
		 this.timeZoneId = timeZoneId;
	}

	public void setTransitionTypeId(int transitionTypeId){
		 this.transitionTypeId = transitionTypeId;
	}

	public void setOffset(int offset){
		 this.offset = offset;
	}

	public void setIsDst(int isDst){
		 this.isDst = isDst;
	}

	public void setAbbreviation(String abbreviation){
		 this.abbreviation = abbreviation;
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
		TimeZoneTransitionType o = (TimeZoneTransitionType) obj;
		if(transitionTypeId != o.getTransitionTypeId()){
			return false;
		}		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((transitionTypeId == null) ? 0 : transitionTypeId.hashCode());
		return result;
	}

}