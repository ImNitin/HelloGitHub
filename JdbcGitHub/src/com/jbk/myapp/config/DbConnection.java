package com.jbk.myapp.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	
	public static Connection getConnection(){
		
		Connection connection=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adv_java", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return connection;
	}
}
