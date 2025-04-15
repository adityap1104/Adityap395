import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ButtonDemo extends JFrame

{
   JButton father,mother,close;
   JLabel lbl;

    ButtonDemo()
    {
	father = new JButton("FATHER");
	mother = new JButton ("MOTHER");
	close = new JButton ("CLOSE");
	lbl = new JLabel (" ");

	setLayout( new GridLayout (4,1));
	setSize(500,400);
	add(father);
	add(mother);
	add(close);
	add(lbl);
	setVisible(true);
	
	ButtonHandler bh = new ButtonHandler();
	father.addActionListener(bh);
	mother.addActionListener(bh);
	close.addActionListener(bh);
    }

class ButtonHandler implements ActionListener
{
    public void actionPerfromed(ActionEvent ae)
     {
	if (ae.getSource() == father)
	{
	   lbl.setText("Father's name Aditya 	Age : 55	Occipation:HO");
	}
	if (ae.getSource() == mother)
	{
	   lbl.setText("Mother name Shivani 	Age : 45	Occupation: HouseWife");
	}
	if (ae.getSource() == close)
	{
	   System.exit(0);
	}
    }
}


public static void main(String args[])
{
	new ButtonDemo();
}
}