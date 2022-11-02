import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class CardLayoutExample extends JFrame implements ActionListener
{
	CardLayout card;
	Container c;
	JButton b1,b2,b3;
	CardLayoutExample()
	{
		c=getContentPane();
		card=new CardLayout(10,30);
		c.setLayout(card);
		
		b1=new JButton("Apple");
		b2=new JButton("Boy");
		b3 =new JButton("Cat");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		c.add("a",b1);
		c.add("b",b2);
		c.add("c",b3);
		
		addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent ie)
            {
                System.exit(0);
            }
        });
     }
		public void actionPerformed(ActionEvent ae)
		{
		 card.next(c);
		}
		 public static void main(String args[])
		 {
		  CardLayoutExample c1=new CardLayoutExample();
		  c1.setSize(400,400);
		  c1.setVisible(true);
		  c1.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  
		 }
}
		 
