import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class StringCount extends JFrame implements ActionListener
{
	JButton btnCount,btnExit;
	JTextField txtStr,txtCount;
	StringCount()
	{
		Container c=getContentPane();
		c.setLayout(new GridLayout(3,2,20,20));
		
		JLabel lblStr=new JLabel("Enter String:");
		c.add(lblStr);
		
		txtStr =new JTextField(50);
		c.add(txtStr);
		txtStr.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent ke)
			{
				if(ke.getKeyCode()==KeyEvent.VK_ESCAPE)
				{
					System.exit(0);
				}
				else if(ke.getKeyCode()==KeyEvent.VK_ENTER)
				{
					strLength();	
				}
			}
		});
		
		JLabel lblCount=new JLabel("String Count is:");
		c.add(lblCount);
		
		txtCount =new JTextField(50);
		txtCount.setEditable(false);
		c.add(txtCount);
		
		btnCount =new JButton("Count");
		c.add(btnCount);
		
		btnExit=new JButton("Exit");
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
			strLength();
		}
	}
	public void strLength()
	{
			String str=txtStr.getText();
			int iCount=0;
			for(char ch:str.toCharArray())
			{
				iCount++;
			}
			txtCount.setText(String.valueOf(iCount));
	}	
	public static void main(String args[])
	{
		StringCount oSC=new StringCount();
		oSC.setTitle("String count Demo.....");
		oSC.setSize(400,400);
		oSC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oSC.setVisible(true);
	}
}
		
