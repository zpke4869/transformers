package com.zpke.bean;

public class ProxiesPriv{

	public ProxiesPriv(){
	}

	private String host;

	private String user;

	private String proxiedHost;

	private String proxiedUser;

	private int withGrant;

	private String grantor;

	private String timestamp;

	public String getHost(){
		return this.host;
	}

	public String getUser(){
		return this.user;
	}

	public String getProxiedHost(){
		return this.proxiedHost;
	}

	public String getProxiedUser(){
		return this.proxiedUser;
	}

	public int getWithGrant(){
		return this.withGrant;
	}

	public String getGrantor(){
		return this.grantor;
	}

	public String getTimestamp(){
		return this.timestamp;
	}

	public void setHost(String host){
		 this.host = host;
	}

	public void setUser(String user){
		 this.user = user;
	}

	public void setProxiedHost(String proxiedHost){
		 this.proxiedHost = proxiedHost;
	}

	public void setProxiedUser(String proxiedUser){
		 this.proxiedUser = proxiedUser;
	}

	public void setWithGrant(int withGrant){
		 this.withGrant = withGrant;
	}

	public void setGrantor(String grantor){
		 this.grantor = grantor;
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
		ProxiesPriv o = (ProxiesPriv) obj;
		if(proxiedUser == null && o.getProxiedUser() != null){
			return false;
		}else if (!proxiedUser.equals(o.getProxiedUser())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((proxiedUser == null) ? 0 : proxiedUser.hashCode());
		return result;
	}

}