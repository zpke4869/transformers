package com.zpke.bean;

public class SlaveMasterInfo{

	public SlaveMasterInfo(){
	}

	private int numberOfLines;

	private String masterLogName;

	private int masterLogPos;

	private String host;

	private String userName;

	private String userPassword;

	private int port;

	private int connectRetry;

	private int enabledSsl;

	private String sslCa;

	private String sslCapath;

	private String sslCert;

	private String sslCipher;

	private String sslKey;

	private int sslVerifyServerCert;

	private float heartbeat;

	private String bind;

	private String ignoredServerIds;

	private String uuid;

	private int retryCount;

	private String sslCrl;

	private String sslCrlpath;

	private int enabledAutoPosition;

	private String channelName;

	private String tlsVersion;

	private String publicKeyPath;

	private int getPublicKey;

	private String networkNamespace;

	private String masterCompressionAlgorithm;

	private int masterZstdCompressionLevel;

	private String tlsCiphersuites;

	public int getNumberOfLines(){
		return this.numberOfLines;
	}

	public String getMasterLogName(){
		return this.masterLogName;
	}

	public int getMasterLogPos(){
		return this.masterLogPos;
	}

	public String getHost(){
		return this.host;
	}

	public String getUserName(){
		return this.userName;
	}

	public String getUserPassword(){
		return this.userPassword;
	}

	public int getPort(){
		return this.port;
	}

	public int getConnectRetry(){
		return this.connectRetry;
	}

	public int getEnabledSsl(){
		return this.enabledSsl;
	}

	public String getSslCa(){
		return this.sslCa;
	}

	public String getSslCapath(){
		return this.sslCapath;
	}

	public String getSslCert(){
		return this.sslCert;
	}

	public String getSslCipher(){
		return this.sslCipher;
	}

	public String getSslKey(){
		return this.sslKey;
	}

	public int getSslVerifyServerCert(){
		return this.sslVerifyServerCert;
	}

	public float getHeartbeat(){
		return this.heartbeat;
	}

	public String getBind(){
		return this.bind;
	}

	public String getIgnoredServerIds(){
		return this.ignoredServerIds;
	}

	public String getUuid(){
		return this.uuid;
	}

	public int getRetryCount(){
		return this.retryCount;
	}

	public String getSslCrl(){
		return this.sslCrl;
	}

	public String getSslCrlpath(){
		return this.sslCrlpath;
	}

	public int getEnabledAutoPosition(){
		return this.enabledAutoPosition;
	}

	public String getChannelName(){
		return this.channelName;
	}

	public String getTlsVersion(){
		return this.tlsVersion;
	}

	public String getPublicKeyPath(){
		return this.publicKeyPath;
	}

	public int getGetPublicKey(){
		return this.getPublicKey;
	}

	public String getNetworkNamespace(){
		return this.networkNamespace;
	}

	public String getMasterCompressionAlgorithm(){
		return this.masterCompressionAlgorithm;
	}

	public int getMasterZstdCompressionLevel(){
		return this.masterZstdCompressionLevel;
	}

	public String getTlsCiphersuites(){
		return this.tlsCiphersuites;
	}

	public void setNumberOfLines(int numberOfLines){
		 this.numberOfLines = numberOfLines;
	}

	public void setMasterLogName(String masterLogName){
		 this.masterLogName = masterLogName;
	}

	public void setMasterLogPos(int masterLogPos){
		 this.masterLogPos = masterLogPos;
	}

	public void setHost(String host){
		 this.host = host;
	}

	public void setUserName(String userName){
		 this.userName = userName;
	}

	public void setUserPassword(String userPassword){
		 this.userPassword = userPassword;
	}

	public void setPort(int port){
		 this.port = port;
	}

	public void setConnectRetry(int connectRetry){
		 this.connectRetry = connectRetry;
	}

	public void setEnabledSsl(int enabledSsl){
		 this.enabledSsl = enabledSsl;
	}

	public void setSslCa(String sslCa){
		 this.sslCa = sslCa;
	}

	public void setSslCapath(String sslCapath){
		 this.sslCapath = sslCapath;
	}

	public void setSslCert(String sslCert){
		 this.sslCert = sslCert;
	}

	public void setSslCipher(String sslCipher){
		 this.sslCipher = sslCipher;
	}

	public void setSslKey(String sslKey){
		 this.sslKey = sslKey;
	}

	public void setSslVerifyServerCert(int sslVerifyServerCert){
		 this.sslVerifyServerCert = sslVerifyServerCert;
	}

	public void setHeartbeat(float heartbeat){
		 this.heartbeat = heartbeat;
	}

	public void setBind(String bind){
		 this.bind = bind;
	}

	public void setIgnoredServerIds(String ignoredServerIds){
		 this.ignoredServerIds = ignoredServerIds;
	}

	public void setUuid(String uuid){
		 this.uuid = uuid;
	}

	public void setRetryCount(int retryCount){
		 this.retryCount = retryCount;
	}

	public void setSslCrl(String sslCrl){
		 this.sslCrl = sslCrl;
	}

	public void setSslCrlpath(String sslCrlpath){
		 this.sslCrlpath = sslCrlpath;
	}

	public void setEnabledAutoPosition(int enabledAutoPosition){
		 this.enabledAutoPosition = enabledAutoPosition;
	}

	public void setChannelName(String channelName){
		 this.channelName = channelName;
	}

	public void setTlsVersion(String tlsVersion){
		 this.tlsVersion = tlsVersion;
	}

	public void setPublicKeyPath(String publicKeyPath){
		 this.publicKeyPath = publicKeyPath;
	}

	public void setGetPublicKey(int getPublicKey){
		 this.getPublicKey = getPublicKey;
	}

	public void setNetworkNamespace(String networkNamespace){
		 this.networkNamespace = networkNamespace;
	}

	public void setMasterCompressionAlgorithm(String masterCompressionAlgorithm){
		 this.masterCompressionAlgorithm = masterCompressionAlgorithm;
	}

	public void setMasterZstdCompressionLevel(int masterZstdCompressionLevel){
		 this.masterZstdCompressionLevel = masterZstdCompressionLevel;
	}

	public void setTlsCiphersuites(String tlsCiphersuites){
		 this.tlsCiphersuites = tlsCiphersuites;
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
		SlaveMasterInfo o = (SlaveMasterInfo) obj;
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