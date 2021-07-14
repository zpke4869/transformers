package com.zpke.bean;

public class HelpRelation{

	public HelpRelation(){
	}

	private int helpTopicId;

	private int helpKeywordId;

	public int getHelpTopicId(){
		return this.helpTopicId;
	}

	public int getHelpKeywordId(){
		return this.helpKeywordId;
	}

	public void setHelpTopicId(int helpTopicId){
		 this.helpTopicId = helpTopicId;
	}

	public void setHelpKeywordId(int helpKeywordId){
		 this.helpKeywordId = helpKeywordId;
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
		HelpRelation o = (HelpRelation) obj;
		if(helpKeywordId != o.getHelpKeywordId()){
			return false;
		}		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((helpKeywordId == null) ? 0 : helpKeywordId.hashCode());
		return result;
	}

}