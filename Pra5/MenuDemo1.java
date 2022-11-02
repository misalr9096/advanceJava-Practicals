import java.awt.*;
import java.awt.event.*;
class MenuDemo1 extends Frame implements ActionListener
{
		String str;
		Menu mFile,mEdit,mHelp;
		MenuItem fOpen,fSave,fSaveAs,fExit,eCopy,ePaste,eCut,hAbout;
		MenuDemo1()
		{
			str="";
			setLayout(null);
			MenuBar Mbar=new MenuBar();
			mFile=new Menu("File");
			fOpen=new MenuItem("Open");
			fSave=new MenuItem("Save");
			fSaveAs=new MenuItem("SaveAs");
			fExit=new MenuItem("Exit");
			mEdit=new Menu("Edit");
			eCopy=new MenuItem("Copy");
			ePaste=new MenuItem("Paste");
			eCut=new MenuItem("Cut");	
			
			mHelp=new Menu("Help");
			hAbout=new MenuItem("hAbort");
			
			mFile.add(fOpen);
			mFile.add(fSave);
			mFile.add(fSaveAs);
			mFile.add(fExit);

			mEdit.add(eCopy);
			mEdit.add(ePaste);
			mEdit.add(eCut);
			mHelp.add(hAbout);
			
			Mbar.add(mFile);
			Mbar.add(mEdit);
			Mbar.add(mHelp);
			
			setMenuBar(Mbar);
			
			fOpen.addActionListener(this);
			fSave.addActionListener(this);
			fSaveAs.addActionListener(this);
			fExit.addActionListener(this);
			eCopy.addActionListener(this);
			ePaste.addActionListener(this);
			eCut.addActionListener(this);
			hAbout.addActionListener(this);

			
		addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
    public void actionPerformed(ActionEvent ae)
    {
		if(ae.getSource()==fOpen)
		{
			str="GOOD MORNING !!!!!!!!! BABY";
		}
		else if(ae.getSource()==fExit)
			{
				System.exit(0);
			}
			repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(str,100,100);
	}
    public static void main(String args[])
    {
        MenuDemo1 demo=new MenuDemo1();
        demo.setTitle("MenuBar Demo....");
        demo.setSize(400,400);
        demo.setVisible(true);
    }
  }
