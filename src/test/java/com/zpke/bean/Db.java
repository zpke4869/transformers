package com.zpke.bean;

public class Db{

	public Db(){
	}

	private String host;

	private String db;

	private String user;

	private String selectPriv;

	private String insertPriv;

	private String updatePriv;

	private String deletePriv;

	private String createPriv;

	private String dropPriv;

	private String grantPriv;

	private String referencesPriv;

	private String indexPriv;

	private String alterPriv;

	private String createTmpTablePriv;

	private String lockTablesPriv;

	private String createViewPriv;

	private String showViewPriv;

	private String createRoutinePriv;

	private String alterRoutinePriv;

	private String executePriv;

	private String eventPriv;

	private String triggerPriv;

	public String getHost(){
		return this.host;
	}

	public String getDb(){
		return this.db;
	}

	public String getUser(){
		return this.user;
	}

	public String getSelectPriv(){
		return this.selectPriv;
	}

	public String getInsertPriv(){
		return this.insertPriv;
	}

	public String getUpdatePriv(){
		return this.updatePriv;
	}

	public String getDeletePriv(){
		return this.deletePriv;
	}

	public String getCreatePriv(){
		return this.createPriv;
	}

	public String getDropPriv(){
		return this.dropPriv;
	}

	public String getGrantPriv(){
		return this.grantPriv;
	}

	public String getReferencesPriv(){
		return this.referencesPriv;
	}

	public String getIndexPriv(){
		return this.indexPriv;
	}

	public String getAlterPriv(){
		return this.alterPriv;
	}

	public String getCreateTmpTablePriv(){
		return this.createTmpTablePriv;
	}

	public String getLockTablesPriv(){
		return this.lockTablesPriv;
	}

	public String getCreateViewPriv(){
		return this.createViewPriv;
	}

	public String getShowViewPriv(){
		return this.showViewPriv;
	}

	public String getCreateRoutinePriv(){
		return this.createRoutinePriv;
	}

	public String getAlterRoutinePriv(){
		return this.alterRoutinePriv;
	}

	public String getExecutePriv(){
		return this.executePriv;
	}

	public String getEventPriv(){
		return this.eventPriv;
	}

	public String getTriggerPriv(){
		return this.triggerPriv;
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

	public void setSelectPriv(String selectPriv){
		 this.selectPriv = selectPriv;
	}

	public void setInsertPriv(String insertPriv){
		 this.insertPriv = insertPriv;
	}

	public void setUpdatePriv(String updatePriv){
		 this.updatePriv = updatePriv;
	}

	public void setDeletePriv(String deletePriv){
		 this.deletePriv = deletePriv;
	}

	public void setCreatePriv(String createPriv){
		 this.createPriv = createPriv;
	}

	public void setDropPriv(String dropPriv){
		 this.dropPriv = dropPriv;
	}

	public void setGrantPriv(String grantPriv){
		 this.grantPriv = grantPriv;
	}

	public void setReferencesPriv(String referencesPriv){
		 this.referencesPriv = referencesPriv;
	}

	public void setIndexPriv(String indexPriv){
		 this.indexPriv = indexPriv;
	}

	public void setAlterPriv(String alterPriv){
		 this.alterPriv = alterPriv;
	}

	public void setCreateTmpTablePriv(String createTmpTablePriv){
		 this.createTmpTablePriv = createTmpTablePriv;
	}

	public void setLockTablesPriv(String lockTablesPriv){
		 this.lockTablesPriv = lockTablesPriv;
	}

	public void setCreateViewPriv(String createViewPriv){
		 this.createViewPriv = createViewPriv;
	}

	public void setShowViewPriv(String showViewPriv){
		 this.showViewPriv = showViewPriv;
	}

	public void setCreateRoutinePriv(String createRoutinePriv){
		 this.createRoutinePriv = createRoutinePriv;
	}

	public void setAlterRoutinePriv(String alterRoutinePriv){
		 this.alterRoutinePriv = alterRoutinePriv;
	}

	public void setExecutePriv(String executePriv){
		 this.executePriv = executePriv;
	}

	public void setEventPriv(String eventPriv){
		 this.eventPriv = eventPriv;
	}

	public void setTriggerPriv(String triggerPriv){
		 this.triggerPriv = triggerPriv;
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
		Db o = (Db) obj;
		if(user == null && o.getUser() != null){
			return false;
		}else if (!user.equals(o.getUser())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

}