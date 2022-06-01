package com.swing.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountManageMent extends JFrame {



	public static void main(String[] args) {

	}

	
	/**
	 * Create the frame.
	 */
	public AccountManageMent() {
		
		JFrame frame = new JFrame("상품 목록");
		frame.setTitle("\uACC4\uC815");
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);

		String[] headings = new String[]{"번호","비밀번호","아이디","권한","이름"};
		Object[][] data = new Object[][] {
			{"1","1234","admin","A","노원점"}
		
		};
		panel.setLayout(null);
		JTable AccountTable = new JTable(data,headings);
		AccountTable.setBackground(SystemColor.inactiveCaption);
		AccountTable.setPreferredScrollableViewportSize(new Dimension(700,600));
		
		//setvisible 느낌
		AccountTable.setFillsViewportHeight(true);
		
		//이걸 추가해줘야 전체적인 테이블모양이 나옴
		JScrollPane Account = new JScrollPane(AccountTable);
		Account.setBounds(0, 74, 702, 328);
		panel.add(Account);
		
		frame.getContentPane().add(panel);
		
		JLabel lblTitle = new JLabel();
		lblTitle.setIcon(new ImageIcon(AccountManageMent.class.getResource("/com/swing/Image/image/title.png")));
		lblTitle.setBounds(0, 0, 884, 75);
		panel.add(lblTitle);
		
		JButton btnAdd = new JButton("\uB4F1\uB85D");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CustomerAdd();
				
			}
		});
		btnAdd.setBounds(764, 74, 120, 75);
		panel.add(btnAdd);
		
		JButton btnModify = new JButton("\uC218\uC815");
		btnModify.setBounds(764, 145, 120, 75);
		panel.add(btnModify);
		
		JButton btnDelete = new JButton("\uC0AD\uC81C");
		btnDelete.setBounds(764, 216, 120, 75);
		panel.add(btnDelete);
		
		JButton btnBack = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnBack.setBounds(764, 288, 120, 75);
		panel.add(btnBack);
		
		frame.setVisible(true);
		frame.setSize(900,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
