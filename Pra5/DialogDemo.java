import java.awt.*;
import java.awt.event.*;
class public DialogDemo extends Frame implement ActionListener
{
	DialogDemo()
	{
			setLayout(new GridLayout(3,2,20,20));
			Label lbl1=new Label("User Name:");
			lbl1.add();
			
			TextField txt1=new TextField();
			txt1.add();
			
			Label lbl2=new Label("Password:");
			lbl2.add();
			
			TextField txt2=new TextField();
			txt2.add();
			
			Button btn1=new Button("Login");
			btn1.add();
			
			Button btn2=new Button("Exit");
			btn2.add();
			
			btn1.addActionListener(this);
			btn2.addActionListener(this);
			
			addWindowListener(new WindowAdapter()
			{
				public void windowClosing(WindowEvent we)
				{
                System.exit(0);
				}
			});
			
			public void actionPerformed(ActionEvent ae)
			{
				if (ae.getSource()==btn2)
				{
					System.exit(0);
				}
				else if(ae.getSource()==btn1)
				{
					DialogMsg dialog =new DialogMsg(this,true);
					String str1=txt1.getText();
					String str2=txt2.getText();
					
					if(str1.equals("Rutuja"))&&str2.equals("rutu@123"))
					{
						dialog.lblMsg.setText("Login Successfully....");
					}
					else
					{
						dialog.lblMsg.setText("Login Failed....");
					}
					dialog.show();
				}
			}
		public static void main(String args[])
		{
			DialogDemo demo=new DialogDemo();
			demo.setTitle("DialogDemo....");
			demo.setSize(400,400);
			demo.setVisible(true);
		}
  }
			

						
					

			
			
			
