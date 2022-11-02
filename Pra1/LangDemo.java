import java.awt.*;
import java.awt.event.*;
public class LangDemo extends Frame implements ItemListener
{
    CheckboxGroup cbg;
    Checkbox cb1,cb2,cb3,cb4;
    LangDemo()
    {
        setLayout(null);
        cbg=new CheckboxGroup();
        
		Label lb=new Label("You Selected");
		lb.setBounds(50,50,200,30);
        add(lb);
        
        cb1=new Checkbox("Marathi",cbg,false);
        cb1.setBounds(120,100,100,30);
        add(cb1);
    
        cb2=new Checkbox("Hindi",cbg,false);
        cb2.setBounds(120,150,100,30);
        add(cb2);
        
        cb3=new Checkbox("English",cbg,false);
        cb3.setBounds(120,200,100,30);
        add(cb3);
        
        cb4=new Checkbox("Sanskrit",cbg,true);
        cb4.setBounds(120,250,100,30);
        add(cb4);

        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        cb4.addItemListener(this);
        
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
    String str="You Selected"+":"+cbg.getSelectedCheckbox().getLabel();
    g.drawString(str,50,300);
}

public static void main(String args[])
{
    LangDemo Ol=new LangDemo();
    Ol.setTitle("LanguageDemo.............");
    Ol.setSize(200,400);
    Ol.setVisible(true);
}
}
    
