import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TableExDemo extends JFrame
{
	TableExDemo()
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		String colHeader[]={"ID","NAME","Salary"};
		String strData[][]={{"101","Amit","670000"},
						{"102","Jai","780000"},
						{"101","Sachin","700000"}};
						
		JTable tbl=new JTable(strData,colHeader);
		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane scroll=new JScrollPane(tbl,v,h);
		c.add(scroll,BorderLayout.CENTER);
		
	}
	
	public static void main(String args[])
    {
        TableExDemo demo=new TableExDemo();
        demo.setTitle("TableEx Demo....");
        demo.setSize(400,400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
