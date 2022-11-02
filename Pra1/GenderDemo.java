import java.awt.*;
import java.awt.event.*;
public class GenderDemo extends Frame implements ItemListener
{
    CheckboxGroup cbg;
    Checkbox cb1,cb2;
    GenderDemo()
    {
        setLayout(null);
        cbg=new CheckboxGroup();
        
        
		Label lb=new Label("You Selected");
		lb.setBounds(50,100,150,30);
        add(lb);
        
        cb1=new Checkbox("Male",false);
        cb1.setBounds(120,100,50,30);
        add(cb1);
    
        cb2=new Checkbox("Female",true);
        cb2.setBounds(120,150,50,30);
        add(cb2);

        cb1.addItemListener(this);
        cb2.addItemListener(this);
        
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
    String str="Yu Selected"+":"+cbg.getSelectedCheckbox().getLabel();
    g.drawString(str,50,180);
}

public static void main(String args[])
{
    GenderDemo Ogb=new GenderDemo();
    Ogb.setTitle("GenderDemo.............");
    Ogb.setSize(400,200);
    Ogb.setVisible(true);
}
}
    
