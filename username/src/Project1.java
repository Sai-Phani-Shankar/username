
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon.*;

import javax.swing.*;

public class Project1
{
JFrame f1=new JFrame("Log In1");

public void Project1()
{
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JButton b2=new JButton();
b2.setBackground(Color.black);
b2.setIcon(new ImageIcon("wts.jpg"));
f1.add(b2);
JButton b3=new JButton();
b3.setIcon(new ImageIcon("gmail.jpg"));
b3.setBackground(Color.black);
f1.add(b3);
JButton b4=new JButton();
b4.setIcon(new ImageIcon("sky.png"));
b4.setBackground(Color.black);
f1.add(b4);
JButton b41=new JButton();
b41.setIcon(new ImageIcon("innera.jpg"));
b41.setBackground(Color.black);
f1.add(b41);
f1.setLayout(new GridLayout(6,1,0,0));
f1.setSize(750,750);
f1.setVisible(true);
f1.setBackground(Color.black);
b3.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent ae)
	{
		f1.dispose();
		AB ob=new AB();
		ob.AB();
	}
});
}
}
