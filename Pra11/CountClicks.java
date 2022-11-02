import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class CountClicks extends JFrame implements MouseListener
{
	int iCount,iX,iY;
	Container c;
	CountClicks ()
	{
		iCount=0;
		iX=0;
		iY=0;
		c=getContentPane();
		c.setLayout(null);
		
		addMouseListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
		iCount++;
		iX=me.getX();
		iY=me.getY();
		repaint();	
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
	public void paint(Graphics g)
	{
		super.paint(g);
		g.drawString("Click Count="+iCount,iX,iY);
	}
	public static void main(String arg[])
	{
		CountClicks  oC=new  CountClicks ();
		oC.setTitle("Click Count  Demo...");
		oC.setSize(400,400);
		oC.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oC.setVisible(true);
	}
}
