import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class MouseDemo extends JFrame implements MouseListener
{
	JLabel lbl;
	MouseDemo()
	{
		Container c=getContentPane();
		c.setLayout(null);
		
		lbl=new JLabel("Helo Mouse");
		lbl.setBounds(50,150,200,100);
		c.add(lbl);
		
		lbl.addMouseListener(this);
		}
		public void mouseClicked(MouseEvent me)
		{
		
			lbl.setText("Mouse Clicked(# of Clicks:"+me.getClickCount());
			
		}
		public void mouseEntered(MouseEvent me)
		{
			lbl.setText("Mouse Entered");
		}
		public void mouseExited(MouseEvent me)
		{
			lbl.setText("Mouse Exited");
		}
		public void mousePressed(MouseEvent me)
		{
			lbl.setText("Mouse pressed no.Clicks:"+me.getClickCount()+"at Position"+me.getX()+","+me.getY());
		}
		public void mouseReleased(MouseEvent me)
		{
			lbl.setText("Mouse Released;# of Clicks:"+me.getClickCount());
		}
		public static void main(String arg[])
		{
		MouseDemo oM=new MouseDemo();
		oM.setTitle("Mouse Event Demo...");
		oM.setSize(400,400);
		oM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oM.setVisible(true);
		}
}
