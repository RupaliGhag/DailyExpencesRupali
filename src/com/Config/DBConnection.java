package com.Config;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnect()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rupali", "root", "root");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
	{

	}

}
