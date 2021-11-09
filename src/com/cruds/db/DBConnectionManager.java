package com.cruds.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cruds.exception.StudentException;

public class DBConnectionManager {

	static
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection()
	{
		Connection conn = null;
		
		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studdb","root", "chandan@123");
		}catch (SQLException e){
			e.printStackTrace();
			throw new StudentException("Error Occurs during DB Connection,contact Admin");
		}
		return conn;
	}
}
