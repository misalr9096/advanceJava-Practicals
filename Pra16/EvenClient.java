import java.net.*;
import java.io.*;
class EvenClient
{
	public static void main(String args[])
	{
		Socket oClient=null;
		try
		{
			oClient=new Socket("localhost",4814);
			System.out.println("Server is connected.....");
				
			DataInputStream dataIn=new DataInputStream(System.in);
			System.out.println("Please enter the Number:");
			int iNum=Integer.parseInt(dataIn.readLine());
			
			DataOutputStream dataOut=new DataOutputStream(oClient.getOutputStream());
			dataOut.writeUTF(String.valueOf(iNum));
			
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
