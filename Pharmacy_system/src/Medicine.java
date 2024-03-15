import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Medicine extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField MF1;
	private JTextField MF2;
	private JTextField MF3;
	private JTextField MF4;
	private JTextField MF5;
	private JTextField MF6;
	private JTextField medicinetotal;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Medicine frame = new Medicine();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Medicine(int totalbaby,int totalwomen) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\medicine-symbol.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		MF6 = new JTextField();
		MF6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					MF6.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					MF6.setText(" ");
				}
			}
		});
		MF6.setBounds(430, 310, 96, 19);
		contentPane.add(MF6);
		MF6.setColumns(10);
		
		MF5 = new JTextField();
		MF5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					MF5.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					MF5.setText(" ");
				}
			}
		});
		MF5.setBounds(430, 248, 96, 19);
		contentPane.add(MF5);
		MF5.setColumns(10);
		
		MF4 = new JTextField();
		MF4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int d=e.getKeyChar();
	
				if(Character.isDigit(d)) {
					MF4.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					MF4.setText(" ");
				}
			}
		});
		MF4.setBounds(430, 192, 96, 19);
		contentPane.add(MF4);
		MF4.setColumns(10);
		
		MF3 = new JTextField();
		MF3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					MF3.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					MF3.setText(" ");
				}
			}
		});
		MF3.setBounds(152, 310, 96, 19);
		contentPane.add(MF3);
		MF3.setColumns(10);
		
		MF2 = new JTextField();
		MF2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					MF2.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					MF2.setText(" ");
				}
			}
		});
		MF2.setBounds(152, 248, 96, 19);
		contentPane.add(MF2);
		MF2.setColumns(10);
		
		MF1 = new JTextField();
		MF1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					MF1.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					MF1.setText(" ");
				}
			}
		});
		MF1.setBounds(152, 192, 96, 19);
		contentPane.add(MF1);
		MF1.setColumns(10);
		
		JCheckBox MC4 = new JCheckBox("Zestril@130");
		MC4.setBounds(284, 191, 108, 21);
		contentPane.add(MC4);
		
		JCheckBox MC5 = new JCheckBox("Zocor@120");
		MC5.setBounds(284, 247, 108, 21);
		contentPane.add(MC5);
		
		JCheckBox MC6 = new JCheckBox("Benadryl@190");
		MC6.setBounds(284, 309, 118, 21);
		contentPane.add(MC6);
		
		JCheckBox MC3 = new JCheckBox("Advil@170");
		MC3.setBounds(28, 309, 93, 21);
		contentPane.add(MC3);
		
		JCheckBox MC2 = new JCheckBox("Tylenol@150");
		MC2.setBounds(28, 247, 118, 21);
		contentPane.add(MC2);
		
		JCheckBox MC1 = new JCheckBox("Asprin@100");
		MC1.setBounds(28, 191, 108, 21);
		contentPane.add(MC1);
		
		JLabel lblNewLabel_1 = new JLabel("Choose items and enter quantity.");
		lblNewLabel_1.setForeground(new Color(170, 208, 213));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(15, 142, 362, 43);
		contentPane.add(lblNewLabel_1);
		
		medicinetotal = new JTextField();
		medicinetotal.setColumns(10);
		medicinetotal.setBounds(330, 354, 108, 28);
		contentPane.add(medicinetotal);
		
		JLabel lblNewLabel_1_1 = new JLabel("Total:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(283, 354, 49, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JButton MB2 = new JButton("ADD");
		MB2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int totalmedicine=0,a=0,b=0,c=0,d=0,f=0,h=0;
				
				if(MC1.isSelected()) {
					
					a=Integer.parseInt(MF1.getText());
					totalmedicine=a*100+totalmedicine;
				}
				if(MC2.isSelected()) {
					
					b=Integer.parseInt(MF2.getText());
					totalmedicine=b*150+totalmedicine;
				}
				if(MC3.isSelected()) {
					
					c=Integer.parseInt(MF3.getText());
					totalmedicine=c*170+totalmedicine;
				}
				if(MC4.isSelected()) {
					
					d=Integer.parseInt(MF1.getText());
					totalmedicine=d*130+totalmedicine;
				}
				if(MC5.isSelected()) {
					
					f=Integer.parseInt(MF5.getText());
					totalmedicine=f*120+totalmedicine;
				}
				if(MC6.isSelected()) {
					
					h=Integer.parseInt(MF6.getText());
					totalmedicine=h*190+totalmedicine;
				}
				medicinetotal.setText(" "+totalmedicine);
				
			}
		});
		MB2.setFont(new Font("Tahoma", Font.BOLD, 11));
		MB2.setBounds(340, 394, 85, 21);
		contentPane.add(MB2);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				int totalmedicine=0,a=0,b=0,c=0,d=0,f=0,h=0;
				
				if(MC1.isSelected()) {
					
					a=Integer.parseInt(MF1.getText());
					totalmedicine=a*100+totalmedicine;
				}
				if(MC2.isSelected()) {
					
					b=Integer.parseInt(MF2.getText());
					totalmedicine=b*150+totalmedicine;
				}
				if(MC3.isSelected()) {
					
					c=Integer.parseInt(MF3.getText());
					totalmedicine=c*170+totalmedicine;
				}
				if(MC4.isSelected()) {
					
					d=Integer.parseInt(MF1.getText());
					totalmedicine=d*130+totalmedicine;
				}
				if(MC5.isSelected()) {
					
					f=Integer.parseInt(MF5.getText());
					totalmedicine=f*120+totalmedicine;
				}
				if(MC6.isSelected()) {
					
					h=Integer.parseInt(MF6.getText());
					totalmedicine=h*190+totalmedicine;
				}
				
				JFrame frame3 = new Other(totalbaby,totalwomen,totalmedicine);
				frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame3.setVisible(true);
			
				dispose();
				
				
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNext.setBackground(new Color(203, 237, 239));
		btnNext.setBounds(159, 394, 89, 23);
		contentPane.add(btnNext);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\Medicine frame.png"));
		lblNewLabel.setBounds(0, 0, 588, 440);
		contentPane.add(lblNewLabel);
	}
}
