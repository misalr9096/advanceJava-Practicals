import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SpecialKeyDemo extends JFrame implements KeyListener
{
	String strMsg;
	SpecialKeyDemo()
	{
		strMsg="";
		addKeyListener(this);	
	}
	public void keyPressed(KeyEvent ke)
	{
		if(ke.getKeyCode()==KeyEvent.VK_F1)
		{
				strMsg="you pressed Function1 key";
		}
		else if(ke.getKeyCode()==KeyEvent.VK_F2)
			{
				strMsg="you pressed Function2 key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_F3)
			{
				strMsg="you pressed Function3 key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_F4)
			{
				strMsg="you pressed Function4 key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_F5)
			{
				strMsg="you pressed Function5 key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_F6)
			{
				strMsg="you pressed Function6 key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_F7)
			{
				strMsg="you pressed Function7 key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_F8)
			{
				strMsg="you pressed Function8 key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_F9)
			{
				strMsg="you pressed Function9 key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_F10)
			{
				strMsg="you pressed Function10 key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_F11)
			{
				strMsg="you pressed Function11 key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_F12)
			{
				strMsg="you pressed Function12 key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_DOWN)
			{
				strMsg="you pressed DOWN arrow key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_UP)
			{
				strMsg="you pressed UP arrow key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_LEFT)
			{
				strMsg="you pressed LEFT arrow key";
			}
		else if(ke.getKeyCode()==KeyEvent.VK_RIGHT)
			{
				strMsg="you pressed RIGHT arrow key";
			}
			repaint();
	}
	public void keyReleased(KeyEvent ke)
	{	
	}
	public void keyTyped(KeyEvent ke)
	{	
	}
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString(strMsg,100,100);
		
	}
	public static void main(String args[])
	{
		SpecialKeyDemo oKE=new SpecialKeyDemo();
		oKE.setTitle("KeyEvent Demo................");
		oKE.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oKE.setSize(400,400);
		oKE.setVisible(true);
	}	
}
