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

public class Other extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		othetTohome.setBounds(10, 393, 89, 23);
		contentPane.add(othetTohome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\other.png"));
		lblNewLabel.setBounds(0, 0, 588, 440);
		contentPane.add(lblNewLabel);
	}
}
