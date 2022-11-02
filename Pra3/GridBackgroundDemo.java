import java.awt.*;
import java.awt.event.*;
class GridBackgroundDemo extends Frame implements ActionListener
{
    CheckboxGroup btnBlue,btnRed,btnGreen,btnYellow,btnCyan; 
    GridBackgroundDemo()
    {
        setLayout(new FlowLayout());
        
        btnBlue=new CheckboxGroup("Blue");
        add(btnBlue);
        
        btnRed=new CheckboxGroup("Red");
        add(btnRed);
        
        btnGreen=new CheckboxGroup("Green");
        add(btnGreen);
        
        btnYellow=new CheckboxGroup("Yellow");
        add(btnYellow);
        
        btnCyan=new CheckboxGroup("Cyan");
        add(btnCyan);
        
		btnBlue.addActionListener(this);
		btnRed.addActionListener(this);
		btnGreen.addActionListener(this);
		btnYellow.addActionListener(this);
		btnCyan.addActionListener(this);		
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent ie)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
		if(ae.getSource()==btnBlue)
		{
			setBackground(Color.BLUE);
		}
		else if(ae.getSource()==btnRed)
		{
			setBackground(Color.RED);
		}
		else if(ae.getSource()==btnGreen)
		{
			setBackground(Color.GREEN);
		}
		else if(ae.getSource()==btnYellow)
		{
			setBackground(Color.YELLOW);
		}
		else if(ae.getSource()==btnCyan)
		{
			setBackground(Color.CYAN);
		}
	}	
    public static void main(String args[])
    {
        GridBackgroundDemo oGB=new GridBackgroundDemo();
        oGB.setTitle("Grid Color Demo....");
        oGB.setSize(400,400);
        oGB.setVisible(true);
    }
}
