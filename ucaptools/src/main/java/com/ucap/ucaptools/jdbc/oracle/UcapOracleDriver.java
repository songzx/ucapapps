package com.ucap.ucaptools.jdbc.oracle;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import oracle.jdbc.driver.OracleDriver;

/**
 * @Title: OracleDriver.java
 * @Package com.ucap.ucaptools.database
 * @Description: 继承oracle的驱动包,解码密码
 * @author 0000
 * @date 2014年4月13日 下午11:32:47
 * @version V1.0
 */
public class UcapOracleDriver extends OracleDriver{

	@Override
	public Connection connect(String url, Properties info) throws SQLException {
		String passwd = info.getProperty("password");
		System.out.println("解密后的passwd:"+passwd);
		info.put("password", passwd+"aa");
		return super.connect(url, info);
	}

	public static void main(String[] args) throws Exception{
		Class.forName("com.ucap.ucaptools.jdbc.oracle.UcapOracleDriver").newInstance();
		Driver driver = new UcapOracleDriver();
		DriverManager.registerDriver(driver);
		System.out.println(DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.197:1521:ORCL","ucapapps","ucapapps"));
	}
}
