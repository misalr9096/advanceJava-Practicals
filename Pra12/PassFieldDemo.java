import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class PassFieldDemo extends JFrame implements ActionListener
{
	JTextField txt;
	JPasswordField pass;
	JButton btnLogin,btnExit;
	PassFieldDemo()
	{
	Container c =getContentPane();
	c.setLayout(null);
	
	txt=new JTextField(20);
	txt.setBounds(50,50,100,30);
	c.add(txt);
	
	pass=new JPasswordField();
	pass.setBounds(180,50,100,30);
	pass.setEchoChar('#');
	c.add(pass);
	
	btnLogin=new JButton("LOGIN");
	btnLogin.setBounds(50,100,100,30);
	c.add(btnLogin);
	
	btnExit=new JButton("EXIT");
	btnExit.setBounds(180,100,100,30);
	c.add(btnExit);
	
	btnLogin.addActionListener(this);
	btnExit.addActionListener(this);
	};
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnExit)
		{
			System.exit(0);
		}
		else if(ae.getSource()==btnLogin)
		{
			String strtxt="Rutuja";
			String strtxt1=txt.getText();
			
			
			String strPass="@123";
			String strPass1=pass.getText();
			
			if(strtxt.equals(strtxt1) && strPass.equals(strPass1))
			{
				JOptionPane.showMessageDialog(this,"Login Sucessfully.........","Login",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Login Failed.........","Failed",JOptionPane.INFORMATION_MESSAGE);
			}
		}

	}
	public static void main(String args[])
	{
		PassFieldDemo op = new PassFieldDemo();
		op.setTitle("JPasswordField demo......");
		op.setSize(400,400);
		op.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		op.setVisible(true);
	}
	
	public Insets getInsets()
	{
		return new Insets(50,50,20,20);
	}
}
