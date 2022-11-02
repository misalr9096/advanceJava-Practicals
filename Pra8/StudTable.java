import java.awt.*;
import java.awt.event.*;
import javax.swing.table.DefaultTableModel.*;
class StudTable extends JFrame
{
	StudTable()
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		String colHeader[]={"NAME Of Student","Percentage","Grade"};
		String strData[][]={
							{"Amit","67%","C"},
							{"Jai","78%","B"},
							{"Sachin","70%","B"},
							{"Poonam","67%","C"},
							{"Rutuja","78%","B"},
							{"Priti","70%","A"},
							{"Payal","67%","C"},
							{"Harsha","78%","B"},
							{"Choti","70%","A"},
							{"Swara","70%","A"},
						   };
						
		JTable tbl=new JTable(strData,colHeader);
		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane scroll=new JScrollPane(tbl,v,h);
		c.add(scroll,BorderLayout.CENTER);
		
	}
	
	public static void main(String args[])
    {
        StudTable demo=new StudTable();
        demo.setTitle("  StudTableDemo....");
        demo.setSize(400,400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
