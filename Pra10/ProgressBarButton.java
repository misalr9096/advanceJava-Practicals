import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ProgressBarButton extends JFrame implements ActionListener
{
	int iCount;
	JProgressBar pbData;
	JButton btnProgress;
	ProgressBarButton()
	{
		iCount=0;
		Container oPane=getContentPane();
		oPane.setLayout(null);
		
		pbData=new JProgressBar(SwingConstants.HORIZONTAL,0,2000);
		pbData.setBounds(50,100,300,30);
		pbData.setStringPainted(true);
		oPane.add(pbData);
		
		btnProgress=new JButton("Progress");
		btnProgress.setBounds(150,150,100,30);
		oPane.add(btnProgress);
		
		btnProgress.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		iCount+=50;
		pbData.setValue(iCount);
		
	}
	public static void main(String args[])
	{
		ProgressBarButton oPB=new ProgressBarButton();
		oPB.setTitle("ProgressBar Demo................");
		oPB.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		oPB.setSize(400,400);
		oPB.setVisible(true);
	}	
}
