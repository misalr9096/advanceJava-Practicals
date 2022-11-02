import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Draw extends JFrame implements MouseListener,MouseMotionListener
{
	int iX1,iY1,iX2,iY2;
	Draw()
	{
		iX1=0;
		iY1=0;
		iX2=0;
		iY2=0;
		Container c=getContentPane();
		c.setLayout(null);
		
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	public void mouseClicked(MouseEvent me)
	{
	}
	public void mouseEntered(MouseEvent me)
	{	
	}
	public void mouseExited(MouseEvent me)
	{	
	}
	public void mousePressed(MouseEvent me)
	{	
		iX1=me.getX();
		iY1=me.getY();
	}
	public void mouseReleased(MouseEvent me)
	{
		
	}
	public void mouseDragged(MouseEvent me)
	{
	}
	public void mouseMoved(MouseEvent me)
	{	
	
		iX2=me.getX();
		iY2=me.getY();
		Graphics g=this.getGraphics();
		g.setColor(Color.RED);
		g.drawRect(iX1,iY1,iX1-iY1,iX2-iY2);
		iX1=iY1;
		iX2=iY2;
	}
	public static void main(String arg[])
	{
		Draw oF=new  Draw ();
		oF.setTitle("Draw");
		oF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oF.setVisible(true);
	}
}
