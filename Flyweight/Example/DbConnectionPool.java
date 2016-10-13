package com.moon.jdbc;
import java.sql.Connection;
import java.sql.SQLException;
public interfacce DbConnectionPool{
	/**
	*设定连接池中存放连接的数目
	*@param numConnections
	*/
	public void setMaxConns(int numConnections);
	/**
	*设定打开或者关闭连接池
	*@param onOroff
	*@throws Exception
	*/
	public void setConnSwitch(String onOroff) throws Exception;
		/**
	*产生连接池
	*@throws SQLException
	*/
	public void initConnPool() throws SQLException;
		/**
	*从连接池中获取连接
	*@return
	*@throws SQLException
	*/
	public Connection getConnection() throws SQLException;
		/**
	*将连接返回给连接池
	*@throws SQLException
	*/
	public void returnConnection() throws SQLException;
		/**
	*销毁连接池
	*@throws SQLException
	*/
	public void destroyConnPool() throws SQLException;

}