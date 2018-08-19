import javax.swing.*;

import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ABC {
JFrame f3=new JFrame();
public void ABC()
{
	JLabel j3=new JLabel("INBOX",SwingConstants.CENTER);
	f3.add(j3);
	JButton b9=new JButton("ALL");
	b9.setBackground(Color.BLACK);
	b9.setForeground(Color.white);
	f3.add(b9);
	JButton b10=new JButton("MESSAGES");
	b10.setBackground(Color.BLACK);
	b10.setForeground(Color.white);
	f3.add(b10);
	JButton b11=new JButton("UNREAD");
	b11.setBackground(Color.BLACK);
	b11.setForeground(Color.white);
	f3.add(b11);
	JButton b12=new JButton("IMPORTANT");
	b12.setBackground(Color.BLACK);
	b12.setForeground(Color.white);
	f3.add(b12);
	JSeparator jj=new JSeparator();
	jj.setForeground(Color.YELLOW);
	b12.add(jj);
	JButton b13=new JButton("TEAMS");
	b13.setBackground(Color.BLACK);
	b13.setForeground(Color.white);
	f3.add(b13);
	JButton b14=new JButton("GROUPS");
	b14.setBackground(Color.BLACK);
	b14.setForeground(Color.white);
	f3.add(b14);
	JButton b15=new JButton("CHANNELS");
	b15.setBackground(Color.BLACK);
	b15.setForeground(Color.white);
	f3.add(b15);
	JButton b16=new JButton("LOCATIONS");
	b16.setBackground(Color.BLACK);
	b16.setForeground(Color.white);
	f3.add(b16);
	JButton b17=new JButton("MEDIA");
	b17.setBackground(Color.BLACK);
	b17.setForeground(Color.white);
	f3.add(b17);
f3.setLayout(new GridLayout(10,2));
	f3.setSize(400, 400);
	f3.setVisible(true);
	b10.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent eeee)
		{
			f3.dispose();
			ABCD ob=new ABCD();
			ob.ABCD();
		}
	});
}
}
	