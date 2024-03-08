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
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class Babycare extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField btf1;
	private JTextField btf2;
	private JTextField btf3;
	private JTextField btf4;
	private JTextField btf5;
	private JTextField btf6;

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
		
		JCheckBox bc1 = new JCheckBox("Diapers @10");
		bc1.setBounds(33, 191, 111, 23);
		contentPane.add(bc1);
		
		JCheckBox bc2 = new JCheckBox("Baby wipe @20");
		bc2.setBounds(33, 257, 111, 23);
		contentPane.add(bc2);
		
		JCheckBox bc3 = new JCheckBox("Rash cream @30");
		bc3.setBounds(33, 320, 111, 23);
		contentPane.add(bc3);
		
		JCheckBox bc4 = new JCheckBox("Shampoo @60");
		bc4.setBounds(317, 191, 111, 23);
		contentPane.add(bc4);
		
		JCheckBox bc5 = new JCheckBox("Lotion @35");
		bc5.setBounds(317, 257, 111, 23);
		contentPane.add(bc5);
		
		JCheckBox bc6 = new JCheckBox("Finger toothbrush @20");
		bc6.setBounds(317, 320, 144, 23);
		contentPane.add(bc6);
		
		JButton addbaby = new JButton("Add");
		addbaby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int totalbaby=0,a=0;
				
				if(bc1.isSelected()) {
					
					totalbaby=Integer.parseInt(btf1.getText());
					a=10*totalbaby;
					
					
				}
			}
		});
		addbaby.setFont(new Font("Tahoma", Font.BOLD, 12));
		addbaby.setBackground(new Color(236, 213, 235));
		addbaby.setBounds(182, 392, 89, 23);
		contentPane.add(addbaby);
		
		btf1 = new JTextField();
		btf1.setBounds(175, 192, 96, 20);
		contentPane.add(btf1);
		btf1.setColumns(10);
		
		btf2 = new JTextField();
		btf2.setColumns(10);
		btf2.setBounds(175, 257, 96, 23);
		contentPane.add(btf2);
		
		btf3 = new JTextField();
		btf3.setColumns(10);
		btf3.setBounds(175, 321, 96, 23);
		contentPane.add(btf3);
		
		btf4 = new JTextField();
		btf4.setColumns(10);
		btf4.setBounds(467, 192, 96, 20);
		contentPane.add(btf4);
		
		btf6 = new JTextField();
		btf6.setColumns(10);
		btf6.setBounds(467, 321, 96, 20);
		contentPane.add(btf6);
		
		btf5 = new JTextField();
		btf5.setColumns(10);
		btf5.setBounds(467, 258, 96, 20);
		contentPane.add(btf5);
		
		JLabel babyframe = new JLabel("New label");
		babyframe.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\Baby care frame.jpg"));
		babyframe.setBounds(0, 0, 588, 440);
		contentPane.add(babyframe);
	}
}
