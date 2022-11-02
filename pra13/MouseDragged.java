import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MouseDragged extends JFrame
{
	JButton btnComponent;
	MouseDragged()
	{
		Container c=getContentPane();
		c.setLayout(null);
		
		btnComponent =new JButton("Component");
		btnComponent.setBounds(100,100,150,30);
		c.add(btnComponent);
		
		addMouseMotionListener(new MyAdapter());
	}
		class MyAdapter extends MouseMotionAdapter
		{
			public void mouseDragged(MouseEvent me)
			{
				btnComponent.move(me.getX(),me.getY());
			}
		}
		
		public static void main(String args[])
		{
			MouseDragged oM=new MouseDragged();
			oM.setTitle("Mous e Demo.....");
			oM.setSize(400,400);
			oM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			oM.setVisible(true);
		}
}		
