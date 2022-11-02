import java.awt.*;
import java.awt.event.*;
class GridColorDemo extends Frame implements ActionListener
{
    Button btnBlue,btnRed,btnGreen,btnYellow,btnCyan; 
    GridColorDemo()
    {
        setLayout(new GridLayout(3,2,20,20));
        
        btnBlue=new Button("Blue");
        add(btnBlue);
        
        btnRed=new Button("Red");
        add(btnRed);
        
        btnGreen=new Button("Green");
        add(btnGreen);
        
        btnYellow=new Button("Yellow");
        add(btnYellow);
        
        btnCyan=new Button("Cyan");
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
			btnBlue.setBackground(Color.BLUE);
		}
		else if(ae.getSource()==btnRed)
		{
			btnRed.setBackground(Color.RED);
		}
		else if(ae.getSource()==btnGreen)
		{
			btnGreen.setBackground(Color.GREEN);
		}
		else if(ae.getSource()==btnYellow)
		{
			btnYellow.setBackground(Color.YELLOW);
		}
		else if(ae.getSource()==btnCyan)
		{
			btnCyan.setBackground(Color.CYAN);
		}
	}	
    public static void main(String args[])
    {
        GridColorDemo oG=new GridColorDemo();
        oG.setTitle("Grid Color Demo....");
        oG.setSize(400,400);
        oG.setVisible(true);
    }
}
