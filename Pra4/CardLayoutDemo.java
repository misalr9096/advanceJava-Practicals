import java.awt.*;
import java.awt.event.*;

class CardLayoutDemo extends Frame implements ActionListener,MouseListener
{
	CardLayout card;
	Panel deck;
	Button btnFirst,btnPrev,btnNext,btnLast;
	CardLayoutDemo()
	{
		setLayout(null);
		card=new CardLayout();
		deck=new Panel();
		deck.setLayout(card);
		deck.setBounds(50,50,300,200);
		
		//first Card
		
		Panel card1=new Panel();
		card1=new CardLayout(FlowLayout());
		Label lblMsg=new Label("Welcome to AJP......");
		card1.add(lblMsg);
		
		Button btnOk=new Button("OK");
		card1.add(btnRect);
		
		deck.add(card1,"panel1");
		
		//Second Card
		
		Panel card3=new Panel();
		card2=new CardLayout(BorderLayout());
		
		Button btnCyan=new Button("CYAN");
		card2.add(btnCyan,BorderLayout.NORTH);
		
		Button btnMegenta=new Button("MAGNETA");
		card2.add(btnMeganta,BorderLayout.SOUTH);
		
		Button btnRed=new Button("RED");
		card2.add(btnRed,BorderLayout.WEST);
		
		Button btnBlue=new Button("BLUE");
		card2.add(btnBlue,BorderLayout.EAST);
		
		deck.add(card2,"panel2");
		
		//Third Card
		
		Panel card3=new Panel();
		card3=new CardLayout(GridLayout(3,2,20,20));
		
		Label lblUser=new Label("User Name:");
		card3.add(lblUser);
		
		TextField txtUser=new TextField(20);
		card3.add(txtUser);
		
		Label lblPass=new Label("Password:");
		card3.add(lblPass);
		
		TextField txtPass=new TextField(20);
		card3.add(txtPass);
		
		Btton btnLogin=new Button("Login");
		card3.add(btnExit);
		
		Button btnBlue=new Button("BLUE");
		card3.add(btnExit);
		
		deck.add(card3,"panel3");
		
		//first Card
		
		Panel card4=new Panel();
		card4=new setLayout(flowLayout());
		
		Label lblLang=new Label("Language:");
		lblLang.setBounds(50,50,100,30);
		card4.add(lblLang);
		
		Choice ch=new Choice();
		ch.setBounds(170,50,100,30);
		ch.add("Marathi");
		ch.add("Hindi");
		ch.add("English");
		card4.add(ch);

		deck.add(card4,"panel4");
		
		add(deck);
		
		btnFirst=new Button("First");
		btnFirst.setBounds(50,280,60,30);
		add(btnFirst);
		
		btnPrev=new Button("Previous");
		btnPrev.setBounds(130,280,60,30);
		add(btnPrev);
		
		btnNext=new Button("Next");
		btnNext.setBounds(210,280,60,30);
		add(btnNext);
		
		btnLast=new Button("Last");
		btnLast.setBounds(290,280,60,30);
		add(btnLast);
		
		btnFirst.addActionListener(this);
		btnPrev.addActionListener(this);
		btnNext.addActionListener(this);
		btnLast.addActionListener(this);

		
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
		 if(ae.getSource()==btnFirst)
		 {
			card.first(deck);
		 }
		else if(ae.getSource()==btnPrev)
		 {
			card.previous(deck);
		 }
		 else if(ae.getSource()==btnNext)
		 {
			card.next(deck);
		 }
		 else if(ae.getSource()==btnLast)
		 {
			card.last(deck);
		 }
	    }
	    public void mousePressed(MouseEvent me)
	    {
	    }
	    public void mouseRealsed(MouseEvent me)
	    {
	    }
	    public void mouseClicked(MouseEvent me)
	    {
			card.next(deck);
	    }
		 public static void main(String arg[])
		 {
		  CardLayoutDemo cld=new CardLayoutDemo();
		  cld.setTitle("CardLayout Demo...");
		  cld.setSize(300,300);
		  cld.setVisible(true);
		  }
}
		 
