import java.net.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class URLContentDemo extends JFrame implements ActionListener
{
	JTextField txtHost;
	JTextArea txtData;
	JButton btnGet;
	URLContentDemo()
	{
		Container c =getContentPane();
		c.setLayout(null);
		
		JLabel lbl1=new JLabel("Enter URL:");
		lbl1.setBounds(40,50,80,30);
		c.add(lbl1);
		
		txtHost=new JTextField(20);
		txtHost.setBounds(120,50,160,30);
		c.add(txtHost);
		
		btnGet=new JButton("GET");
		btnGet.setBounds(290,50,100,30);
		c.add(btnGet);
		
		txtData=new JTextArea(20,20);
		txtData.setBounds(40,100,320,150);
		c.add(txtData);
		
		btnGet.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			URL oU=new URL(txtHost.getText());
			URLConnection con=oU.openConnection();
			
			txtData.setText("");
			txtData.append("Date:"+new Date(con.getDate())+"\n");
			txtData.append("Content Length:"+con.getContentLength()+"\n");
			txtData.append("Content Type:"+con.getContentType()+"\n");
			
		}
		catch (Exception e)
		{
			txtData.append(e.getMessage());
		}
	}
	public static void main(String args[])
	{
		URLContentDemo d= new URLContentDemo();
		d.setTitle("URL connection Demo...");
		d.setSize(400,400);
		d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		d.setVisible(true);
	}
}
