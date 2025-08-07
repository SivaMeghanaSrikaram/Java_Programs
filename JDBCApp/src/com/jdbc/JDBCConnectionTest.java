package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionTest {

	public static void main(String[] args) {
		//global objects
		Connection con = null;
		
		try {
			//1.Register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.Establish connection
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/amazon",
					"root",
					"root");
			
			//3.Business logic
			if(con!=null) {
				System.out.println("Connection success");
			}
			else {
				System.out.println("Connection fail");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} //finally
	
	} //main

} //class
