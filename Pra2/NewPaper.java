import java.awt.*;
import java.awt.event.*;
class PaperDemo extends Frame implements ActionListener
{
    List lsPaper;
    Choice chPaper;
    PaperDemo()
    {
        setLayout(null);
        lsPaper=new List(6,false);
        lsPaper.setBounds(50,50,200,200);
        add(lsPaper);
        lsPaper.add("Sakal");
        lsPaper.add("Times of India ");
        lsPaper.add("Pudhari");
        lsPaper.add("Lokmati");
        lsPaper.add("The hindu");
        lsPaper.add("surajy");

        chPaper=new Choice();
        chPaper.setBounds(170,50,200,80);
        add(chPaper);
        lsPaper.addActionListener(this);
        
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
        chPaper.add(lsPaper.getSelectedItem());
    }
    public static void main(String args[])
    {
        PaperDemo ch=new PaperDemo();
        ch.setTitle("News Paper Demo....");
        ch.setSize(400,400);
        ch.setVisible(true);
    }
}
