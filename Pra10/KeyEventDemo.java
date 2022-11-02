import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeyEventDemo extends JFrame implements KeyListener
{
	String strMsg;
	KeyEventDemo()
	{
		strMsg="";
		addKeyListener(this);	
	}
	public void keyPressed(KeyEvent ke)
	{
		strMsg="Key Pressed";
		repaint();
	}
	public void keyReleased(KeyEvent ae)
	{	
		strMsg="Key Released";
		repaint();
	}
	public void keyTyped(KeyEvent ae)
	{	
		strMsg="Key Typed";
		repaint();
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString(strMsg,100,100);
	}
	public static void main(String args[])
	{
		KeyEventDemo oKE=new KeyEventDemo();
		oKE.setTitle("KeyEvent Demo................");
		oKE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oKE.setSize(400,400);
		oKE.setVisible(true);
	}	
}
