import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Other extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField OF1;
	private JTextField OF2;
	private JTextField OF3;
	private JTextField OF6;
	private JTextField OF5;
	private JTextField OF4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Other frame = new Other();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Other() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\medicine-symbol.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton othetTohome = new JButton("Back");
		othetTohome.setFont(new Font("Tahoma", Font.BOLD, 12));
		othetTohome.setForeground(new Color(0, 0, 0));
		othetTohome.setBackground(new Color(239, 238, 224));
		othetTohome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
			}
		});
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setBounds(299, 395, 85, 21);
		contentPane.add(btnNewButton);
		
		OF4 = new JTextField();
		OF4.setBounds(441, 211, 96, 19);
		contentPane.add(OF4);
		OF4.setColumns(10);
		
		OF5 = new JTextField();
		OF5.setBounds(441, 269, 96, 19);
		contentPane.add(OF5);
		OF5.setColumns(10);
		
		OF6 = new JTextField();
		OF6.setBounds(441, 323, 96, 19);
		contentPane.add(OF6);
		OF6.setColumns(10);
		
		OF3 = new JTextField();
		OF3.setBounds(156, 323, 96, 19);
		contentPane.add(OF3);
		OF3.setColumns(10);
		
		OF2 = new JTextField();
		OF2.setBounds(156, 269, 96, 19);
		contentPane.add(OF2);
		OF2.setColumns(10);
		
		OF1 = new JTextField();
		OF1.setBounds(156, 211, 96, 19);
		contentPane.add(OF1);
		OF1.setColumns(10);
		
		JCheckBox OC6 = new JCheckBox("Fashwash@150");
		OC6.setBounds(299, 322, 111, 21);
		contentPane.add(OC6);
		
		JCheckBox OC5 = new JCheckBox("Eyedrops@50");
		OC5.setBounds(299, 268, 111, 21);
		contentPane.add(OC5);
		
		JCheckBox OC4 = new JCheckBox("Condom@20");
		OC4.setBounds(299, 210, 111, 21);
		contentPane.add(OC4);
		
		JCheckBox OC3 = new JCheckBox("Pills@200");
		OC3.setBounds(25, 322, 93, 21);
		contentPane.add(OC3);
		
		JCheckBox OC2 = new JCheckBox("Band-aids@5");
		OC2.setBounds(25, 268, 93, 21);
		contentPane.add(OC2);
		
		JCheckBox OC1 = new JCheckBox("Lizol@99");
		OC1.setBounds(25, 210, 93, 21);
		contentPane.add(OC1);
		othetTohome.setBounds(10, 393, 89, 23);
		contentPane.add(othetTohome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\other frame.png"));
		lblNewLabel.setBounds(0, 0, 588, 440);
		contentPane.add(lblNewLabel);
	}
}
