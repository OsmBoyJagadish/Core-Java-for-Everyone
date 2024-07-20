package ui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login extends JFrame {
	JLabel jLabel1, jLabel2;
	JTextField field1, field2;
	JButton button1, button2;

	public Login() {
		setLayout(new FlowLayout());

		jLabel1 = new JLabel("Username");
		field1 = new JTextField(30);
		jLabel2 = new JLabel("Password");
		field2 = new JTextField(30);

		button1 = new JButton("Sumbit");
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("submit");
			}
		});

		button2 = new JButton("Reset");
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("reset");
			}
		});

		add(jLabel1);
		add(field1);
		add(jLabel2);
		add(field2);
		add(button1);
		add(button2);

		setVisible(true);
		setSize(400, 400);
	}
	public static void main(String[] args) {
		new Login();
	}
}
