import java.awt.*;
import java.awt.event.*;
class GridBagLayoutDemo extends Frame
{
    Panel panel;
    GridBagLayoutDemo()
    {
        GridBagConstraints grid =new GridBagConstraints();
        panel=new Panel(new GridBagLayout());
        
    	grid.fill=GridBagConstraints.HORIZONTAL;
    	
    	grid.gridx=0;
    	grid.gridy=0;
		Button btnOne=new Button("ButtonOne");
        panel.add(btnOne,grid);

    	grid.gridx=1;
      	Button btnTwo=new Button("ButtonTwo");
        panel.add(btnTwo,grid);
    
    	grid.gridx=0;
    	grid.gridy=1;
		grid.ipady=20;
		Button btnThree=new Button("ButtonThree");
        panel.add(btnThree,grid);

    	grid.gridx=1;
		Button btnFour=new Button("ButtonFour");
        panel.add(btnFour,grid);

    	grid.gridx=0;
    	grid.gridy=2;
    	grid.gridwidth=2;
    	grid.ipady=20;
		Button btnFive=new Button("ButtonFive");
        panel.add(btnFive,grid);
		
		add(panel);
		
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
        GridBagLayoutDemo demo=new GridBagLayoutDemo();
        demo.setTitle("GridBagLayoutDemo");
        demo.setSize(400,400);
        demo.setVisible(true);
    }
  }
