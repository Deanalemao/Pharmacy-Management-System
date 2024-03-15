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
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Other extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField OF1;
	private JTextField OF2;
	private JTextField OF3;
	private JTextField OF6;
	private JTextField OF5;
	private JTextField OF4;
	private JTextField othertotal;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Other frame = new Other();
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
	public Other(int totalbaby,int totalwomen,int totalmedicine) {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\medicine-symbol.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		OF4 = new JTextField();
		OF4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					OF4.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					OF4.setText(" ");
				}
			}
		});
		OF4.setBounds(441, 211, 96, 19);
		contentPane.add(OF4);
		OF4.setColumns(10);
		
		OF5 = new JTextField();
		OF5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					OF5.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					OF5.setText(" ");
				}
			}
		});
		OF5.setBounds(441, 269, 96, 19);
		contentPane.add(OF5);
		OF5.setColumns(10);
		
		OF6 = new JTextField();
		OF6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					OF6.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					OF6.setText(" ");
				}
			}
		});
		OF6.setBounds(441, 323, 96, 19);
		contentPane.add(OF6);
		OF6.setColumns(10);
		
		OF3 = new JTextField();
		OF3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					OF3.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					OF3.setText(" ");
				}
			}
		});
		OF3.setBounds(156, 323, 96, 19);
		contentPane.add(OF3);
		OF3.setColumns(10);
		
		OF2 = new JTextField();
		OF2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					OF2.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					OF2.setText(" ");
				}
			}
		});
		OF2.setBounds(156, 269, 96, 19);
		contentPane.add(OF2);
		OF2.setColumns(10);
		
		OF1 = new JTextField();
		OF1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int d=e.getKeyChar();
				
				if(Character.isDigit(d)) {
					OF1.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(null, "Enter only Digits");
					OF1.setText(" ");
				}
			}
		});
		OF1.setBounds(156, 211, 96, 19);
		contentPane.add(OF1);
		OF1.setColumns(10);
		
		JCheckBox OC6 = new JCheckBox("Fashwash@150");
		OC6.setBounds(299, 322, 124, 21);
		contentPane.add(OC6);
		
		JCheckBox OC5 = new JCheckBox("Eyedrops@50");
		OC5.setBounds(299, 268, 124, 21);
		contentPane.add(OC5);
		
		JCheckBox OC4 = new JCheckBox("Condom@20");
		OC4.setBounds(299, 210, 124, 21);
		contentPane.add(OC4);
		
		JCheckBox OC3 = new JCheckBox("Pills@200");
		OC3.setBounds(25, 322, 104, 21);
		contentPane.add(OC3);
		
		JCheckBox OC2 = new JCheckBox("Band-aids@5");
		OC2.setBounds(25, 268, 104, 21);
		contentPane.add(OC2);
		
		JCheckBox OC1 = new JCheckBox("Lizol@99");
		OC1.setBounds(25, 210, 104, 21);
		contentPane.add(OC1);
		
		othertotal = new JTextField();
		othertotal.setColumns(10);
		othertotal.setBounds(292, 369, 108, 28);
		contentPane.add(othertotal);
		
		JLabel lblNewLabel_1 = new JLabel("Total:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(243, 368, 49, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Choose items and enter quantity.");
		lblNewLabel_1_1.setForeground(new Color(183, 187, 168));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1_1.setBounds(10, 155, 362, 43);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int totalother=0,a=0,b=0,c=0,d=0,f=0,h=0;
				
				if(OC1.isSelected()) {
					a=Integer.parseInt(OF1.getText());
					totalother=a*99+totalother;
				}

				if(OC2.isSelected()) {
					b=Integer.parseInt(OF2.getText());
					totalother=b*5+totalother;
				}

				if(OC3.isSelected()) {
					c=Integer.parseInt(OF3.getText());
					totalother=c*200+totalother;
				}

				if(OC4.isSelected()) {
					d=Integer.parseInt(OF4.getText());
					totalother=d*20+totalother;
				}

				if(OC5.isSelected()) {
					f=Integer.parseInt(OF5.getText());
					totalother=f*50+totalother;
				}

				if(OC6.isSelected()) {
					h=Integer.parseInt(OF6.getText());
					totalother=h*150+totalother;
				}
				
				othertotal.setText(" "+totalother);
			}
		});
		btnNewButton.setBounds(299, 408, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnBill = new JButton("Bill");
		btnBill.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int totalother=0,a=0,b=0,c=0,d=0,f=0,h=0;
				
				if(OC1.isSelected()) {
					a=Integer.parseInt(OF1.getText());
					totalother=a*99+totalother;
				}

				if(OC2.isSelected()) {
					b=Integer.parseInt(OF2.getText());
					totalother=b*5+totalother;
				}

				if(OC3.isSelected()) {
					c=Integer.parseInt(OF3.getText());
					totalother=c*200+totalother;
				}

				if(OC4.isSelected()) {
					d=Integer.parseInt(OF4.getText());
					totalother=d*20+totalother;
				}

				if(OC5.isSelected()) {
					f=Integer.parseInt(OF5.getText());
					totalother=f*50+totalother;
				}

				if(OC6.isSelected()) {
					h=Integer.parseInt(OF6.getText());
					totalother=h*150+totalother;
				}
				
//				
				
				JFrame frame3 = new Checkout(totalbaby,totalwomen,totalmedicine,totalother);
				frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame3.setVisible(true);
				
				
				dispose();
				
				
			}
		});
		btnBill.setBounds(452, 408, 85, 21);
		contentPane.add(btnBill);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\other frame.png"));
		lblNewLabel.setBounds(0, 0, 588, 440);
		contentPane.add(lblNewLabel);
	}
}
