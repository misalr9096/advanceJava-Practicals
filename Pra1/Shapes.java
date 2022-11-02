import java.awt.*;
import java.awt.event.*;
class ShapesDemo extends Frame implements ItemListener
{
    CheckboxGroup cbg;
     Checkbox cb1,cb2,cb3;
    ShapesDemo()
    {
        setLayout(null);
        cbg=new CheckboxGroup();
        
		Label lb=new Label("Select Shape:");
		lb.setBounds(50,50,150,30);
        add(lb);
        
        cb1=new Checkbox("Circle",false);
        cb1.setBounds(220,100,50,30);
        add(cb1);
    
        cb2=new Checkbox("Rectangle",false);
        cb2.setBounds(220,150,50,30);
        add(cb2);
		
		cb3=new Checkbox("Trinagle",false);
        cb3.setBounds(220,150,50,30);
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
/*public void itemStateChanged(ItemEvent ie)
{
    repaint();
}
public void paint(Graphics g)
{
    String str="Yu Selected"+":"+cbg.getSelectedCheckbox().getLabel();
    g.drawString(str,50,180);
}
*/
public static void main(String args[])
{
    ShapesDemo Ogb=new ShapesDemo();
    Ogb.setTitle("ShapesDemo.............");
    Ogb.setSize(400,200);
    Ogb.setVisible(true);
}
}
    
