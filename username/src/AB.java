import javax.swing.*;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
public class AB {
JFrame f2=new JFrame();
public void AB()
{
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JButton b5=new JButton("INBOX");
	b5.setForeground(Color.white);
	b5.setBackground(Color.black);
	f2.add(b5);
	JButton b6=new JButton("OUTBOX");
	b6.setForeground(Color.white);
	b6.setBackground(Color.black);
	f2.add(b6);
	JButton b7=new JButton("DRAFTS");
	b7.setForeground(Color.white);
	b7.setBackground(Color.black);
	f2.add(b7);
	JButton b8=new JButton("ALL MAIL");
	b8.setForeground(Color.white);
	b8.setBackground(Color.black);
	f2.add(b8);
	f2.setLayout(new GridLayout(5,2));
	f2.setSize(500,500);
	f2.setVisible(true);
	f2.setBackground(Color.black);
	b5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ee)
		{
			f2.dispose();
			ABC obi=new ABC();
			obi.ABC();
		}
	});
	}
}