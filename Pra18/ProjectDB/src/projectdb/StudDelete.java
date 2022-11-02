import java.sql.*;
import java.io.*;
public class StudDelete
{
	public static void main(String args[])
	{
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loadded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student?useSSL=false","root","root");
			System.out.println("Connection to the database created");
			
			Statement smt=con.createStatement();
                       
			String sql="delete from StudTable where RollNo=205";
			int iRow=smt.executeUpdate(sql);
                        if(iRow>0)
                        {
                            System.out.println("Row deleted....");
                        }
                        else
                        {   
                            System.out.println("Row not deleted....");
                        }
			smt.close();
			con.close();
		}
		catch(SQLException e)
		{	
		}
		catch(Exception e)
		{
		}		
	}
}