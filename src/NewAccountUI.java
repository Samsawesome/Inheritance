import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class NewAccountUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAccountUI frame = new NewAccountUI();
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
	public NewAccountUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnChecking = new JRadioButton("Checking Account");
		rdbtnChecking.setBounds(154, 353, 225, 25);
		rdbtnChecking.setEnabled(false);
		rdbtnChecking.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(rdbtnChecking);
		
		JRadioButton rdbtnSavings = new JRadioButton("Savings Account");
		rdbtnSavings.setBounds(511, 348, 209, 34);
		rdbtnSavings.setEnabled(false);
		rdbtnSavings.setFont(new Font("Tahoma", Font.PLAIN, 25));
		contentPane.add(rdbtnSavings);
		
		txtName = new JTextField();
		txtName.setBounds(0, 245, 872, 43);
		txtName.setEnabled(true);
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		
	}

}
