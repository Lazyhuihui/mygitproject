package com.huihui.jdbc;

public class DbNodeConfig {

	String ip;
	String dbName;
	String userName;
	String password;
	String driverClass;
	int minPoolSize;
	int maxPoolSize;
	int checkOutTimeOut;
	int maxIdleTime;
	String testSql;
	boolean testConnOnCheckin;
}
