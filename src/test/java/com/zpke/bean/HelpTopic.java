package com.zpke.bean;

public class HelpTopic{

	public HelpTopic(){
	}

	private int helpTopicId;

	private String name;

	private int helpCategoryId;

	private String description;

	private String example;

	private String url;

	public int getHelpTopicId(){
		return this.helpTopicId;
	}

	public String getName(){
		return this.name;
	}

	public int getHelpCategoryId(){
		return this.helpCategoryId;
	}

	public String getDescription(){
		return this.description;
	}

	public String getExample(){
		return this.example;
	}

	public String getUrl(){
		return this.url;
	}

	public void setHelpTopicId(int helpTopicId){
		 this.helpTopicId = helpTopicId;
	}

	public void setName(String name){
		 this.name = name;
	}

	public void setHelpCategoryId(int helpCategoryId){
		 this.helpCategoryId = helpCategoryId;
	}

	public void setDescription(String description){
		 this.description = description;
	}

	public void setExample(String example){
		 this.example = example;
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
		HelpTopic o = (HelpTopic) obj;
		if(helpTopicId != o.getHelpTopicId()){
			return false;
		}		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((helpTopicId == null) ? 0 : helpTopicId.hashCode());
		return result;
	}

}