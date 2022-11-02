import java.util.*;
import java.net.*;
import java.io.*;
class chatClient
{
	public static void main(String args[])
	{
		Socket oClient=null;
		try
		{
			oClient=new Socket("localhost",4911);
			System.out.println("Server is connected.....");
			while(true)
			{
				
				
				
				System.out.println("Please enter the message:");
				DataInputStream dataIn=new DataInputStream(System.in);
				
				DataOutputStream dataOut=new DataOutputStream(oClient.getOutputStream());
				dataOut.writeUTF("Client Says:"+dataIn.readLine());
				
				DataInputStream dataInput=new DataInputStream(oClient.getInputStream());
				System.out.println(dataInput.readUTF());
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
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
	}
}
