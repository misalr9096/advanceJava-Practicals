import java.awt.*;
import java.awt.event.*;
class ShapeColor extends Frame implements ActionListener,ItemListener
{
		Menu mColor,mShape,mState;
		MenuItem SCir,STri,SRect,CRed,CGreen,CBlue,CBlk;
		CheckboxMenuItem SFill;
		int iColor,iShape;
		ShapeColor()
		{
			iColor=0;
			iShape=0;
			MenuBar MBar=new MenuBar();
			
			mShape=new Menu("Shape");
			
			SCir=new MenuItem("Circle");
			mShape.add(SCir);
			
			STri=new MenuItem("Triangle");
			mShape.add(STri);

			SRect=new MenuItem("Rectangle");
			mShape.add(SRect);
			
			MBar.add(mShape);
			
			mColor=new Menu("Color");
			
			CRed=new MenuItem("Red");
			mColor.add(CRed);
			
			CGreen=new MenuItem("Green");
			mColor.add(CGreen);

			CBlue=new MenuItem("Blue");
			mColor.add(CBlue);
			
			CBlk=new MenuItem("Black");
			CBlk.setEnabled(false);
			mColor.add(CBlk);
			
			MBar.add(mColor);
			
			mState=new Menu("State");
			
			SFill=new CheckboxMenuItem("Fill");
			mState.add(SFill);
			
			MBar.add(mState);
			
			setMenuBar(MBar);
			
			SCir.addActionListener(this);
			STri.addActionListener(this);
			SRect.addActionListener(this);
			CRed.addActionListener(this);
			CGreen.addActionListener(this);
			CBlue.addActionListener(this);
			CBlk.addActionListener(this);
			SFill.addItemListener(this);
			
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
		if(ae.getSource()==CRed)
		{
			iColor=1;
		}
		else if(ae.getSource()==CBlue)
			{
				iColor=2;
			}
		else if(ae.getSource()==CGreen)
			{
				iColor=3;
			}
		
		
		if(ae.getSource()==SCir)
		{
			iShape=1;
		}
		else if(ae.getSource()==STri)
			{
				iShape=2;
			}
		else if(ae.getSource()==SRect)
			{
				iShape=3;
			}
			repaint();
		
	}	
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		
		if(iColor==1)
		{
			g.setColor(Color.RED);
		}
		else if(iColor==2)
		{
			g.setColor(Color.GREEN);
		}
		else if(iColor==3)
		{
			g.setColor(Color.BLUE);
		}
		
		if(iShape==1)
		{
			if(SFill.getState())
			{
			g.fillOval(100,100,100,100);
			}
			else
			{ 
			g.drawOval(100,100,100,100);
			}
		}	
		else if(iShape==2)
		{
			int aArr[]={100,150,150,100};
			int bArr[]={100,50,150,100};
			if(SFill.getState())
			{
			g.fillPolygon(aArr,bArr,3);
			}
			else
			{
			g.drawPolygon(aArr,bArr,3);
			}
		}	
		else if(iShape==3)
		{
			if(SFill.getState())
			{
			g.fillOval(100,100,100,100);
			}
			else
			{
			g.drawOval(100,100,100,100);
			}
		
		}
	}	
    public static void main(String args[])
    {
        ShapeColor demo=new ShapeColor();
        demo.setTitle("ShapeColor Demo....");
        demo.setSize(400,400);
        demo.setVisible(true);
    }
  }
