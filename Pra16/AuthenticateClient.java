import java.io.*;
import java.net.*;

class AuthenticateClient
{
	public static void main(String arg[]) 
	{
		Socket oClient=null;
		try
		{
			//InetAddress oAdd=InetAddress.getLocalHost();
			oClient=new Socket("localhost",2040);
			System.out.println("Server Connected....");
			
			DataInputStream inObj=new DataInputStream(System.in);
			DataOutputStream out=new DataOutputStream(oClient.getOutputStream());
			System.out.println("Enter User Name....");
			out.writeUTF(inObj.readLine());
			System.out.println("Enter Password....");
			out.writeUTF(inObj.readLine());
			
			DataInputStream oIn=new DataInputStream(oClient.getInputStream());
			
			System.out.println(oIn.readUTF());
	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
