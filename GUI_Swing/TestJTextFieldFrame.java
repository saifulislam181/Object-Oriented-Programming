package Swing.src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestJTextFieldFrame extends JFrame implements ActionListener
{
	JLabel label1;
	JTextField tf;
	JLabel label2;
	JPasswordField pf;
	JButton jb;
		
	public TestJTextFieldFrame() 
	{
		super("Simple Frame");
		label1=new JLabel("Username");
		tf=new JTextField(20);
		label2=new JLabel("Password");
		pf=new JPasswordField(20);
		jb=new JButton("Login");
				
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(label1);	
		c.add(tf); 
		c.add(label2);		
		c.add(pf); 
			
		c.add(jb);
		jb.addActionListener(this);
							
		setSize(250,250);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==jb)
		{
			//JOptionPane.showMessageDialog(null,tf.getText()+"@"+pf.getPassword());
			this.setVisible(false);
			LabelFrame2 l2 = new LabelFrame2();
			l2.setVisible(true);
		}
	}
	public static void main(String args[])
	{
		new TestJTextFieldFrame();
	}
}