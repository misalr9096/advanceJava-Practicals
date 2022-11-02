import java.util.*;
import java.net.*;
import java.io.*;
class chatServer
{
	public static void main(String args[])
	{
		Socket oClient=null;
		try
		{
			ServerSocket oServer=new ServerSocket(4911);
			System.out.println("Server is wating for client.....");
			oClient=oServer.accept();
			System.out.println("Client Connected....");
			while(true)
			{
				
				DataInputStream dataIn=new DataInputStream(oClient.getInputStream());
				System.out.println(dataIn.readUTF());
				
				DataOutputStream dataOut=new DataOutputStream(oClient.getOutputStream());
				
				DataInputStream dataInput=new DataInputStream(System.in);
				System.out.println("Please enter the message:");
				dataOut.writeUTF("Server Says:"+dataInput.readLine());
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
