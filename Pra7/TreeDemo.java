import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
class TreeDemo extends JFrame
{
	JTree tree;
	JTextField txtPath;
	TreeDemo()
	{
		Container c=getContentPane();
		c.setLayout(new BorderLayout());
		
		DefaultMutableTreeNode oRoot=new DefaultMutableTreeNode("Department");
		
		DefaultMutableTreeNode oCM=new DefaultMutableTreeNode("Computer");
		DefaultMutableTreeNode oFY=new DefaultMutableTreeNode("First Year");
		oCM.add(oFY);
		DefaultMutableTreeNode oSY=new DefaultMutableTreeNode("Second Year");
		oCM.add(oSY);
		DefaultMutableTreeNode oTY=new DefaultMutableTreeNode("Third Year");
		oCM.add(oTY);
		oRoot.add(oCM);
		
		DefaultMutableTreeNode oEE=new DefaultMutableTreeNode("Electrical");
		DefaultMutableTreeNode oFY1=new DefaultMutableTreeNode("First Year");
		oEE.add(oFY1);
		DefaultMutableTreeNode oSY1=new DefaultMutableTreeNode("Second Year");
		oEE.add(oSY1);
		DefaultMutableTreeNode oTY1=new DefaultMutableTreeNode("Third Year");
		oEE.add(oTY1);
		oRoot.add(oEE);
		
		DefaultMutableTreeNode oCE=new DefaultMutableTreeNode("Civil");
		DefaultMutableTreeNode oFY2=new DefaultMutableTreeNode("First Year");
		oCE.add(oFY2);
		DefaultMutableTreeNode oSY2=new DefaultMutableTreeNode("Second Year");
		oCE.add(oSY2);
		DefaultMutableTreeNode oTY2=new DefaultMutableTreeNode("Third Year");
		oCE.add(oTY2);
		
		oRoot.add(oCE);

		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JTree tree=new JTree(oRoot);
		JScrollPane scroll=new JScrollPane(tree,v,h);
		c.add(scroll,BorderLayout.CENTER);
		
		txtPath=new JTextField(20);
		c.add(txtPath,BorderLayout.NORTH);
		 
		tree.addMouseListener(new MouseAdapter()
		{
			public void mouseClicked(MouseEvent me)
			{
				doAction(me);
			}
		});
	}
		
	public void doAction(MouseEvent me)
	{
		TreePath oPath=tree.getPathForLocation(me.getX(),me.getY());
		if(oPath!=null)
		{
			txtPath.setText(oPath.toString());
		}
		else
		{
			txtPath.setText("");
		}
	}
	
	public static void main(String args[])
    {
        TreeDemo demo=new TreeDemo();
        demo.setTitle("Tree Demo....");
        demo.setSize(400,400);
        demo.setVisible(true);
        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
		
		
		
