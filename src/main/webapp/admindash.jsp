<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.sql.*" %>
 
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
            <a href="adminlogin.jsp">Logout</a>
        </header>
        <section>
            <h1>Welcome in Admin Dashboard</h1>
            
            <h1>View Feedback Data</h1>
            <hr>
            <br>
            <table border="1" width="700">
                <tr><th>ID</th><th>BATCH</th><th>FACULTY</th><th>DESC</th><th>Rating</th></tr>
            <%
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback system","root","root");
            Statement st = con.createStatement();
            ResultSet x = st.executeQuery("select * from `feedback`"); 
            while(x.next())
            {
                out.print("<tr><td>"+x.getInt(1)+"</td><td>"+x.getString(2)+"</td><td>"+x.getString(3)+"</td><td> "+x.getString(4)+"</td><td> "+x.getInt(5)+"</td><tr>");
            }
                
               %>
            
         
                </table>
        </section>
        <footer>
            
        </footer>
    </body>
</html>