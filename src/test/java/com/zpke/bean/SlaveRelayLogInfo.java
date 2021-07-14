package com.zpke.bean;

public class SlaveRelayLogInfo{

	public SlaveRelayLogInfo(){
	}

	private int numberOfLines;

	private String relayLogName;

	private int relayLogPos;

	private String masterLogName;

	private int masterLogPos;

	private int sqlDelay;

	private int numberOfWorkers;

	private int id;

	private String channelName;

	private String privilegeChecksUsername;

	private String privilegeChecksHostname;

	private int requireRowFormat;

	private String requireTablePrimaryKeyCheck;

	public int getNumberOfLines(){
		return this.numberOfLines;
	}

	public String getRelayLogName(){
		return this.relayLogName;
	}

	public int getRelayLogPos(){
		return this.relayLogPos;
	}

	public String getMasterLogName(){
		return this.masterLogName;
	}

	public int getMasterLogPos(){
		return this.masterLogPos;
	}

	public int getSqlDelay(){
		return this.sqlDelay;
	}

	public int getNumberOfWorkers(){
		return this.numberOfWorkers;
	}

	public int getId(){
		return this.id;
	}

	public String getChannelName(){
		return this.channelName;
	}

	public String getPrivilegeChecksUsername(){
		return this.privilegeChecksUsername;
	}

	public String getPrivilegeChecksHostname(){
		return this.privilegeChecksHostname;
	}

	public int getRequireRowFormat(){
		return this.requireRowFormat;
	}

	public String getRequireTablePrimaryKeyCheck(){
		return this.requireTablePrimaryKeyCheck;
	}

	public void setNumberOfLines(int numberOfLines){
		 this.numberOfLines = numberOfLines;
	}

	public void setRelayLogName(String relayLogName){
		 this.relayLogName = relayLogName;
	}

	public void setRelayLogPos(int relayLogPos){
		 this.relayLogPos = relayLogPos;
	}

	public void setMasterLogName(String masterLogName){
		 this.masterLogName = masterLogName;
	}

	public void setMasterLogPos(int masterLogPos){
		 this.masterLogPos = masterLogPos;
	}

	public void setSqlDelay(int sqlDelay){
		 this.sqlDelay = sqlDelay;
	}

	public void setNumberOfWorkers(int numberOfWorkers){
		 this.numberOfWorkers = numberOfWorkers;
	}

	public void setId(int id){
		 this.id = id;
	}

	public void setChannelName(String channelName){
		 this.channelName = channelName;
	}

	public void setPrivilegeChecksUsername(String privilegeChecksUsername){
		 this.privilegeChecksUsername = privilegeChecksUsername;
	}

	public void setPrivilegeChecksHostname(String privilegeChecksHostname){
		 this.privilegeChecksHostname = privilegeChecksHostname;
	}

	public void setRequireRowFormat(int requireRowFormat){
		 this.requireRowFormat = requireRowFormat;
	}

	public void setRequireTablePrimaryKeyCheck(String requireTablePrimaryKeyCheck){
		 this.requireTablePrimaryKeyCheck = requireTablePrimaryKeyCheck;
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
		SlaveRelayLogInfo o = (SlaveRelayLogInfo) obj;
		if(channelName == null && o.getChannelName() != null){
			return false;
		}else if (!channelName.equals(o.getChannelName())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((channelName == null) ? 0 : channelName.hashCode());
		return result;
	}

}