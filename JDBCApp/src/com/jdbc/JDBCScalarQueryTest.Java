package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCScalarQueryTest {

	public static void main(String[] args) {
		//global objects
		Connection con = null;
		Statement st = null;
        Result rs = null;
		
		try {
			//1.load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.Establish connection
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/amazon",
					"root",
					"root");
			
			//3.Prepare query
			String qry = "select max(price) from product";  //scalar query
			
			//4.Create statement (Vehicle)
			st = con.createStatement();
			
			//5.Execute and process result
			rs = st.executeString(qry);
			
			//Business logic
			while()
{
System.out.println("");
}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				st.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}

}
