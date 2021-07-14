package com.zpke.bean;

public class TimeZoneName{

	public TimeZoneName(){
	}

	private String name;

	private int timeZoneId;

	public String getName(){
		return this.name;
	}

	public int getTimeZoneId(){
		return this.timeZoneId;
	}

	public void setName(String name){
		 this.name = name;
	}

	public void setTimeZoneId(int timeZoneId){
		 this.timeZoneId = timeZoneId;
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
		TimeZoneName o = (TimeZoneName) obj;
		if(name == null && o.getName() != null){
			return false;
		}else if (!name.equals(o.getName())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

}