package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCDeleteTest {
	public static void main(String[] args) {
		//global objects
		Connection con = null;
		Statement st = null;
		
		try {
			//1.load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.Establish connection
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/amazon",
					"root",
					"root");
			
			//3.Prepare query
			String qry = "DELETE FROM product WHERE pid=2002;";
			
			//4.Create statement (Vehicle)
			st = con.createStatement();
			
			//5.Execute and process result
			int result = st.executeUpdate(qry);
			
			//Business logic
			if(result!=0) {
				System.out.println("Record deleted");
			}
			else {
				System.out.println("Record Notdeleted");
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
