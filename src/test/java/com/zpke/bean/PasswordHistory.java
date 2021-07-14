package com.zpke.bean;

public class PasswordHistory{

	public PasswordHistory(){
	}

	private String host;

	private String user;

	private String passwordTimestamp;

	private String password;

	public String getHost(){
		return this.host;
	}

	public String getUser(){
		return this.user;
	}

	public String getPasswordTimestamp(){
		return this.passwordTimestamp;
	}

	public String getPassword(){
		return this.password;
	}

	public void setHost(String host){
		 this.host = host;
	}

	public void setUser(String user){
		 this.user = user;
	}

	public void setPasswordTimestamp(String passwordTimestamp){
		 this.passwordTimestamp = passwordTimestamp;
	}

	public void setPassword(String password){
		 this.password = password;
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
		PasswordHistory o = (PasswordHistory) obj;
		if(passwordTimestamp == null && o.getPasswordTimestamp() != null){
			return false;
		}else if (!passwordTimestamp.equals(o.getPasswordTimestamp())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((passwordTimestamp == null) ? 0 : passwordTimestamp.hashCode());
		return result;
	}

}