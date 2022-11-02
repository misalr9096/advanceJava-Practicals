import java.util.*;
import java.net.*;
import java.io.*;
class EvenServer
{
	public static void main(String args[])
	{
		Socket oClient=null;
		try
		{
			ServerSocket oServer=new ServerSocket(4814);
	
				System.out.println("Server is wating for client.....");
				oClient=oServer.accept();
				System.out.println("Client Connected....");
				
				DataInputStream dataIn=new DataInputStream(oClient.getInputStream());
				
				String strTemp=dataIn.readUTF();
				int iNo=Integer.parseInt(strTemp);
				
				DataOutputStream dataOut=new DataOutputStream(oClient.getOutputStream());
				if(iNo%2==0)
				{
					dataOut.writeUTF("Given Number  "+iNo+"  is Even");
				}
				else
				{
					dataOut.writeUTF("Given Number  "+ iNo +"  is Odd");
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
