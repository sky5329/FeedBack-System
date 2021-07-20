
package controller;
import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class AdminServlet extends HttpServlet 
{

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		String user= request.getParameter("txtuser");
		String pass= request.getParameter("txtpass");
		
		
		
		if(user.equals("Akash")&& pass.equals("sky"))
		{
			response.sendRedirect("admindash.jsp");
		}
		else
		{
			response.sendRedirect("adminlogin.jsp");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}