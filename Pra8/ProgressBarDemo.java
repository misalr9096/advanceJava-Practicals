import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ProgressBarDemo extends JFrame
{
	JProgressbar progress;
	int iCount;
	ProgressBarDemo()
	{
		Container c=getContentPane();
		c.setLayout(null);
		
		progress=new JProgressbar(SwingConstants.HORIZONTAL,0,2000);
		progress.setBounds(50,100,300,30);
		c.add(progress);
		progress.setStringPainted(true);
		
	}
	
	public static void main(String args[])
    {
        ProgressBarDemo demo=new ProgressBarDemo();
        demo.setTitle("  Progress Bar Demo....");
        demo.setSize(400,400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
