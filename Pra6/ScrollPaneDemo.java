import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ScrollPaneDemo extends JFrame implements ActionListener
{
	ImageIcon img;
	ScrollPaneDemo()
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		img=new"";
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(20,20,20,20));
		int iCount =1;
		for (int i=0;i<20;i++)
		{
			for (int j=0;j<20;j++)
			{
				panel.add(new JButton("Button"+iCount));
				iCount++;
			}
		}
		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane scroll=new JScrollPane(panel,v,h);
		c.add(scroll,BorderLayout.CENTER);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==Button1)
		{
			img=
	}
	public static void main(String args[])
    {
        ScrollPaneDemo demo=new ScrollPaneDemo();
        demo.setTitle("Simple Scroll Pane Demo....");
        demo.setSize(400,400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
		
		
		
