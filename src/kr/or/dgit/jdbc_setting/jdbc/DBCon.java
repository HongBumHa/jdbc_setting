package kr.or.dgit.jdbc_setting.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class DBCon {
	private static final DBCon instance = new DBCon();
	
	public static DBCon getInstance() {
		return instance;
	}

	public Connection getConnection() {
		return connection;
	}

	private Connection connection;
	private DBCon(){
		Properties properties = getProperties("conf.properties");
		System.out.println(properties.getProperty("user"));
		System.out.println(properties.getProperty("pwd"));
		System.out.println(properties.getProperty("url"));
		
	}

	private Properties getProperties(String propertiesPath) {
		Properties properties = new Properties();
		InputStream is = ClassLoader.getSystemResourceAsStream(propertiesPath);
		try {
			properties.load(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
	
}
