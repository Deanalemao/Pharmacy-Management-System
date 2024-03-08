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

public class Medicine extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField MF1;
	private JTextField MF2;
	private JTextField MF3;
	private JTextField MF4;
	private JTextField MF5;
	private JTextField MF6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Medicine frame = new Medicine();
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
	public Medicine() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\medicine-symbol.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton medicineTohome = new JButton("Back");
		medicineTohome.setFont(new Font("Tahoma", Font.BOLD, 12));
		medicineTohome.setBackground(new Color(203, 237, 239));
		medicineTohome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home frame = new Home();
				frame.setVisible(true);
				
			}
		});
		
		JButton MB2 = new JButton("ADD");
		MB2.setFont(new Font("Tahoma", Font.BOLD, 11));
		MB2.setBounds(341, 393, 85, 21);
		contentPane.add(MB2);
		
		MF6 = new JTextField();
		MF6.setBounds(430, 310, 96, 19);
		contentPane.add(MF6);
		MF6.setColumns(10);
		
		MF5 = new JTextField();
		MF5.setBounds(430, 248, 96, 19);
		contentPane.add(MF5);
		MF5.setColumns(10);
		
		MF4 = new JTextField();
		MF4.setBounds(430, 192, 96, 19);
		contentPane.add(MF4);
		MF4.setColumns(10);
		
		MF3 = new JTextField();
		MF3.setBounds(152, 310, 96, 19);
		contentPane.add(MF3);
		MF3.setColumns(10);
		
		MF2 = new JTextField();
		MF2.setBounds(152, 248, 96, 19);
		contentPane.add(MF2);
		MF2.setColumns(10);
		
		MF1 = new JTextField();
		MF1.setBounds(152, 192, 96, 19);
		contentPane.add(MF1);
		MF1.setColumns(10);
		
		JCheckBox MC4 = new JCheckBox("Zestril@130");
		MC4.setBounds(284, 191, 93, 21);
		contentPane.add(MC4);
		
		JCheckBox MC5 = new JCheckBox("Zocor@120");
		MC5.setBounds(284, 247, 93, 21);
		contentPane.add(MC5);
		
		JCheckBox MC6 = new JCheckBox("Benadryl@190");
		MC6.setBounds(284, 309, 93, 21);
		contentPane.add(MC6);
		
		JCheckBox MC3 = new JCheckBox("Advil@170");
		MC3.setBounds(28, 309, 93, 21);
		contentPane.add(MC3);
		
		JCheckBox MC2 = new JCheckBox("Tylenol@150");
		MC2.setBounds(28, 247, 93, 21);
		contentPane.add(MC2);
		
		JCheckBox MC1 = new JCheckBox("Asprin@100");
		MC1.setBounds(28, 191, 93, 21);
		contentPane.add(MC1);
		medicineTohome.setBounds(10, 393, 89, 23);
		contentPane.add(medicineTohome);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\Medicine frame.png"));
		lblNewLabel.setBounds(0, 0, 588, 440);
		contentPane.add(lblNewLabel);
	}

}
