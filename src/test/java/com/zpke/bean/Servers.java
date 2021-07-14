package com.zpke.bean;

public class Servers{

	public Servers(){
	}

	private String serverName;

	private String host;

	private String db;

	private String username;

	private String password;

	private int port;

	private String socket;

	private String wrapper;

	private String owner;

	public String getServerName(){
		return this.serverName;
	}

	public String getHost(){
		return this.host;
	}

	public String getDb(){
		return this.db;
	}

	public String getUsername(){
		return this.username;
	}

	public String getPassword(){
		return this.password;
	}

	public int getPort(){
		return this.port;
	}

	public String getSocket(){
		return this.socket;
	}

	public String getWrapper(){
		return this.wrapper;
	}

	public String getOwner(){
		return this.owner;
	}

	public void setServerName(String serverName){
		 this.serverName = serverName;
	}

	public void setHost(String host){
		 this.host = host;
	}

	public void setDb(String db){
		 this.db = db;
	}

	public void setUsername(String username){
		 this.username = username;
	}

	public void setPassword(String password){
		 this.password = password;
	}

	public void setPort(int port){
		 this.port = port;
	}

	public void setSocket(String socket){
		 this.socket = socket;
	}

	public void setWrapper(String wrapper){
		 this.wrapper = wrapper;
	}

	public void setOwner(String owner){
		 this.owner = owner;
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
		Servers o = (Servers) obj;
		if(serverName == null && o.getServerName() != null){
			return false;
		}else if (!serverName.equals(o.getServerName())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((serverName == null) ? 0 : serverName.hashCode());
		return result;
	}

}