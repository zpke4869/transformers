package com.zpke.transformers.dao;

import com.zpke.transformers.context.ConfigContext;

/**
 * 
 * 表定义查询数据库层工厂类
 * @author 28564
 *
 */
public class TableDefinitionDaoFactFactory {

	/**
	 * 根据conifg.propertites中配置的数据库类型返回相应的数据库访问类
	 * @return
	 */
	public static TableDefinitionDao getTableDefinitionDao(){
		String dataType = ConfigContext.getInstance().getDatabaseType();
		switch (dataType) {
		case "mysql":
			return new MysqlDao();
		default:
			return null;
		}
	}
	
}
