package com.zpke.transformers.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.zpke.transformers.context.ConfigContext;


/**
 * 基础的数据库增删改查的功能 以及连接 和释放资源工具类
 * @author 28564
 *
 */
public class BaseDao {
	
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	static String driver = "";
	static String url = "";
	static String username = "";
	static String password = "";
	
	
	static {//数据库相关设置冲环境变量中读取
		driver = ConfigContext.getInstance().getDriver();
		url = ConfigContext.getInstance().getUrl();
		username = ConfigContext.getInstance().getUser();
		password = ConfigContext.getInstance().getPassword();
	}
	
	
	/**
	 * 获得数据量链接
	 * @return
	 */
	public boolean getConnection() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return true;
	}

	
	/**
	 * 
	 * 关闭资源
	 * @return
	 */
	public boolean closeResource() {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return true;

	}

	/**
	 * 更新操作
	 * @param sql
	 * @param params
	 * @return
	 */
	public int executeUpdate(String sql, Object[] params) {
		int execute = 0;
		if (this.getConnection()) {
			try {
				ps = conn.prepareStatement(sql);
				if(params != null) {
					for (int i = 0; i < params.length; i++) {
						ps.setObject(i + 1, params[i]);
					}
				}
				execute = ps.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return execute;
	}

	/**
	 * 查询操作
	 * @param sql
	 * @param params
	 * @return
	 */
	public ResultSet query(String sql, Object[] params) {
		if (this.getConnection()) {
			try {
				ps = conn.prepareStatement(sql);
				if(params != null) {
					for (int i = 0; i < params.length; i++) {
						ps.setObject(i + 1, params[i]);
					}
				}
				rs = ps.executeQuery();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}
}
