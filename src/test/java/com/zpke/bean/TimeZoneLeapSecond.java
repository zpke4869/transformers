package com.zpke.bean;

public class TimeZoneLeapSecond{

	public TimeZoneLeapSecond(){
	}

	private int transitionTime;

	private int correction;

	public int getTransitionTime(){
		return this.transitionTime;
	}

	public int getCorrection(){
		return this.correction;
	}

	public void setTransitionTime(int transitionTime){
		 this.transitionTime = transitionTime;
	}

	public void setCorrection(int correction){
		 this.correction = correction;
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
		TimeZoneLeapSecond o = (TimeZoneLeapSecond) obj;
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