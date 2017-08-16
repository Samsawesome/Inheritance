import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerListModel;
import javax.swing.JLabel;
import javax.swing.JButton;

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
		setBounds(100, 100, 750, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtName = new JTextField();
		txtName.setBounds(12, 109, 367, 43);
		txtName.setEnabled(true);
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JSpinner spinner_age = new JSpinner();
		spinner_age.setFont(new Font("Tahoma", Font.PLAIN, 26));
		spinner_age.setModel(new SpinnerNumberModel(0, 0, 125, 1));
		spinner_age.setBounds(415, 107, 126, 43);
		contentPane.add(spinner_age);
		
		JSpinner spinner_type_account = new JSpinner();
		spinner_type_account.setFont(new Font("Tahoma", Font.PLAIN, 26));
		spinner_type_account.setModel(new SpinnerListModel(new String[] {"Checking", "Savings"}));
		spinner_type_account.setBounds(585, 107, 135, 43);
		contentPane.add(spinner_type_account);
		
		JLabel lblPromt = new JLabel("Enter your name, age and type of account.");
		lblPromt.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblPromt.setBounds(117, 59, 498, 37);
		contentPane.add(lblPromt);
		
		JButton btnOkay = new JButton("Okay");
		btnOkay.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnOkay.setBounds(22, 165, 698, 75);
		contentPane.add(btnOkay);
		
		
	}
}
