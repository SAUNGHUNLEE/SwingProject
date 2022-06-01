package com.swing.view;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.swing.database.DBConnection;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CustomerAdd extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtName;
	private JTextField txtPwd;
	private JTextField txtAuth;
	private JButton btnSubmit;
	private DBConnection dc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the frame.
	 */
	public CustomerAdd() {
		setTitle("\uACC4\uC815\uB4F1\uB85D");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ADDPanel(contentPane);
		setVisible(true);


	}
	
	public void ADDPanel(JPanel panel)
	{
		JLabel lblPwd = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblPwd.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblPwd.setBounds(45, 135, 88, 42);
		contentPane.add(lblPwd);
		
		JLabel lblID = new JLabel("\uC544\uC774\uB514");
		lblID.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblID.setBounds(52, 58, 61, 42);
		contentPane.add(lblID);
		
		txtId = new JTextField();
		txtId.setColumns(10);
		txtId.setBounds(156, 66, 116, 30);
		contentPane.add(txtId);
		
		JLabel lblAuth = new JLabel("\uAD8C\uD55C");
		lblAuth.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblAuth.setBounds(63, 178, 43, 36);
		contentPane.add(lblAuth);
		
		JLabel lblName = new JLabel("\uC774\uB984");
		lblName.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		lblName.setBounds(63, 101, 43, 36);
		contentPane.add(lblName);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(156, 106, 116, 30);
		contentPane.add(txtName);
		
		txtPwd = new JTextField();
		txtPwd.setColumns(10);
		txtPwd.setBounds(156, 143, 116, 30);
		contentPane.add(txtPwd);
		
		txtAuth = new JTextField();
		txtAuth.setColumns(10);
		txtAuth.setBounds(156, 183, 116, 30);
		contentPane.add(txtAuth);
		
		btnSubmit = new JButton("\uD655\uC778");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String idTxt = txtId.getText();
				String nameTxt = txtName.getText();
				String passTxt = txtPwd.getText();
				String authTxt = txtAuth.getText();
				
				dc.createUser(idTxt, nameTxt, passTxt, authTxt);
				JOptionPane.showMessageDialog(null,"ÀúÀå ¼º°ø");
				
			}
		});
		
		btnSubmit.setBounds(129, 235, 70, 30);
		contentPane.add(btnSubmit);
	}

}
