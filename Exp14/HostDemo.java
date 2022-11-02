import java.io. *;
import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

public class HostDemo extends  JFrame implements ActionListener
{
	JTextField txtHost;
	JTextArea txtData;
	JButton btnGet;

	HostDemo()
	{
		Container oPane=getContentPane();
		oPane.setLayout(null);
		
		JLabel lbl1=new JLabel("Enter Host Name:");
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
			txtData.append("IP Address:"+ip.getHostAddress()+"\n");
		}
		catch(Exception e)
		{
			txtData.setText(e.getMessage());
		}
	}
	public static void main(String arg[])
	{
		HostDemo hd=new HostDemo();
		hd.setTitle("HostDemo....");
		hd.setSize(400,300);
		hd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hd.setVisible(true);
	
	}
}
