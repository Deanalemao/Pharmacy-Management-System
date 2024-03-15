//THIRD FRAME
import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;

public class Checkout extends JFrame {

  public Checkout(int totalbaby,int totalwomen,int totalmedicine,int totalother) {
  	setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\medicine-symbol.png"));
      setTitle("Frame 3: Display Results");
      setSize(600, 475);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JLabel label = new JLabel("Total of Baby Products: " + totalbaby);
      label.setBounds(101, 114, 336, 38);
      label.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
     // JLabel lblNewLabel = new JLabel("Result from Frame 1: " + result1 + "Result from Frame 2: " + result2);
      label.setHorizontalAlignment(SwingConstants.CENTER);
      
     // JLabel lblNewLabel = new JLabel(" Total of Women Products: " + w);
      //lblNewLabel.setFont(new Font("Product Sans", Font.BOLD, 16));
     // lblNewLabel.setBounds(115, 90, 437, 20);
      //panel.add(lblNewLabel);
      //label.setHorizontalAlignment(SwingConstants.CENTER);
      

      JPanel panel = new JPanel();
      panel.setLayout(null);
      panel.add(label);

      getContentPane().add(panel);
      
      JLabel lblNewLabel_1 = new JLabel(" Total of Women Products: " + totalwomen);
      lblNewLabel_1.setBounds(143, 151, 328, 38);
      lblNewLabel_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
      panel.add(lblNewLabel_1);
      
     /* JLabel lblNewLabel_2 = new JLabel(" Total of Medicine Products: " + x);
      lblNewLabel_2.setFont(new Font("Product Sans", Font.BOLD, 16));
      lblNewLabel_2.setBounds(324, 106, 246, 25);
      panel.add(lblNewLabel_2);*/
      
      int fina=0;
      fina=totalbaby+totalwomen+totalmedicine+totalother;
      
      JLabel lblNewLabel = new JLabel("FINAL TOTAL IS: "+ fina);
      lblNewLabel.setBounds(132, 293, 415, 57);
      lblNewLabel.setFont(new Font("Engravers MT", Font.BOLD, 22));
      panel.add(lblNewLabel);
      
      JLabel lblTotalOfMedicine = new JLabel("Total of Medicine Products: "+totalmedicine);
      lblTotalOfMedicine.setBounds(92, 188, 379, 32);
      lblTotalOfMedicine.setHorizontalAlignment(SwingConstants.CENTER);
      lblTotalOfMedicine.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
      panel.add(lblTotalOfMedicine);
      
      JLabel label_1_1 = new JLabel("Total of  Other Products: "+totalother);
      label_1_1.setBounds(101, 220, 347, 38);
      label_1_1.setHorizontalAlignment(SwingConstants.CENTER);
      label_1_1.setFont(new Font("Leelawadee UI", Font.BOLD, 20));
      panel.add(label_1_1);
      
      JButton btnNewButton = new JButton("Payment");
      btnNewButton.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent e) {
      		
      		Payment pay = new Payment();
      		pay.setVisible(true);  
      		dispose();
      		}
      });
      btnNewButton.setBackground(new Color(237, 231, 146));
      btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
      btnNewButton.setBounds(424, 387, 108, 32);
      panel.add(btnNewButton);
      
      JLabel lblNewLabel_2 = new JLabel("New label");
      lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Dean Alemao\\eclipse-workspace\\Pharmacy Management System\\Pharmacy_system\\images\\bill recipt.png"));
      lblNewLabel_2.setBounds(0, 0, 588, 440);
      panel.add(lblNewLabel_2);
      
    
      
  }




public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
          JFrame frame = new Checkout(0,0,0,0); // Default values, will be replaced by actual results
          frame.setVisible(true);
      });
  }
}

