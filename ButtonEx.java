import java.awt.event.*;
import javax.swing.*;

public class ButtonEx 
{
   public static void main(String[] args)
   {
	JFrame f = new JFrame ("Button Example");
	JLabel lb1 = new JLabel("Name");
	lb1.setBounds(0,50,400,20);
	JLabel lb2 = new JLabel();
	lb2.setBounds(0,150,400,20);
	JTextField tf = new JTextField();
	tf.setBounds(50,50,400,20);
	JButton b = new JButton ("Click here");
	b.setBounds(50,100,80,10);
	b.addActionListener(new ActionListener ()
	{
	public void actionPerformed(ActionEvent e)
	{
	String name = tf.getText();
	lb2.setText ("Hi i'm "+name+" Studying BCA at GSS college in Belagavi");
	tf.setText(" ");	
	}});
	f.add(b);
	f.add(tf);
	f.add(lb1);
	f.add(lb2);
	
	f.setSize(500,500);
	f.setVisible(true);
	f.setLayout(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}