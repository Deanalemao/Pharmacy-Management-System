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

public class Womencare extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TF3;
	private JTextField TF2;
	private JTextField TF1;
	private JTextField TF4;
	private JTextField TF5;
	private JTextField TF6;
	private JTextField womentotal;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
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
	}*/

	/**
	 * Create the frame.
	 */

	public Womencare(int totalbaby) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\medicine-symbol.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TF6 = new JTextField();
		TF6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					TF6.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					TF6.setText(" ");
				}
			}
		});
		TF6.setBounds(318, 258, 81, 19);
		contentPane.add(TF6);
		TF6.setColumns(10);
		
		TF5 = new JTextField();
		TF5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					TF5.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					TF5.setText(" ");
				}
			}
		});
		TF5.setBounds(318, 211, 81, 19);
		contentPane.add(TF5);
		TF5.setColumns(10);
		
		TF4 = new JTextField();
		TF4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					TF4.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					TF4.setText(" ");
				}
			}
		});
		TF4.setBounds(317, 158, 81, 19);
		contentPane.add(TF4);
		TF4.setColumns(10);
		
		TF1 = new JTextField();
		TF1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					TF1.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					TF1.setText(" ");
				}
			}
		});
		TF1.setBounds(141, 158, 57, 19);
		contentPane.add(TF1);
		TF1.setColumns(10);
		
		TF2 = new JTextField();
		TF2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					TF2.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					TF2.setText(" ");
				}
			}
		});
		TF2.setBounds(141, 211, 57, 19);
		contentPane.add(TF2);
		TF2.setColumns(10);
		
		TF3 = new JTextField();
		TF3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
		
				if(Character.isDigit(d)) {
					TF3.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					TF3.setText(" ");
				}
			}
		});
		TF3.setBounds(141, 258, 57, 19);
		contentPane.add(TF3);
		TF3.setColumns(10);
		
		JCheckBox WC6 = new JCheckBox("Soap@20");
		WC6.setBackground(new Color(192, 185, 221));
		WC6.setBounds(204, 257, 108, 21);
		contentPane.add(WC6);
		
		JCheckBox WC3 = new JCheckBox("Gels@70");
		WC3.setBackground(new Color(192, 185, 221));
		WC3.setBounds(17, 257, 118, 21);
		contentPane.add(WC3);
		
		JCheckBox WC5 = new JCheckBox("Shampoo@80");
		WC5.setBackground(new Color(192, 185, 221));
		WC5.setBounds(204, 210, 108, 21);
		contentPane.add(WC5);
		
		JCheckBox WC4 = new JCheckBox("Creams@30");
		WC4.setBackground(new Color(192, 185, 221));
		WC4.setBounds(204, 157, 107, 21);
		contentPane.add(WC4);
		
		JCheckBox WC2 = new JCheckBox("Pads@40");
		WC2.setBackground(new Color(192, 185, 221));
		WC2.setBounds(17, 210, 118, 21);
		contentPane.add(WC2);
		
		JCheckBox WC1 = new JCheckBox("Tampons@50");
		WC1.setBackground(new Color(192, 185, 221));
		WC1.setBounds(17, 157, 118, 21);
		contentPane.add(WC1);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int totalwomen=0,a=0,b=0,c=0,d=0,f=0,h=0;
				if(WC1.isSelected()) {
					a=Integer.parseInt(TF1.getText());
					totalwomen=a*50+totalwomen;
				}
				if(WC2.isSelected()) {
					b=Integer.parseInt(TF2.getText());
					totalwomen=b*40+totalwomen;
				}
				if(WC3.isSelected()) {
					c=Integer.parseInt(TF3.getText());
					totalwomen=c*70+totalwomen;
				}
				if(WC4.isSelected()) {
					d=Integer.parseInt(TF4.getText());
					totalwomen=d*30+totalwomen;
				}
				if(WC5.isSelected()) {
					f=Integer.parseInt(TF5.getText());
					totalwomen=f*80+totalwomen;
				}
				if(WC6.isSelected()) {
					h=Integer.parseInt(TF6.getText());
					totalwomen=h*20+totalwomen;
				}
				
				
				JFrame frame3 = new Medicine(totalbaby,totalwomen);
				frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame3.setVisible(true);
			
				dispose();
				
				
//				
//				Medicine frame = new Medicine();
//				frame.setVisible(true);
//				
//				dispose();
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNext.setBackground(new Color(223, 216, 233));
		btnNext.setBounds(131, 396, 89, 23);
		contentPane.add(btnNext);
		
		womentotal = new JTextField();
		womentotal.setBounds(250, 357, 108, 28);
		contentPane.add(womentotal);
		womentotal.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int totalwomen=0,a=0,b=0,c=0,d=0,f=0,h=0;
				if(WC1.isSelected()) {
					a=Integer.parseInt(TF1.getText());
					totalwomen=a*50+totalwomen;
				}
				if(WC2.isSelected()) {
					b=Integer.parseInt(TF2.getText());
					totalwomen=b*40+totalwomen;
				}
				if(WC3.isSelected()) {
					c=Integer.parseInt(TF3.getText());
					totalwomen=c*70+totalwomen;
				}
				if(WC4.isSelected()) {
					d=Integer.parseInt(TF4.getText());
					totalwomen=d*30+totalwomen;
				}
				if(WC5.isSelected()) {
					f=Integer.parseInt(TF5.getText());
					totalwomen=f*80+totalwomen;
				}
				if(WC6.isSelected()) {
					h=Integer.parseInt(TF6.getText());
					totalwomen=h*20+totalwomen;
				}
				
				
				womentotal.setText(""+totalwomen);
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAdd.setBackground(new Color(223, 216, 233));
		btnAdd.setBounds(260, 397, 89, 23);
		contentPane.add(btnAdd);
		
		JLabel lblNewLabel = new JLabel("Choose items and enter quantity.");
		lblNewLabel.setForeground(new Color(164, 158, 224));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(10, 104, 362, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Total:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(202, 359, 49, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel Addwomen = new JLabel("New label");
		Addwomen.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\women care frame.png"));
		Addwomen.setBounds(0, 0, 588, 440);
		contentPane.add(Addwomen);
	}
}
