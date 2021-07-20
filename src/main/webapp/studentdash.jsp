<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
       <meta charset="ISO-8859-1">
        <title>JSP Page</title>
        <link href="style.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <header>
            <a href="index.jsp">Home</a>
            <a href="studentlogin.jsp">Logout</a>
        </header>
        <section>
            <h1>Welcome in StudentDashboard</h1>
            
            <h1>Feedback Submission Form</h1>
            <hr>
            <br>
            <form action="FeedBackServlet" method="post">
                <input type="text" name="txtbatch" placeholder="Enter Batchname" />
                <br>
                <br>
                <input type="text" name="txtname" placeholder="Enter Facultyname" />
                <br>
                <br>
                 <input type="text" name="txtdesc" placeholder="Enter Description" />
                <br>
                <br>
                 <input type="number" name="txtrate" placeholder="Feedback rate 1 for good,2 average and 3 for poor" />
                <br>
                <br>
                <input type="submit" value="Submit" />
                
                
            </form>
            
            <%
                
              if(request.getParameter("s")!=null)
              {
                  out.print(request.getParameter("s"));
              }
                
                
                
                
           %>
            <br>
            <br>
            <a href="viewfeed.jsp">View FeedBack Here</a>
            
           
        </section>
        <footer>
            
        </footer>
    </body>
</html>