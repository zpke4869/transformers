package com.zpke.bean;

public class TimeZone{

	public TimeZone(){
	}

	private int timeZoneId;

	private String useLeapSeconds;

	public int getTimeZoneId(){
		return this.timeZoneId;
	}

	public String getUseLeapSeconds(){
		return this.useLeapSeconds;
	}

	public void setTimeZoneId(int timeZoneId){
		 this.timeZoneId = timeZoneId;
	}

	public void setUseLeapSeconds(String useLeapSeconds){
		 this.useLeapSeconds = useLeapSeconds;
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
		TimeZone o = (TimeZone) obj;
		if(timeZoneId != o.getTimeZoneId()){
			return false;
		}		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((timeZoneId == null) ? 0 : timeZoneId.hashCode());
		return result;
	}

}