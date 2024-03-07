import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Babycare extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Babycare frame = new Babycare();
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
	public Babycare() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\medicine-symbol.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton babyTohome = new JButton("Back");
		babyTohome.setFont(new Font("Tahoma", Font.BOLD, 12));
		babyTohome.setBackground(new Color(236, 213, 235));
		babyTohome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home frame = new Home();
				frame.setVisible(true);
			}
		});
		babyTohome.setBounds(33, 391, 89, 23);
		contentPane.add(babyTohome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\Baby care frame.jpg"));
		lblNewLabel.setBounds(0, 0, 588, 440);
		contentPane.add(lblNewLabel);
	}
}
