import java.awt.*;
import java.awt.event.*;
public class VowelDemo extends Frame implements ActionListener
{
    Button btnOk,btnCancle;
    TextArea txtArea;
    TextField txtField;
    VowelDemo()
    {
        setLayout(null);
        Label lbl1=new Label("Enter String:");
        lbl1.setBounds(50,50,200,30);
        add(lbl1);
        
        txtArea=new TextArea();
        txtArea.setBounds(270,50,100,100);
        add(txtArea);
        
        Label lbl2=new Label("Vowel count:");
        lbl2.setBounds(50,170,200,30);
        add(lbl2);
        
        txtField=new TextField();
        txtField.setBounds(270,170,100,30);
        add(txtField);
        txtField.setEditable(false);
        
        btnOk=new Button("COUNT");
        btnOk.setBounds(90,320,100,30);
        add(btnOk);
        
		btnCancle=new Button("Exit");
        btnCancle.setBounds(200,320,100,30);
        add(btnCancle);
        
        btnOk.addActionListener(this);
        btnCancle.addActionListener(this);
        
        addWindowListener( new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnCancle)
		{
			System.exit(0);
		}
		
		int icount=0;
		String strTemp=txtArea.getText();
		for(char ch:strTemp.toLowerCase().toCharArray())
		{
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				icount++;
			}
			txtField.setText(String.valueOf(icount));
		}
	}

public static void main(String args[])
{
    VowelDemo Obd=new VowelDemo();
    Obd.setTitle("VowelDemo.............");
    Obd.setSize(300,400);
    Obd.setVisible(true);
}
}
    
