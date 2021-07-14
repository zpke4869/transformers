package com.zpke.bean;

public class HelpCategory{

	public HelpCategory(){
	}

	private int helpCategoryId;

	private String name;

	private int parentCategoryId;

	private String url;

	public int getHelpCategoryId(){
		return this.helpCategoryId;
	}

	public String getName(){
		return this.name;
	}

	public int getParentCategoryId(){
		return this.parentCategoryId;
	}

	public String getUrl(){
		return this.url;
	}

	public void setHelpCategoryId(int helpCategoryId){
		 this.helpCategoryId = helpCategoryId;
	}

	public void setName(String name){
		 this.name = name;
	}

	public void setParentCategoryId(int parentCategoryId){
		 this.parentCategoryId = parentCategoryId;
	}

	public void setUrl(String url){
		 this.url = url;
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
		HelpCategory o = (HelpCategory) obj;
		if(helpCategoryId != o.getHelpCategoryId()){
			return false;
		}		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((helpCategoryId == null) ? 0 : helpCategoryId.hashCode());
		return result;
	}

}