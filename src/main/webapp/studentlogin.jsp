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
            <a href="adminlogin.jsp">Admin Login</a>
            <a href="studentlogin.jsp">Student Login</a>
        </header>
        <section>
           
            <h1>Student Login Here</h1>
            <hr>
            <br>
            <form action="StudentLoginServlet" method="post">
                <input type="text" name="txtuser" placeholder="Enter UserId" />
                <br>
                <br>
                <input type="text" name="txtpass" placeholder="Enter Password" />
                <br>
                <br>
                <input type="submit" value="Login" />
                
                
            </form>
            <br>
            <br>
            
            <a href="studentregister.jsp" class="myfirst" >New Student Register Here</a>
           
            
            
            
        </section>
        <footer>
            
        </footer>
    </body>
</html>