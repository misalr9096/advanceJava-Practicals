import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
class WordCount extends JFrame implements ActionListener
{
	JTextArea txtArea;
	JLabel lbl;
	JTextField txt;
	JButton btnCount,btnExit;
	WordCount()
	{
	Container c =getContentPane();
	c.setLayout(null);
	
	txtArea=new JTextArea();
	txtArea.setBounds(50,50,100,100);
	c.add(txtArea);
	
	lbl=new JLabel("Word Count=");
	lbl.setBounds(50,160,100,30);
	c.add(lbl);
	
	txt=new JTextField(20);
	txt.setBounds(150,160,50,30);
	txt.setEditable(false);
	c.add(txt);
	
	btnCount=new JButton("Count");
	txt.setBounds(210,160,50,30);
	c.add(btnCount);
	
	btnExit=new JButton("EXIT");
	txt.setBounds(240,180,50,30);
	c.add(btnExit);
	
	btnCount.addActionListener(this);
	btnExit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnExit)
		{
			System.exit(0);
		}
		else if(ae.getSource()==btnCount)
		{
			String str=txtArea.getText();
			StringTokenizer token = new StringTokenizer(str);
			txt.setText(String.valueOf(token.countTokens()));
		}

	}
	public static void main(String args[])
	{
		WordCount op = new WordCount();
		op.setTitle("JPasswordField demo......");
		op.setSize(400,400);
		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		op.setVisible(true);
	}

}
