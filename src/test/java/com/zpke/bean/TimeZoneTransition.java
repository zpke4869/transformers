package com.zpke.bean;

public class TimeZoneTransition{

	public TimeZoneTransition(){
	}

	private int timeZoneId;

	private int transitionTime;

	private int transitionTypeId;

	public int getTimeZoneId(){
		return this.timeZoneId;
	}

	public int getTransitionTime(){
		return this.transitionTime;
	}

	public int getTransitionTypeId(){
		return this.transitionTypeId;
	}

	public void setTimeZoneId(int timeZoneId){
		 this.timeZoneId = timeZoneId;
	}

	public void setTransitionTime(int transitionTime){
		 this.transitionTime = transitionTime;
	}

	public void setTransitionTypeId(int transitionTypeId){
		 this.transitionTypeId = transitionTypeId;
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
		TimeZoneTransition o = (TimeZoneTransition) obj;
		if(transitionTime != o.getTransitionTime()){
			return false;
		}		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((transitionTime == null) ? 0 : transitionTime.hashCode());
		return result;
	}

}