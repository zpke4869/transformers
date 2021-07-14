package com.zpke.bean;

public class GeneralLog{

	public GeneralLog(){
	}

	private String eventTime;

	private String userHost;

	private int threadId;

	private int serverId;

	private String commandType;

	private String argument;

	public String getEventTime(){
		return this.eventTime;
	}

	public String getUserHost(){
		return this.userHost;
	}

	public int getThreadId(){
		return this.threadId;
	}

	public int getServerId(){
		return this.serverId;
	}

	public String getCommandType(){
		return this.commandType;
	}

	public String getArgument(){
		return this.argument;
	}

	public void setEventTime(String eventTime){
		 this.eventTime = eventTime;
	}

	public void setUserHost(String userHost){
		 this.userHost = userHost;
	}

	public void setThreadId(int threadId){
		 this.threadId = threadId;
	}

	public void setServerId(int serverId){
		 this.serverId = serverId;
	}

	public void setCommandType(String commandType){
		 this.commandType = commandType;
	}

	public void setArgument(String argument){
		 this.argument = argument;
	}


}