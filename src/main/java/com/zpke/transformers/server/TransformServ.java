package com.zpke.transformers.server;

import java.io.IOException;
import java.util.Map;

import com.zpke.transformers.bean.Table;
import com.zpke.transformers.io.TransTableToBean;

/**
 * 表定义转化为代码的服务层
 * @author 28564
 *
 */
public class TransformServ {

	public void trans() {
		//获得表定义
		TableDefinitionServ tableDefinitionServ = new TableDefinitionServ();
		Map<String, Table> tableDefinition = tableDefinitionServ.getTableDefinition();
		tableDefinition.forEach((tableName,table) -> {
			try {
				//表定义转化为实体java类
				TransTableToBean.transTableToBean(table);
				
				//TODO 表定义转化为dao
				
				//TODO 表定义转化为mapper
				
				//TODO 表定义转化为serv
			} catch (IOException e) {
				e.printStackTrace();
			}
		});
	}
}
