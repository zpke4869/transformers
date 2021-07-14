package com.zpke.bean;

public class Component{

	public Component(){
	}

	private int componentId;

	private int componentGroupId;

	private String componentUrn;

	public int getComponentId(){
		return this.componentId;
	}

	public int getComponentGroupId(){
		return this.componentGroupId;
	}

	public String getComponentUrn(){
		return this.componentUrn;
	}

	public void setComponentId(int componentId){
		 this.componentId = componentId;
	}

	public void setComponentGroupId(int componentGroupId){
		 this.componentGroupId = componentGroupId;
	}

	public void setComponentUrn(String componentUrn){
		 this.componentUrn = componentUrn;
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
		Component o = (Component) obj;
		if(componentId != o.getComponentId()){
			return false;
		}		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((componentId == null) ? 0 : componentId.hashCode());
		return result;
	}

}