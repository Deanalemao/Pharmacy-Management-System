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

public class Womencare extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Womencare frame = new Womencare();
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
	public Womencare() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\medicine-symbol.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton womentohome = new JButton("Back");
		womentohome.setFont(new Font("Tahoma", Font.BOLD, 12));
		womentohome.setBackground(new Color(223, 216, 233));
		womentohome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
			}
		});
		womentohome.setBounds(21, 395, 89, 23);
		contentPane.add(womentohome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\women care frame.png"));
		lblNewLabel.setBounds(0, 0, 588, 440);
		contentPane.add(lblNewLabel);
	}
}
