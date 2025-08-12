package com.facebook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class RegisterDBsrv
 */
@WebServlet("/RegisterDBsrv")
public class RegisterDBsrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterDBsrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//General settings
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		//Request data gathering logic
		String uname = request.getParameter("username");
		String pwd = request.getParameter("password");
		String dob = request.getParameter("dateofbirth");
		String gen = request.getParameter("gender");
		String qua = request.getParameter("qualification");
		
		//persistance logic
		//global object
		Connection con = null;
		PreparedStatement ps = null;
		try {
			
			//1.load driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.establish connection
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/facebook",
					"root",
					"root");
			
			//3.prepare query
			String qry = "insert into users values(?,?,?,?,?)"; //?-place holders
			
			//4.statement object (Vehicle)
			ps = con.prepareStatement(qry);
			
			//set values
			ps.setString(1, uname);
			ps.setString(2, pwd);
			ps.setString(3, dob);  //  ps.setDate(3,java.sql.Date.valueOf(dob))
			ps.setString(4, gen);
			ps.setString(5, qua);
			
			//5.execute and process result
			int res = ps.executeUpdate();
			
			//business logic
			if(res!=0) {
				pw.println("ThankYou For Registering");
			}
			else
			{
				pw.println("something went wrong");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
