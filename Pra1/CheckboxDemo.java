import java.awt.*;
import java.awt.event.*;
public class CheckboxDemo extends Frame implements ItemListener
{
    Checkbox cb1,cb2,cb3;
    CheckboxDemo()
    {
        setLayout(null);
        cb1=new Checkbox("Red",true);
        cb1.setBounds(50,50,100,30);
        add(cb1);
    
        cb2=new Checkbox("Green",false);
        cb2.setBounds(50,100,100,30);
        add(cb2);
    
        cb3=new Checkbox("Blue",false);
        cb3.setBounds(50,150,100,30);
        add(cb3);

        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        
        addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
public void itemStateChanged(ItemEvent ie)
{
    repaint();
}
public void paint(Graphics g)
{
    String str=cb1.getLabel()+":"+cb1.getState();
	g.drawString(str,50,150);

    str=cb2.getLabel()+":"+cb2.getState();
    g.drawString(str,50,250);

    str=cb3.getLabel()+":"+cb3.getState();
    g.drawString(str,50,300);
}
public static void main(String args[])
{
    CheckboxDemo cb=new CheckboxDemo();
    cb.setTitle("CheckboxDemo.............");
    cb.setSize(400,200);
    cb.setVisible(true);
}
}
    
