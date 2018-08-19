import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.*;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ABCD {
	JFrame f4=new JFrame();
	public void ABCD() {
		JTextField jf=new JTextField("Search");
		f4.add(jf);
		JButton b00=new JButton();
		b00.setSize(0,0);
		b00.setBackground(Color.black);
		b00.setForeground(Color.white);
		f4.add(b00);
		JSeparator jk=new JSeparator();
		jk.setForeground(Color.YELLOW);
		b00.add(jk);
		JButton b01=new JButton("Micahel");
		b01.setBackground(Color.black);
		b01.setForeground(Color.white);
		b01.setIcon(new ImageIcon("C:\\Users\\Striker46\\Desktop\\pro.jpg"));
		f4.add(b01);
		JButton b02=new JButton("Matt");
		b02.setIcon(new ImageIcon("C:\\Users\\Striker46\\Desktop\\proo.jpg"));
		b02.setBackground(Color.black);
		b02.setForeground(Color.white);
		f4.add(b02);
		JButton b03=new JButton("Justin Engel");
		b03.setIcon(new ImageIcon("C:\\Users\\Striker46\\Desktop\\prooo.jpg"));
		b03.setBackground(Color.black);
		b03.setForeground(Color.white);
		f4.add(b03);
		JButton b04=new JButton("Emile");
		b04.setIcon(new ImageIcon("C:\\Users\\Striker46\\Desktop\\proooo.jpg"));
		b04.setBackground(Color.black);
		b04.setForeground(Color.white);
		f4.add(b04);
		JButton b05=new JButton("Grant");
		b05.setIcon(new ImageIcon("C:\\Users\\Striker46\\Desktop\\prooooo.jpg"));
		b05.setBackground(Color.black);
		b05.setForeground(Color.white);
		f4.add(b05);
		f4.setLayout(new GridLayout(8,2));
		f4.setSize(400, 400);
		f4.setVisible(true);
		b02.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent eeee)
			{
				f4.dispose();
				ABCDE obb=new ABCDE();
				obb.ABCDE();
			}
		});
	}

}
