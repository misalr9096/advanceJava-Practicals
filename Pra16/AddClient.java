import java.net.*;
import java.io.*;
class AddClient
{
	public static void main(String args[])
	{
		Socket oClient=null;
		try
		{
			oClient=new Socket("localhost",4814);
			System.out.println("Server is connected.....");
			
			System.out.println("Please enter two numbers:");
			DataInputStream dataIn=new DataInputStream(System.in);
			int iNum1=Integer.parseInt(dataIn.readLine());
			int iNum2=Integer.parseInt(dataIn.readLine());
		
			DataOutputStream dataOut=new DataOutputStream(oClient.getOutputStream());
			dataOut.writeUTF(String.valueOf(iNum1));
			dataOut.writeUTF(String.valueOf(iNum2));
			
			DataInputStream dataInput=new DataInputStream(oClient.getInputStream());
			System.out.println(dataInput.readUTF());
			oClient.close();
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
