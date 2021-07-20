
package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@SuppressWarnings("serial")
public class StudentRegisterServlet extends HttpServlet 

{
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		 String regid= request.getParameter("txtuser");
         String pass= request.getParameter("txtpass");
         String email= request.getParameter("txtemail");
         String mobile= request.getParameter("txtmobile");
         
        
         model.User u1 = new  model.User();
 		u1.setRegid(regid);
 		u1.setPassword(pass);
 		u1.setEmail(email);
 		u1.setMobile(mobile);
 		
 		
 		db.DAO d1 = new db.DAO();
 		u1=d1.insert(u1);
 		
 		if(d1.insert(u1) != null)
 		{
 			response.sendRedirect("studentlogin.jsp");
 			
 		}
 		

       
		
	}

	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}


}
