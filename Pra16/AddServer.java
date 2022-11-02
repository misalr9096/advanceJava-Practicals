import java.util.*;
import java.net.*;
import java.io.*;
class AddServer
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
				
				String strTemp1=dataIn.readUTF();
				String strTemp2=dataIn.readUTF();
				int iNo1=Integer.parseInt(strTemp1);
				int iNo2=Integer.parseInt(strTemp2);
				
				DataOutputStream dataOut=new DataOutputStream(oClient.getOutputStream());
				int add=iNo1+iNo2;
				dataOut.writeUTF("Addition= "+String.valueOf(add));
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
