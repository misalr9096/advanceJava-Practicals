import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
class MouseBGDemo extends JFrame implements MouseListener
{
	Container c;
	MouseBGDemo()
	{
		c=getContentPane();
		
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		Random oR=new Random();
		int iR=oR.nextInt(255);
		int iG=oR.nextInt(255);
		int iB=oR.nextInt(255);
		c.setBackground(new Color(iR,iG,iB));
	}
	public void mouseEntered(MouseEvent me)
	{
		
	}
	public void mouseExited(MouseEvent me)
	{
		
	}
	public void mousePressed(MouseEvent me)
	{
		
	}
	public void mouseReleased(MouseEvent me)
	{
		
	}
	public static void main(String arg[])
	{
		MouseBGDemo oMBG=new MouseBGDemo();
		oMBG.setTitle("Mouse Background Event Demo...");
		oMBG.setSize(400,400);
		oMBG.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oMBG.setVisible(true);
	}
}
