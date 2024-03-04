import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login_page {

	private JFrame frame;
	private JTextField username;
	private JPasswordField password;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login_page window = new Login_page();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login_page() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dean Alemao\\Downloads\\medicine-symbol.png"));
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setBounds(233, 198, 153, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(193, 265, 79, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(193, 310, 89, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		username = new JTextField();
		username.setBounds(282, 261, 153, 26);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		password = new JPasswordField();
		password.setBounds(282, 306, 153, 26);
		frame.getContentPane().add(password);
		
		JButton loginbut = new JButton("Login");
		loginbut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=username.getText();
				String pass=password.getText();
				
				if(user.equals("admin") && pass.equals("pass123")) {
					Home frame= new Home();
					frame.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid details!!");
				}
			}
		});
		loginbut.setBackground(new Color(192, 192, 192));
		loginbut.setBounds(233, 372, 89, 23);
		frame.getContentPane().add(loginbut);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\login.png"));
		lblNewLabel_2.setBounds(0, 0, 588, 440);
		frame.getContentPane().add(lblNewLabel_2);
		frame.setBounds(100, 100, 600, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
