import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;

public class AccountUI extends JFrame {
	private Account getBalance;
	private Account deposit;
	private Account withdraw;
	private Account Account;
	//check what to take
	private JPanel contentPane;
	private JTextField txtName;
	private JTable tableAccounts;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountUI frame = new AccountUI();
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
	public AccountUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNew = new JButton("New");
		btnNew.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNew.setBounds(12, 410, 411, 56);
		btnNew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			}
		});		
		contentPane.add(btnNew);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnDelete.setBounds(458, 410, 401, 56);
		btnDelete.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
			
			}
		});
		contentPane.add(btnDelete);
		
		JRadioButton rdbtnChecking = new JRadioButton("Checking Account");
		rdbtnChecking.setEnabled(false);
		rdbtnChecking.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnChecking.setBounds(138, 376, 225, 25);
		contentPane.add(rdbtnChecking);
		
		JRadioButton rdbtnSavings = new JRadioButton("Savings Account");
		rdbtnSavings.setEnabled(false);
		rdbtnSavings.setFont(new Font("Tahoma", Font.PLAIN, 25));
		rdbtnSavings.setBounds(512, 376, 232, 25);
		contentPane.add(rdbtnSavings);
		
		txtName = new JTextField();
		txtName.setEnabled(false);
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtName.setBounds(111, 278, 273, 89);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblQuestion = new JLabel("Hello! Welcome to the Bank! Would you like to make a new account or delete an old one?");
		//ask how to get text to wrap so it doesnt just go in a line
		lblQuestion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblQuestion.setVerticalAlignment(SwingConstants.TOP);
		lblQuestion.setBounds(111, 209, 647, 56);
		contentPane.add(lblQuestion);
		
		tableAccounts = new JTable();
		//how to do this in general
		tableAccounts.setEnabled(false);
		tableAccounts.setColumnSelectionAllowed(true);
		tableAccounts.setCellSelectionEnabled(true);
		tableAccounts.setBounds(111, 26, 647, 170);
		contentPane.add(tableAccounts);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 30));
		textField.setEnabled(false);
		textField.setColumns(10);
		textField.setBounds(485, 278, 273, 89);
		contentPane.add(textField);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.setEnabled(false);
		btnDeposit.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnDeposit.setBounds(12, 484, 411, 56);
		contentPane.add(btnDeposit);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setEnabled(false);
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnWithdraw.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnWithdraw.setBounds(458, 484, 401, 56);
		contentPane.add(btnWithdraw);
		
	}
}
