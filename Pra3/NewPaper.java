import java.awt.*;
import java.awt.event.*;
class GridDemo extends Frame 
{
    
    GridDemo()
    {
        setLayout(new GridLayout(5,5,20,20));
        int iNum=0;
        for(int i=0;i<5;i++)
		{
			for (int j=0;j<5;j++)
			{
				add(new Button("Button"+iNum));
				iNum++;
			}
		}
				
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent ie)
            {
                System.exit(0);
            }
        });
    }
    public static void main(String args[])
    {
        GridDemo oGD=new GridDemo();
        oGD.setTitle("Grid Layout Demo....");
        oGD.setSize(400,400);
        oGD.setVisible(true);
    }
}
