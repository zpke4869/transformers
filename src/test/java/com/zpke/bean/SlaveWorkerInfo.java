package com.zpke.bean;

public class SlaveWorkerInfo{

	public SlaveWorkerInfo(){
	}

	private int id;

	private String relayLogName;

	private int relayLogPos;

	private String masterLogName;

	private int masterLogPos;

	private String checkpointRelayLogName;

	private int checkpointRelayLogPos;

	private String checkpointMasterLogName;

	private int checkpointMasterLogPos;

	private int checkpointSeqno;

	private int checkpointGroupSize;

	private String checkpointGroupBitmap;

	private String channelName;

	public int getId(){
		return this.id;
	}

	public String getRelayLogName(){
		return this.relayLogName;
	}

	public int getRelayLogPos(){
		return this.relayLogPos;
	}

	public String getMasterLogName(){
		return this.masterLogName;
	}

	public int getMasterLogPos(){
		return this.masterLogPos;
	}

	public String getCheckpointRelayLogName(){
		return this.checkpointRelayLogName;
	}

	public int getCheckpointRelayLogPos(){
		return this.checkpointRelayLogPos;
	}

	public String getCheckpointMasterLogName(){
		return this.checkpointMasterLogName;
	}

	public int getCheckpointMasterLogPos(){
		return this.checkpointMasterLogPos;
	}

	public int getCheckpointSeqno(){
		return this.checkpointSeqno;
	}

	public int getCheckpointGroupSize(){
		return this.checkpointGroupSize;
	}

	public String getCheckpointGroupBitmap(){
		return this.checkpointGroupBitmap;
	}

	public String getChannelName(){
		return this.channelName;
	}

	public void setId(int id){
		 this.id = id;
	}

	public void setRelayLogName(String relayLogName){
		 this.relayLogName = relayLogName;
	}

	public void setRelayLogPos(int relayLogPos){
		 this.relayLogPos = relayLogPos;
	}

	public void setMasterLogName(String masterLogName){
		 this.masterLogName = masterLogName;
	}

	public void setMasterLogPos(int masterLogPos){
		 this.masterLogPos = masterLogPos;
	}

	public void setCheckpointRelayLogName(String checkpointRelayLogName){
		 this.checkpointRelayLogName = checkpointRelayLogName;
	}

	public void setCheckpointRelayLogPos(int checkpointRelayLogPos){
		 this.checkpointRelayLogPos = checkpointRelayLogPos;
	}

	public void setCheckpointMasterLogName(String checkpointMasterLogName){
		 this.checkpointMasterLogName = checkpointMasterLogName;
	}

	public void setCheckpointMasterLogPos(int checkpointMasterLogPos){
		 this.checkpointMasterLogPos = checkpointMasterLogPos;
	}

	public void setCheckpointSeqno(int checkpointSeqno){
		 this.checkpointSeqno = checkpointSeqno;
	}

	public void setCheckpointGroupSize(int checkpointGroupSize){
		 this.checkpointGroupSize = checkpointGroupSize;
	}

	public void setCheckpointGroupBitmap(String checkpointGroupBitmap){
		 this.checkpointGroupBitmap = checkpointGroupBitmap;
	}

	public void setChannelName(String channelName){
		 this.channelName = channelName;
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
		SlaveWorkerInfo o = (SlaveWorkerInfo) obj;
		if(channelName == null && o.getChannelName() != null){
			return false;
		}else if (!channelName.equals(o.getChannelName())){
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((channelName == null) ? 0 : channelName.hashCode());
		return result;
	}

}