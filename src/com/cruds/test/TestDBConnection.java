package com.cruds.test;

import java.sql.Connection;

import com.cruds.db.DBConnectionManager;

public class TestDBConnection {

	public static void main(String[] args) {
		
		Connection conn = DBConnectionManager.getConnection();
		if(conn !=null)
		{
			System.out.println("Connection Successful");
		}

	}

}
