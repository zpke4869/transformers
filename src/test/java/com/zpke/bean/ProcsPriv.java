package com.zpke.bean;

public class ProcsPriv{

	public ProcsPriv(){
	}

	private String host;

	private String db;

	private String user;

	private String routineName;

	private String routineType;

	private String grantor;

	private String procPriv;

	private String timestamp;

	public String getHost(){
		return this.host;
	}

	public String getDb(){
		return this.db;
	}

	public String getUser(){
		return this.user;
	}

	public String getRoutineName(){
		return this.routineName;
	}

	public String getRoutineType(){
		return this.routineType;
	}

	public String getGrantor(){
		return this.grantor;
	}

	public String getProcPriv(){
		return this.procPriv;
	}

	public String getTimestamp(){
		return this.timestamp;
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

	public void setRoutineName(String routineName){
		 this.routineName = routineName;
	}

	public void setRoutineType(String routineType){
		 this.routineType = routineType;
	}

	public void setGrantor(String grantor){
		 this.grantor = grantor;
	}

	public void setProcPriv(String procPriv){
		 this.procPriv = procPriv;
	}

	public void setTimestamp(String timestamp){
		 this.timestamp = timestamp;
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
		ProcsPriv o = (ProcsPriv) obj;
		if(routineType == null && o.getRoutineType() != null){
			return false;
		}else if (!routineType.equals(o.getRoutineType())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((routineType == null) ? 0 : routineType.hashCode());
		return result;
	}

}