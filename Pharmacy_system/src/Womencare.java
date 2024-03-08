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
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class Womencare extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton women2;
	private JTextField TF3;
	private JTextField TF2;
	private JTextField TF1;
	private JTextField TF4;
	private JTextField TF5;
	private JTextField TF6;

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
		
		TF6 = new JTextField();
		TF6.setBounds(303, 258, 96, 19);
		contentPane.add(TF6);
		TF6.setColumns(10);
		
		TF5 = new JTextField();
		TF5.setBounds(303, 211, 96, 19);
		contentPane.add(TF5);
		TF5.setColumns(10);
		
		TF4 = new JTextField();
		TF4.setBounds(302, 158, 96, 19);
		contentPane.add(TF4);
		TF4.setColumns(10);
		
		TF1 = new JTextField();
		TF1.setBounds(124, 158, 74, 19);
		contentPane.add(TF1);
		TF1.setColumns(10);
		
		TF2 = new JTextField();
		TF2.setBounds(124, 211, 74, 19);
		contentPane.add(TF2);
		TF2.setColumns(10);
		
		TF3 = new JTextField();
		TF3.setBounds(124, 258, 74, 19);
		contentPane.add(TF3);
		TF3.setColumns(10);
		
		women2 = new JButton("ADD");
		women2.setFont(new Font("Tahoma", Font.BOLD, 10));
		women2.setBounds(216, 395, 89, 23);
		contentPane.add(women2);
		
		JCheckBox WC6 = new JCheckBox("Soap@20");
		WC6.setBounds(204, 257, 93, 21);
		contentPane.add(WC6);
		
		JCheckBox WC3 = new JCheckBox("Gels@70");
		WC3.setBounds(17, 257, 93, 21);
		contentPane.add(WC3);
		
		JCheckBox WC5 = new JCheckBox("Shampoo@80");
		WC5.setBounds(204, 210, 93, 21);
		contentPane.add(WC5);
		
		JCheckBox WC4 = new JCheckBox("Creams@30");
		WC4.setBounds(204, 157, 93, 21);
		contentPane.add(WC4);
		
		JCheckBox WC2 = new JCheckBox("Pads@40");
		WC2.setBounds(17, 210, 93, 21);
		contentPane.add(WC2);
		
		JCheckBox WC1 = new JCheckBox("Tampons@50");
		WC1.setBounds(17, 157, 93, 21);
		contentPane.add(WC1);
		womentohome.setBounds(21, 395, 89, 23);
		contentPane.add(womentohome);
		
		JLabel Addwomen = new JLabel("New label");
		Addwomen.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\women care frame.png"));
		Addwomen.setBounds(0, 0, 588, 440);
		contentPane.add(Addwomen);
	}
}
