package com.zpke.bean;

public class HelpKeyword{

	public HelpKeyword(){
	}

	private int helpKeywordId;

	private String name;

	public int getHelpKeywordId(){
		return this.helpKeywordId;
	}

	public String getName(){
		return this.name;
	}

	public void setHelpKeywordId(int helpKeywordId){
		 this.helpKeywordId = helpKeywordId;
	}

	public void setName(String name){
		 this.name = name;
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
		HelpKeyword o = (HelpKeyword) obj;
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