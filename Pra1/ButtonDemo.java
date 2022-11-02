import java.awt.*;
import java.awt.event.*;
public class ButtonDemo extends Frame
{
    Button btnOk,btnReset,btnCancle;
    ButtonDemo()
    {
        setLayout(null);
        
        btnOk=new Button("OK");
        btnOk.setBounds(100,100,100,30);
        add(btnOk);
   
		btnReset=new Button("RESET");
        btnReset.setBounds(100,150,100,30);
        add(btnReset);
        
		btnCancle=new Button("CANCLE");
        btnCancle.setBounds(100,200,100,30);
        add(btnCancle);
        
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
    ButtonDemo Obd=new ButtonDemo();
    Obd.setTitle("ButtonDemo.............");
    Obd.setSize(200,300);
    Obd.setVisible(true);
}
}
    
