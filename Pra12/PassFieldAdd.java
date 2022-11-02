import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class PassFieldAdd extends JFrame implements ActionListener
{
	JTextField txt1,txt2;
	JLabel lbl1,lbl2;
	JButton btnAdd,btnExit;
	PassFieldAdd()
	{
	Container c =getContentPane();
	c.setLayout(new GridLayout(3,2,20,20));
	
	lbl1=new JLabel("Enter first number");
	c.add(lbl1);
	
	lbl1=new JLabel("Enter first number");
	c.add(lbl2);
	
	txt1=new JTextField(20);
	c.add(txt1);
	
	txt2=new JTextField(20);
	c.add(txt2);
	
	btnAdd=new JButton("Add");
	c.add(btnAdd);
	
	btnExit=new JButton("EXIT");
	c.add(btnExit);
	
	btnAdd.addActionListener(this);
	btnExit.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnExit)
		{
			System.exit(0);
		}
		else if(ae.getSource()==btnAdd)
		{
			int iNum1=;
			int iNum2=;
			
		}

	}
	public static void main(String args[])
	{
		PassFieldAdd op = new PassFieldAdd();
		op.setTitle("JPasswordField demo......");
		op.setSize(400,400);
		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		op.setVisible(true);
	}

}
