import java.awt.*;
import java.awt.event.*;
class Calculator extends Frame
{
	TextField txt1,txt2;
	Button btnClr,btnNine,btnEight,btnSeven,btnSix,btnFive,btnFour,btnThree,btnTwo,btnOne,btnAdd,btnSub,btnMul,btnDiv,btnEqual,btnZero;
	
	Calculator()
	{
		setLayout(new GridLayout(6,3,20,20));
		int iCount=9;
		txt1=new TextField();
		add(txt1);
		
		txt2=new TextField();
		add(txt2);
		
		btnClr=new Button("Clear");
		add(btnClr);
		
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<3;j++)
			{
				add(new Button(""+iCount));
				if(iCount==10)
				{
					break;
				}
				iCount--;
			}
		}
		
		btnEqual=new Button("=");
		add(btnEqual);
		
		btnAdd=new Button("+");
		add(btnAdd);
		
		btnSub=new Button("-");
		add(btnSub);
		
		btnMul=new Button("*");
		add(btnMul);
		
		btnDiv=new Button("/");
		add(btnDiv);
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we)
			{
               System.exit(0);
			}
		});
	}
		
	public static void main(String args[])
    {
        Calculator demo=new Calculator();
        demo.setTitle("Simple Calculator Demo....");
        demo.setSize(400,400);
        demo.setVisible(true);
    }
  }
		
	
		
		
