package com.zpke.bean;

public class SlowLog{

	public SlowLog(){
	}

	private String startTime;

	private String userHost;

	private String queryTime;

	private String lockTime;

	private int rowsSent;

	private int rowsExamined;

	private String db;

	private int lastInsertId;

	private int insertId;

	private int serverId;

	private String sqlText;

	private int threadId;

	public String getStartTime(){
		return this.startTime;
	}

	public String getUserHost(){
		return this.userHost;
	}

	public String getQueryTime(){
		return this.queryTime;
	}

	public String getLockTime(){
		return this.lockTime;
	}

	public int getRowsSent(){
		return this.rowsSent;
	}

	public int getRowsExamined(){
		return this.rowsExamined;
	}

	public String getDb(){
		return this.db;
	}

	public int getLastInsertId(){
		return this.lastInsertId;
	}

	public int getInsertId(){
		return this.insertId;
	}

	public int getServerId(){
		return this.serverId;
	}

	public String getSqlText(){
		return this.sqlText;
	}

	public int getThreadId(){
		return this.threadId;
	}

	public void setStartTime(String startTime){
		 this.startTime = startTime;
	}

	public void setUserHost(String userHost){
		 this.userHost = userHost;
	}

	public void setQueryTime(String queryTime){
		 this.queryTime = queryTime;
	}

	public void setLockTime(String lockTime){
		 this.lockTime = lockTime;
	}

	public void setRowsSent(int rowsSent){
		 this.rowsSent = rowsSent;
	}

	public void setRowsExamined(int rowsExamined){
		 this.rowsExamined = rowsExamined;
	}

	public void setDb(String db){
		 this.db = db;
	}

	public void setLastInsertId(int lastInsertId){
		 this.lastInsertId = lastInsertId;
	}

	public void setInsertId(int insertId){
		 this.insertId = insertId;
	}

	public void setServerId(int serverId){
		 this.serverId = serverId;
	}

	public void setSqlText(String sqlText){
		 this.sqlText = sqlText;
	}

	public void setThreadId(int threadId){
		 this.threadId = threadId;
	}


}