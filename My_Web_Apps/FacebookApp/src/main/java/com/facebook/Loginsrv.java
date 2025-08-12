package com.facebook;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Loginsrv
 */
@WebServlet("/Loginsrv")
public class Loginsrv extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Loginsrv() {
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
		
		
		//Business logic
		if(uname.equals("Meghana") && pwd.equals("Meghana123")) {
			pw.println("Welcome"+" "+uname);
		}
		else {
			pw.println("Login fail");
		}
		
		//close objects
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
