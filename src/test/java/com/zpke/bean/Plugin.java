package com.zpke.bean;

public class Plugin{

	public Plugin(){
	}

	private String name;

	private String dl;

	public String getName(){
		return this.name;
	}

	public String getDl(){
		return this.dl;
	}

	public void setName(String name){
		 this.name = name;
	}

	public void setDl(String dl){
		 this.dl = dl;
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
		Plugin o = (Plugin) obj;
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