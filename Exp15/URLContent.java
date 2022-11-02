import java.io. *;
import java.awt.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

class URLContent extends  JFrame implements ActionListener
{
	JTextField txtHost;
	JTextArea txtData;
	JButton btnGet;

	URLContent()
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
			URL hp=new URL(txtHost.getText());
			URLConnection con=hp.openConnection();
			txtData.setText("");
			
			txtData.append("Date:"+con.getDate()+"\n");
			txtData.append("Content type:"+con.getContentType()+"\n");
			txtData.append("Content length:"+con.getContentLength()+"\n");
			
		}
		catch(Exception e)
		{
			txtData.append(e.getMessage());
		}
	}
	
		public static void main(String arg[])
		
		{
			URLContent url=new URLContent();
			url.setTitle("URL Data....");
			url.setSize(400,300);
			url.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			url.setVisible(true);
	
		}
}
