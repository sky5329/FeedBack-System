package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

import model.User;

public class DAO 
{

	public User insert(User u1) 
	{
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded successfully");
		
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback system","root","root");
			System.out.println("Connection success");
		
			//prepared statement 
			//argument required 
			PreparedStatement pstmt= con.prepareStatement("insert into reg values(?,?,?,?)");//not complicated as stmt
		
			pstmt.setString(1, u1.getRegid());
			pstmt.setString(2,u1.getPassword());
			pstmt.setString(3, u1.getEmail());
			pstmt.setString(4, u1.getMobile());
   
			pstmt.executeUpdate();//executeUpdate with no argument 
			System.out.println("1 Row inserted by preparedStatement");
        
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
		
		return u1;
		
		
	}

	public User validate(User u1) 
	{
		int flag=0;
		try 
		{
            
           
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback system","root","root");
            java.sql.Statement  st = con.createStatement();
            ResultSet x = st.executeQuery("select * from `reg`  where `regid`='"+u1.getRegid()+"' and password= '"+u1.getPassword()+"'");
            if(x.next())
            {
            	flag=1;
            }
              
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
		if(flag==1)
		{
			return u1;

		}
		else
		{
			return null;
		}
    }
		
		
	
	

}
