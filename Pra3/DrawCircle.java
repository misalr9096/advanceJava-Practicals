import java.awt.*;
import java.awt.event.*;

class DrawCircle extends Frame implements ActionListener
{	
	TextField txtRad;
	Button btnDraw;
	DrawCircle()
	{
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		Label lblRad=new Label("Radius:");
		add(lblRad);
		
		txtRad=new TextField(5);
		add(txtRad);
		
		btnDraw=new Button("Draw");
		add(btnDraw);
		
		btnDraw.addActionListener(this);
		
		addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent ie)
            {
                System.exit(0);
            }
        });
     }
	public void actionPerformed(ActionEvent ae)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		int iRad=Integer.parseInt(txtRad.getText());
		Dimension oD=this.getSize();
		int iX=oD.width-iRad;
		int iY=oD.height-iRad;
		g.drawOval(iX,iY,2*iRad,2*iRad);
	}
	public static void main(String arg[])
    {
		DrawCircle oDC=new DrawCircle();
		oDC.setTitle("Draw Circle...");
		oDC.setSize(300,300);
		oDC.setVisible(true);
	 }
}
		 
