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
	private JTextField babytotal;

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
		
		JButton babytobill = new JButton("Confirm");
		babytobill.setFont(new Font("Tahoma", Font.BOLD, 12));
		babytobill.setBackground(new Color(236, 213, 235));
		babytobill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Home frame = new Home();
				frame.setVisible(true);
			}
		});
		babytobill.setBounds(33, 391, 89, 23);
		contentPane.add(babytobill);
		
		JCheckBox bc1 = new JCheckBox("Diapers @10");
		bc1.setBackground(new Color(232, 223, 232));
		bc1.setForeground(new Color(0, 0, 0));
		bc1.setBounds(6, 191, 138, 23);
		contentPane.add(bc1);
		
		JCheckBox bc2 = new JCheckBox("Baby wipe @20");
		bc2.setBackground(new Color(232, 223, 232));
		bc2.setForeground(new Color(0, 0, 0));
		bc2.setBounds(6, 257, 138, 23);
		contentPane.add(bc2);
		
		JCheckBox bc3 = new JCheckBox("Rash cream @30");
		bc3.setBackground(new Color(232, 223, 232));
		bc3.setForeground(new Color(0, 0, 0));
		bc3.setBounds(6, 320, 138, 23);
		contentPane.add(bc3);
		
		JCheckBox bc4 = new JCheckBox("Shampoo @60");
		bc4.setBackground(new Color(232, 223, 232));
		bc4.setForeground(new Color(0, 0, 0));
		bc4.setBounds(297, 191, 131, 23);
		contentPane.add(bc4);
		
		JCheckBox bc5 = new JCheckBox("Lotion @35");
		bc5.setBackground(new Color(232, 223, 232));
		bc5.setForeground(new Color(0, 0, 0));
		bc5.setBounds(297, 257, 131, 23);
		contentPane.add(bc5);
		
		JCheckBox bc6 = new JCheckBox("Finger toothbrush @20");
		bc6.setBackground(new Color(232, 223, 232));
		bc6.setForeground(new Color(0, 0, 0));
		bc6.setBounds(297, 320, 164, 23);
		contentPane.add(bc6);
		
		JButton addbaby = new JButton("Add");
		addbaby.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int totalbaby=0,a=0,b=0,c=0,d=0,f=0,g=0;
				
				if(bc1.isSelected()) {
					
					a=Integer.parseInt(btf1.getText());
					totalbaby=10*a;
				}
				if(bc2.isSelected()) {
					
					b=Integer.parseInt(btf2.getText());
					totalbaby=20*b+totalbaby;
				}
				if(bc3.isSelected()) {
					
					c=Integer.parseInt(btf3.getText());
					totalbaby=30*c+totalbaby;
				}
				if(bc4.isSelected()) {
					
					d=Integer.parseInt(btf4.getText());
					totalbaby=60*d+totalbaby;
				}
				if(bc5.isSelected()) {
					
					f=Integer.parseInt(btf5.getText());
					totalbaby=35*f+totalbaby;
				}
				if(bc6.isSelected()) {
					
					f=Integer.parseInt(btf6.getText());
					totalbaby=20*f+totalbaby;
				}
				
				
				babytotal.setText(" "+totalbaby);
				
			}
		});
		addbaby.setFont(new Font("Tahoma", Font.BOLD, 12));
		addbaby.setBackground(new Color(236, 213, 235));
		addbaby.setBounds(387, 406, 89, 23);
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
		
		babytotal = new JTextField();
		babytotal.setBounds(356, 368, 144, 37);
		contentPane.add(babytotal);
		babytotal.setColumns(10);
		
		JButton babytowomen = new JButton("Next");
		babytowomen.setFont(new Font("Tahoma", Font.BOLD, 12));
		babytowomen.setBackground(new Color(236, 213, 235));
		babytowomen.setBounds(164, 392, 89, 23);
		contentPane.add(babytowomen);
		
		JLabel babyframe = new JLabel("New label");
		babyframe.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\Baby care frame.jpg"));
		babyframe.setBounds(0, 0, 588, 440);
		contentPane.add(babyframe);
	}
}
