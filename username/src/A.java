import javax.swing.*;
import javax.swing.ImageIcon.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class A
{
	public static void main(String[] args)
	{
		int i;
		char ch=0;
		Component NULL = null;
		String USERNAME="phani@gmail.com";
		String PASSWORD="1^f22Company";
		JFrame f=new JFrame();
		JPanel p=new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		p.setPreferredSize(new Dimension(400,350));
		p.setBackground(Color.white);
		JPanel j=new JPanel();
		JButton b0=new JButton();
		b0.setIcon(new ImageIcon("C:\\Users\\Striker46\\Desktop\\login.jpg"));
		p.add(b0,BorderLayout.CENTER);
		JLabel j0=new JLabel("ADMIN LOGIN");
		p.add(j0);
		JLabel j1=new JLabel("Username");
		j1.setForeground(Color.black);
		JTextField tf=new JTextField("",10);
		JLabel j2=new JLabel("Password");
		j2.setForeground(Color.black);
		JTextField tf1=new JTextField("",10);
		JButton b1=new JButton("LOGIN");
		p.add(j1);
		p.add(tf);
		p.add(j2);
		p.add(tf1);
		p.add(b1);
		f.add(p);
		f.setLayout(new FlowLayout(FlowLayout.CENTER));
		f.setSize(500,500);
		f.setVisible(true);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				String st=tf.getText();
				String st1=tf1.getText();
				if(st.equals(USERNAME)&&st1.equals(PASSWORD))
				{
					JOptionPane.showMessageDialog(NULL, "LOGIN SUCCESSFULL");
					f.dispose();
					Project1 p2=new Project1();
					p2.Project1();
				}
				else if(st!=USERNAME&&st1!=PASSWORD)
				{
					System.out.println("login unsuccessfull");
				}
			}
		});
}
}
			

