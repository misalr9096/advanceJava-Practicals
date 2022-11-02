import java.sql.*;
import java.io.*;
public class StudInsert
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
                        System.out.println("************* Enter Student data ***************");
                        
                        DataInputStream oIn=new DataInputStream(System.in);
                        
                        System.out.println("Enter the roll no: ");
                        int iRoll=Integer.parseInt(oIn.readLine());
                        
                        System.out.println("Enter the Name: ");
                        String strName=oIn.readLine();
                        
                        System.out.println("Enter the Class: ");
                        String strClass=oIn.readLine();
                        
                        
                        System.out.println("Enter the Marks: ");
                        Double dMarks=Double.parseDouble(oIn.readLine());
                        
			String sql="Insert into StudTable values("+iRoll+",'"+strName+"','"+strClass+"',"+dMarks+");";
			int iRow=smt.executeUpdate(sql);
                        if(iRow>0)
                        {
                            System.out.println("Row Inserted....");
                        }
                        else
                        {   
                            System.out.println("Row not Inserted....");
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