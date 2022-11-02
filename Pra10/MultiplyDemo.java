import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MultiplyDemo extends JFrame implements ActionListener
{
	JLabel lbl1,lbl2,lbl3;
	JTextField txt1,txt2,txt3;
	JButton btnMul;
	MultiplyDemo()
	{
		Container oPane=getContentPane();
		oPane.setLayout(null);
		
		lbl1=new JLabel("Enter the first Number:");
		lbl1.setBounds(50,50,100,30);
		oPane.add(lbl1);
		
		txt1=new JTextField();
		lbl1.setBounds(170,50,100,30);
		oPane.add(txt1);
		
		lbl2=new JLabel("Enter the second Number:");
		lbl1.setBounds(50,100,100,30);
		oPane.add(lbl2);
		
		txt2=new JTextField();
		lbl1.setBounds(50,150,100,30);
		oPane.add(txt2);
		
		lbl3=new JLabel("Enter the second Number:");
		lbl1.setBounds(170,150,100,30);
		oPane.add(lbl3);
	
		txt2=new JTextField();
		lbl1.setBounds(50,50,100,30);
		oPane.add(txt2);
		
		btnMul=new JButton("Multiply");
		lbl1.setBounds(50,50,100,30);
		oPane.add(btnMul);
		
		btnMul.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnMul)
		{
			int i=Integer.parseInt(txt1.getText());
			int j=Integer.parseInt(txt2.getText());
			
			int mul=i*j;
			
			txt3.setText(String.valueOf(mul));
		}
		else
		{
			System.exit(0);
			
		}	
	}
	public static void main(String args[])
	{
		MultiplyDemo oMD=new MultiplyDemo();
		oMD.setTitle("KeyEvent Demo................");
		oMD.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oMD.setSize(500,500);
		oMD.setVisible(true);
	}	
}
