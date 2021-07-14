package com.zpke.bean;

public class GlobalGrants{

	public GlobalGrants(){
	}

	private String user;

	private String host;

	private String priv;

	private String withGrantOption;

	public String getUser(){
		return this.user;
	}

	public String getHost(){
		return this.host;
	}

	public String getPriv(){
		return this.priv;
	}

	public String getWithGrantOption(){
		return this.withGrantOption;
	}

	public void setUser(String user){
		 this.user = user;
	}

	public void setHost(String host){
		 this.host = host;
	}

	public void setPriv(String priv){
		 this.priv = priv;
	}

	public void setWithGrantOption(String withGrantOption){
		 this.withGrantOption = withGrantOption;
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
		GlobalGrants o = (GlobalGrants) obj;
		if(priv == null && o.getPriv() != null){
			return false;
		}else if (!priv.equals(o.getPriv())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((priv == null) ? 0 : priv.hashCode());
		return result;
	}

}