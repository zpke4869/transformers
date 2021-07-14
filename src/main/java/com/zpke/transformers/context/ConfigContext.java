package com.zpke.transformers.context;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * 根据config.properties转化为配置的环境变量
 * @author 28564
 *
 */
public class ConfigContext {
	
	private String databaseType;
	private String driver;
	private String url;
	private String user;
	private String password;
	private String tableName;
	private String packageName;
	private String rootPath;
	private String methodType;
	private String overrideEquals;
	private String autoForeignKeyTable;
	
	private ConfigContext() {
		init();
	}
	
	private void init() {
		File file = new File("src/main/resources/config.properties");
		try(InputStream is = new FileInputStream(file);) {
			Properties prop = new Properties();    
			prop.load(is);
			databaseType = prop.getProperty("databaseType","");
			driver = prop.getProperty("driver","");
			url = prop.getProperty("url","");
			user = prop.getProperty("user","");
			password = prop.getProperty("password","");
			tableName = prop.getProperty("tableName","%%");
			packageName = prop.getProperty("packageName","com.zpke");
			rootPath = prop.getProperty("rootPath","");
			methodType = prop.getProperty("methodType","2");
			overrideEquals = prop.getProperty("overrideEquals","0");
			autoForeignKeyTable = prop.getProperty("autoForeignKeyTable","0");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static class ConfigContextInner{
		public final static ConfigContext instance = new ConfigContext(); 
	}
	
	public static ConfigContext getInstance() {
		return ConfigContextInner.instance;
	}

	public String getDatabaseType() {
		return databaseType;
	}
	
	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPassword() {
		return password;
	}
	
	public String getTableName() {
		return tableName;
	}
	
	public String getPackageName() {
		return packageName;
	}
	
	public String getRootPath() {
		return rootPath;
	}
	
	public String getMethodType() {
		return methodType;
	}
	
	public String getOverrideEquals() {
		return overrideEquals;
	}
	
	public String getAutoForeignKeyTable() {
		return autoForeignKeyTable;
	}
}
