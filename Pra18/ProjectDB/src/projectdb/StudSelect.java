import java.sql.*;
public class StudSelect
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
			ResultSet rs=smt.executeQuery(" select * from StudTable");
			
			System.out.println("******  The student data  ******");
			while(rs.next())
			{
				System.out.println("RollNo="+rs.getInt(1));
				System.out.println("Name:"+rs.getString(2));
				System.out.println("Class:"+rs.getString(3));
				System.out.println("Matks="+rs.getFloat(4));
			}
			smt.close();
			con.close();
			rs.close();
		}
		catch(SQLException e)
		{	
		}
		catch(Exception e)
		{
		}		
	}
}