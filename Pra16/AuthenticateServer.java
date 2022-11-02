import java.io.*;
import java.net.*;

class AuthenticateServer
{
	public static void main(String arg[]) 
	{
		ServerSocket oServer=null;
		Socket oClient=null;
		try
		{
			oServer=new ServerSocket(2040);
			System.out.println("Server is Waiting for Client....");
			oClient=oServer.accept();
			System.out.println("Client Connected....");
			
			DataInputStream oIn=new DataInputStream(oClient.getInputStream());
			DataOutputStream out=new DataOutputStream(oClient.getOutputStream());
			String strUser=oIn.readUTF();
			String strPass=oIn.readUTF();
			
			if(strUser.equals("KPC") && strPass.equals("Kpc@123"))
			{
				out.writeUTF("The client is Authenticated....");
			}
			else
			{
				out.writeUTF("The client is Not Authenticated....");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
