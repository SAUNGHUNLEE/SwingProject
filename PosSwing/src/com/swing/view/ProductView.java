package com.swing.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class ProductView extends JFrame {
	
	public ProductView() {
		
		
		JFrame frame = new JFrame("상품 목록");
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);

		String[] headings = new String[]{"번호","상품코드","상품명","금액","수량","입고일","비고"};
		Object[][] data = new Object[][] {
			{"1","ABC-123","참이슬","1000","1","2",""}
		
		};
		panel.setLayout(null);
		
	
		JTable ProductTable = new JTable(data,headings);
		ProductTable.setBackground(SystemColor.inactiveCaption);
		ProductTable.setPreferredScrollableViewportSize(new Dimension(700,600));
		
		//setvisible 느낌
		ProductTable.setFillsViewportHeight(true);
		
		//이걸 추가해줘야 전체적인 테이블모양이 나옴
		JScrollPane Product = new JScrollPane(ProductTable);
		Product.setBounds(0, 74, 702, 356);
		panel.add(Product);
		
		frame.getContentPane().add(panel);
	
		frame.setVisible(true);
		frame.setSize(900,520);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ProductButton(panel);
	}


	
	
	
	public void ProductButton(JPanel panel)
	{
		
		JLabel lblTitle = new JLabel();
		lblTitle.setIcon(new ImageIcon(ProductView.class.getResource("/com/swing/Image/image/title.png")));
		lblTitle.setBounds(0, 0, 883, 75);
		panel.add(lblTitle);
		
		
		JButton btnProBuy = new JButton("\uC0C1\uD488\uACB0\uC81C");
		btnProBuy.setBounds(756, 74, 137, 75);
		panel.add(btnProBuy);
		
		JButton btnProModi = new JButton("\uC0C1\uD488\uC218\uC815");
		btnProModi.setBounds(756, 145, 137, 75);
		panel.add(btnProModi);
		
		JButton btnProCancel = new JButton("\uC0C1\uD488\uCDE8\uC18C");
		btnProCancel.setBounds(756, 216, 137, 75);
		panel.add(btnProCancel);
		
		JButton btnProRefun = new JButton("\uD658\uBD88");
		btnProRefun.setBounds(756, 284, 137, 75);
		panel.add(btnProRefun);
		
		JButton btnRollBack = new JButton("\uAC70\uB798\uCDE8\uC18C");
		btnRollBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRollBack.setBounds(756, 355, 137, 75);
		panel.add(btnRollBack);
	}

	public static void main(String[] args) {
//		JFrame frame = new JFrame("상품 목록");
//		JPanel panel = new JPanel();
//
//		String[] headings = new String[]{"번호","상품코드","상품명","단가","수량","금액","입고"};
//		Object[][] data = new Object[][] {
//			{"1","ABC-123","참이슬","1000","1","1500","2022-06-01"}
//		
//		};
//		JTable table = new JTable(data,headings);
//		table.setPreferredScrollableViewportSize(new Dimension(700,600));
//		
//		//setvisible 느낌
//		table.setFillsViewportHeight(true);
//		
//		//이걸 추가해줘야 전체적인 테이블모양이 나옴
//		panel.add(new JScrollPane(table));
//		
//		frame.getContentPane().add(panel);
//		
//		frame.setVisible(true);
//		frame.setSize(800,640);
//		frame.setLocationRelativeTo(null);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
