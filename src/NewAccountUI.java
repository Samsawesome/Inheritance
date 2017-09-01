import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

public class NewAccountUI extends AccountUI {

	private JPanel contentPane;
	private static JTextField txtEnterName;
	private Account result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAccountUI frame = new NewAccountUI(null, null, txtEnterName);
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
	public NewAccountUI(JSpinner spinner_type_account, JSpinner spinner_age, JTextField txtName) {
		super(spinner_type_account, spinner_age, txtEnterName);
		this.spinner_age = spinner_age;
		this.txtEnterName = txtEnterName;
		this.spinner_type_account = spinner_type_account;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtEnterName = new JTextField();
		txtEnterName.setBounds(12, 109, 367, 43);
		txtEnterName.setEnabled(true);
		txtEnterName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(txtEnterName);
		txtEnterName.setColumns(10);
		
		 
		spinner_age.setFont(new Font("Tahoma", Font.PLAIN, 26));
		spinner_age.setModel(new SpinnerNumberModel(0, 0, 125, 1));
		spinner_age.setBounds(415, 107, 126, 43);
		contentPane.add(spinner_age);
		
		
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
		btnOkay.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(spinner_age.getValue().equals(0)  || txtEnterName.getText().equals("")){
					lblPromt.setText("Please fill out your name and age.");
				}
				else if((Integer) spinner_age.getValue() <= 17 && spinner_type_account.getValue().equals("Checking")){
					lblPromt.setText("You can not have a checking account if you are less than 18 years old.");
				}
				else {
					if(spinner_type_account.getValue().equals("Checking")){
						result = new Checking(txtEnterName.getText(), 0, (Integer) spinner_age.getValue());
					} 
					else result = new Savings(txtEnterName.getText(), 0, (Integer) spinner_age.getValue(), 0.01);
					
					setVisible(false);
					dispose();
				}
			}
		});		
		//if you hit okay make it check that there is filled out requirments in each thing and if there isnt tell them to fill it out
		contentPane.add(btnOkay);
		
	}
	
	Account showDialog(){
		setVisible(true);
		return result;
	}
}
