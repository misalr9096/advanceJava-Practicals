import java.awt.*;
import javax.swing.*;
import java.lang.*;
import java.awt.event.*;
class JComboboxCity extends JFrame implements ItemListener
{
	JTextField txt;
	JComboBox Jcombo;
	Container oPan;
	
	JComboboxCity()
	{
		getContentPane();
		oPan.setLayout(new FlowLayout());
	
		Jcombo=new JComboBox();
		Jcombo.addItem("Red");
		Jcombo.addItem("Green");
		Jcombo.addItem("blue");
		Jcombo.addItem("Yellow");
		oPan.add(Jcombo);
		
		txt=new JTextField(20);
		oPan.add(txt);
	
		txt.setEditable(false);
		
		Jcombo.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(Jcombo.getSelectedItem()=="Red")
		{
			oPan.setBackground(Color.red);
		}
	
		else if(Jcombo.getSelectedItem()=="Green")
		{
				oPan.setBackground(Color.green);	
		}	
		else if(Jcombo.getSelectedItem()=="Blue")
		{
			oPan.setBackground(Color.blue);
		}
	}
	
	
	public static void main(String args[])
	{
		JComboboxCity city=new JComboboxCity();
		city.setTitle("JComboBox Demo............");
		city.setSize(400,400);
		city.setVisible(true);
		city.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


