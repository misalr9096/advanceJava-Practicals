import java.awt.*;
import java.awt.event.*;
class GridNumDemo extends Frame 
{
    
    GridNumDemo()
    {
        setLayout(new GridLayout(4,3,20,20));
        int iNum=0;
        for(int i=0;i<=9;i++)
		{
				add(new Button(""+iNum));
				iNum++;
			
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
        GridNumDemo oGD=new GridNumDemo();
        oGD.setTitle("Grid Layout Demo....");
        oGD.setSize(400,400);
        oGD.setVisible(true);
    }
}
