import java.io. *;
import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

public class URLData extends  JFrame implements ActionListener
{
	JTextField txtHost;
	JTextArea txtData;
	JButton btnGet;

	URLData()
	{
		Container oPane=getContentPane();
		oPane.setLayout(null);
		
		JLabel lbl1=new JLabel("Enter URL:");
		lbl1.setBounds(40,50,100,30);
		oPane.add(lbl1);
		
		txtHost=new JTextField();
		txtHost.setBounds(165,50,100,30);
		oPane.add(txtHost);
		
		btnGet=new JButton("Get");
		btnGet.setBounds(290,50,70,30);
		oPane.add(btnGet);
		
		txtData=new JTextArea();
		txtData.setBounds(40,100,320,150);
		oPane.add(txtData);
		txtData.setEditable(false);
		
		btnGet.addActionListener(this);   
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{			
			InetAddress ip=InetAddress.getByName(txtHost.getText());
			txtData.setText("");
			txtData.append("host Name:"+ip.getHostName()+"\n");
			txtData.append("IP Address:"+ip.getHostAddress()+"\n");
			txtData.append("Address:"+ip.getByName(txtHost.getText())+"\n");
			
		}
		catch(Exception e)
		{
			txtData.append(e.getMessage());
		}
	}
	
		public static void main(String arg[])
		
		{
			URLData url=new URLData();
			url.setTitle("URL Data....");
			url.setSize(400,300);
			url.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			url.setVisible(true);
	
		}
}
