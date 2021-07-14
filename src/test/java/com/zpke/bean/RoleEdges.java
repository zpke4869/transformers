package com.zpke.bean;

public class RoleEdges{

	public RoleEdges(){
	}

	private String fromHost;

	private String fromUser;

	private String toHost;

	private String toUser;

	private String withAdminOption;

	public String getFromHost(){
		return this.fromHost;
	}

	public String getFromUser(){
		return this.fromUser;
	}

	public String getToHost(){
		return this.toHost;
	}

	public String getToUser(){
		return this.toUser;
	}

	public String getWithAdminOption(){
		return this.withAdminOption;
	}

	public void setFromHost(String fromHost){
		 this.fromHost = fromHost;
	}

	public void setFromUser(String fromUser){
		 this.fromUser = fromUser;
	}

	public void setToHost(String toHost){
		 this.toHost = toHost;
	}

	public void setToUser(String toUser){
		 this.toUser = toUser;
	}

	public void setWithAdminOption(String withAdminOption){
		 this.withAdminOption = withAdminOption;
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
		RoleEdges o = (RoleEdges) obj;
		if(toUser == null && o.getToUser() != null){
			return false;
		}else if (!toUser.equals(o.getToUser())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((toUser == null) ? 0 : toUser.hashCode());
		return result;
	}

}