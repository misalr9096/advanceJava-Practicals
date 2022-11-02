import java.awt.*;
import java.awt.event.*;
public class LabelDemo extends Frame 
{
    LabelDemo()
    {
        setLayout(null);
		Label lb=new Label("Welcome to Java");
		lb.setBounds(50,100,200,30);
        add(lb);
        
        addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
public static void main(String args[])
{
    LabelDemo Obl=new LabelDemo();
    Obl.setTitle("LabelDemo.............");
    Obl.setSize(400,200);
    Obl.setVisible(true);
}
}
    
