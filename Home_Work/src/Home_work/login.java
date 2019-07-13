package Home_work;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class login extends Thread {
	public void run() {
//		Create a  main frame
		JFrame f1 = new JFrame("Login Account");
		f1.setLayout(new BorderLayout());
//		Create 3 panel and set layout
		JPanel p1 = new JPanel(new FlowLayout());
		JPanel p2 = new JPanel(new GridBagLayout());
		JPanel p3 = new JPanel(new GridBagLayout());
//		create 3 label 
		JLabel l1 = new JLabel("Login");
		JLabel l2 = new JLabel("User Name");
		JLabel l3 = new JLabel("Password");
//		create 2 field 
		JTextField t1 = new JTextField(15);
		JPasswordField t2 = new JPasswordField(15);
//		create 2 button and add ActionListener
		JButton b1 = new JButton("Login");
		JButton b2 = new JButton("Cancel");
//		click to Exite button 
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
//		click to login button
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
//				get text and password
				String lon = t1.getText();
				String CorrectLogin = "Mahdi";
				String pass = t2.getText();
				String CorrectPass = "M1234";
//				check usear and password
				if (lon.equals(CorrectLogin) && pass.equals(CorrectPass)) {
//					if the username and password is corrct opane a new frame
//					create a frame
					JFrame f = new JFrame();
					f.setLayout(new BorderLayout());
					f.setSize(600, 285);
//					create 2 panel
					JPanel pc1 = new JPanel(new BorderLayout());
					JPanel pc2 = new JPanel();
//					create 2 lable
					JLabel lc1 = new JLabel(
							"Type some text your keyboard.The keys youer perss will be highlighted and the text will be dispalayed.",
							10);
					JLabel lc2 = new JLabel("note:clickind the buttons with your mouse will not perform a", 10);

					TextArea t1 = new TextArea(10, 65);
					JPanel pc3 = new JPanel(new FlowLayout());
					JLabel lc3 = new JLabel("Send For :");
					JTextField txt = new JTextField(15);
//					make a button and add Action Listener
					JButton btn1 = new JButton("Send");
					btn1.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
//							show massage to sent meil
							JOptionPane.showMessageDialog(null, "Send to " + txt.getText() + " !");
						}
					});
//					make a button  and add Action Listener to clear the message 
					JButton btn2 = new JButton("Clear");
					btn2.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
							String name = t1.getText();
							t1.setText(" ");
						}
					});
//					make a button and add Action lisntener  to Exit the window
					JButton btn3 = new JButton("Exit");
					btn3.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent arg0) {
							// TODO Auto-generated method stub
							System.exit(0);
						}
					});
//					add componinte to my panel and add panel to the frame
					pc3.add(lc3);
					pc3.add(txt);
					pc3.add(btn1);
					pc3.add(btn2);
					pc3.add(btn3);
					pc1.add(lc1, BorderLayout.NORTH);
					pc1.add(lc2, BorderLayout.CENTER);
					f.add(pc1, BorderLayout.NORTH);
					pc2.add(t1);
					f.add(pc2, BorderLayout.CENTER);
					f.add(pc3, BorderLayout.SOUTH);
					f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
					f.setVisible(true);
					f.setResizable(false);

				} else {
// if the usearname and password ir incorcte
					JOptionPane.showMessageDialog(null, "your password is not correct", "Login",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
//		add panels to my main frame 
		p2.add(l1);
		p1.add(l2);
		p1.add(t1);
		p1.add(l3);
		p1.add(t2);
		p3.add(b1);
		p3.add(b2);
		f1.add(p2, BorderLayout.NORTH);
		f1.add(p1, BorderLayout.CENTER);
		f1.add(p3, BorderLayout.SOUTH);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setSize(300, 150);
		f1.setVisible(true);

	}

	public static void main(String[] args) {
//create an object 
		login l1 = new login();
		l1.start();
	}

}
