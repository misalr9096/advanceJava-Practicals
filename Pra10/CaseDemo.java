import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CaseDemo extends JFrame implements KeyListener
{
	JTextArea txt1,txt2;
	CaseDemo()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		txt1=new JTextArea(20,30);
		c.add(txt1);
		
		txt2=new JTextArea(20,30);
		txt2.setEditable(false);
		c.add(txt2);
		
		txt1.addKeyListener(this);
		txt2.addKeyListener(this);
		}
		public void keyPressed(KeyEvent ke)
		{
		}
		public void keyReleased(KeyEvent ke)
		{
		}
		public void keyTyped(KeyEvent ke)
		{
			char c=ke.getKeyChar();
			txt2.append(String.valueOf(c).toUpperCase());
		}
		public static void main(String arg[])
		{
		CaseDemo oC=new CaseDemo();
		oC.setTitle("Case Demo ...");
		oC.setSize(400,400);
		oC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oC.setVisible(true);
		}
}
