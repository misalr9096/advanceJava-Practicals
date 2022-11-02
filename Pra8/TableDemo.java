import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TableDemo extends JFrame
{
	TableDemo()
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		String colHeader[]={"ROLL_NO","NAME","CLASS"};
		String strData[][]={{"CM302","Rutuja","TYCM"},
						{"CM305","Poonam","TYCM"},
						{"CM306","Payal","TYCM"}};
						
		JTable tbl=new JTable(strData,colHeader);
		c.add(tbl);
		
	}
	
	public static void main(String args[])
    {
        TableDemo demo=new TableDemo();
        demo.setTitle("Table Demo....");
        demo.setSize(400,400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
