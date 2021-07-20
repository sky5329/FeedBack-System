
package controller;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import model.User;


@SuppressWarnings("serial")
public class StudentLoginServlet extends HttpServlet 
{
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		String user= request.getParameter("txtuser");
		String pass= request.getParameter("txtpass");
		
		
		
		User u1=new User();
		u1.setRegid( user);
 		u1.setPassword(pass);
		
		db.DAO d1=new db.DAO();
		u1=d1.validate(u1);
		
		if(u1!=null)
		{
			response.sendRedirect("studentdash.jsp");
		}
		else
		{
			response.sendRedirect("studentlogin.jsp");
		}
		
		
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException
	{
		
		doGet(request, response);
	}

    
}