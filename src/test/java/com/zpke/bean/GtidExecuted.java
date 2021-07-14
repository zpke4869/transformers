package com.zpke.bean;

public class GtidExecuted{

	public GtidExecuted(){
	}

	private String sourceUuid;

	private int intervalStart;

	private int intervalEnd;

	public String getSourceUuid(){
		return this.sourceUuid;
	}

	public int getIntervalStart(){
		return this.intervalStart;
	}

	public int getIntervalEnd(){
		return this.intervalEnd;
	}

	public void setSourceUuid(String sourceUuid){
		 this.sourceUuid = sourceUuid;
	}

	public void setIntervalStart(int intervalStart){
		 this.intervalStart = intervalStart;
	}

	public void setIntervalEnd(int intervalEnd){
		 this.intervalEnd = intervalEnd;
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
		GtidExecuted o = (GtidExecuted) obj;
		if(intervalStart != o.getIntervalStart()){
			return false;
		}		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((intervalStart == null) ? 0 : intervalStart.hashCode());
		return result;
	}

}