
package controller;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
public class FeedBackServlet extends HttpServlet 
{

	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException 
	{
    
       
        
            String batch= request.getParameter("txtbatch");
            String name= request.getParameter("txtname");
            String desc= request.getParameter("txtdesc");
            String rate= request.getParameter("txtrate");
            try 
            {
            	Class.forName("com.mysql.jdbc.Driver");
            	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback system","root","root");
            	Statement st = con.createStatement();
            	int x = st.executeUpdate("INSERT INTO `feedback` (`batchname`, `facultyname`, `feeddesc`, `rate`) VALUES ('"+batch+"', '"+name+"', '"+desc+"', '"+rate+"')");
            	if(x!=0)
            	{
                response.sendRedirect("studentdash.jsp?s=Feedback submitted ");
            	}
            }
            catch(Exception e)
            {
            	e.printStackTrace();
            }
            
           
      
    }
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}


    
}