import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ProgressBarDemo extends JFrame
{
	JProgressBar progress;
	int iCount;
	ProgressBarDemo()
	{
		iCount=0;
		Container c=getContentPane();
		c.setLayout(null);
		
		progress=new JProgressBar(SwingConstants.HORIZONTAL,0,2000);
		progress.setBounds(50,100,300,30);
		c.add(progress);
		progress.setStringPainted(true);
	}
	public void showProgress()
	{
		while(true)
		{
			if(iCount<2000)
			{
				progress.setValue(iCount);
				iCount+=5;
				try
				{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
				}
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Task Completed","Progress Bar",JOptionPane.INFORMATION_MESSAGE);
				break;

			}
							progress.setValue(0);

		}
	}
			
	public static void main(String args[])
    {
        ProgressBarDemo demo=new ProgressBarDemo();
        demo.setTitle("  Progress Bar Demo....");
        demo.setSize(400,200);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        demo.showProgress();
    }
}
