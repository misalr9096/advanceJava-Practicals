import java.awt.*;
import java.awt.event.*;
public class ListDemo extends Frame implements ItemListener
{
    List licity;
    
    ListDemo()
    {
        setLayout(null);   
		licity=new List();
		licity.setBounds(50,50,150,200);
        add(licity);
        
        licity.add("Pandharpur");
        licity.add("Solapur");
        licity.add("Kolarpur");
        licity.add("Magalveda");
        licity.add("Sagali");
        licity.add("Satara");
        licity.add("Merj");
        licity.add("Akaluj");
        licity.add("Kolarpur");
        licity.add("Pandharpur");
        
        Choice chCity=new Choice();
        chCity.setBounds(270,50,150,200);
        add(chCity);
        chCity.addItemListener(this);
        
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
		chCity=add(licity.getSelectedItem());
	}
	public static void main(String args[])
	{
	ListDemo Ogb=new ListDemo();
    Ogb.setTitle("ListDemo.............");
    Ogb.setSize(400,200);
    Ogb.setVisible(true);
	}
}
    
