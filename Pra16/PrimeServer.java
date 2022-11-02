import java.util.*;
import java.net.*;
import java.io.*;
class PrimeServer
{
	public static void main(String args[])
	{
		Socket oClient=null;
		try
		{
			ServerSocket oServer=new ServerSocket(4811);
			
			while(true)
			{
				System.out.println("Server is wating for client.....");
				oClient=oServer.accept();
				System.out.println("Client Connected....");
				
				DataInputStream dataIn=new DataInputStream(oClient.getInputStream());
				
				String strTemp=dataIn.readLine();
				int iNo=Integer.parseInt(strTemp);
				
				DataOutputStream dataOut=new DataOutputStream(oClient.getOutputStream());
				if((iNo/2!=0 || iNo/3!=0 || iNo/5!=0 || iNo/7!=0) && (iNo==2|| iNo==3|| iNo==5|| iNo==7))
				{
					dataOut.writeUTF("Given Number"+iNo+"is Prime");
				}
				else
				{
					dataOut.writeUTF("Given Number"+iNo+"is not Prime");
				}
			}					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			if(oClient!=null)
			{
				try
				{
					oClient.close();
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		}
	}
}
