import java.awt.*;
import java.awt.event.*;
class Demo1 extends Frame
{
    Demo11()
    {
		setLayout(new GridBagLayout());
        GridBagConstraints grid =new GridBagConstraints();
        
    	grid.fill=GridBagConstraints.VERTICAL;
    	
    	grid.gridx=0;
    	grid.gridy=0;
		Label lbl1=new Label("Name");
        add(lbl1,grid);

    	grid.gridx=1;
      	TextField txt=new TextField(30);
        add(txt,grid);

		grid.gridx=0;
    	grid.gridy=1;
    	grid.ipady=10;
		Label lbl2=new Label("Comments");
        add(lbl2,grid);

    	grid.gridx=1;
    	TextArea area=new TextArea(15,25);
        add(area,grid);

    	grid.gridy=3;
    	grid.anchor=GridBagConstraints.WEST;
		Button btn=new Button("Submit");
        add(btn,grid);
		
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
        Demo11 demo=new Demo11();
        demo.setTitle("GridBagLayoutDemo");
        demo.setSize(400,400);
        demo.setVisible(true);
    }
  }
