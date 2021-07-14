package com.zpke.bean;

public class Func{

	public Func(){
	}

	private String name;

	private int ret;

	private String dl;

	private String type;

	public String getName(){
		return this.name;
	}

	public int getRet(){
		return this.ret;
	}

	public String getDl(){
		return this.dl;
	}

	public String getType(){
		return this.type;
	}

	public void setName(String name){
		 this.name = name;
	}

	public void setRet(int ret){
		 this.ret = ret;
	}

	public void setDl(String dl){
		 this.dl = dl;
	}

	public void setType(String type){
		 this.type = type;
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
		Func o = (Func) obj;
		if(name == null && o.getName() != null){
			return false;
		}else if (!name.equals(o.getName())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

}