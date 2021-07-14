package com.zpke.bean;

public class DefaultRoles{

	public DefaultRoles(){
	}

	private String host;

	private String user;

	private String defaultRoleHost;

	private String defaultRoleUser;

	public String getHost(){
		return this.host;
	}

	public String getUser(){
		return this.user;
	}

	public String getDefaultRoleHost(){
		return this.defaultRoleHost;
	}

	public String getDefaultRoleUser(){
		return this.defaultRoleUser;
	}

	public void setHost(String host){
		 this.host = host;
	}

	public void setUser(String user){
		 this.user = user;
	}

	public void setDefaultRoleHost(String defaultRoleHost){
		 this.defaultRoleHost = defaultRoleHost;
	}

	public void setDefaultRoleUser(String defaultRoleUser){
		 this.defaultRoleUser = defaultRoleUser;
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
		DefaultRoles o = (DefaultRoles) obj;
		if(defaultRoleUser == null && o.getDefaultRoleUser() != null){
			return false;
		}else if (!defaultRoleUser.equals(o.getDefaultRoleUser())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((defaultRoleUser == null) ? 0 : defaultRoleUser.hashCode());
		return result;
	}

}