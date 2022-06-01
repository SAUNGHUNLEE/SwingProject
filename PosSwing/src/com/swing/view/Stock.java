package com.swing.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.SystemColor;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Stock extends JFrame {


	public static void main(String[] args) {
	
	}

	/**
	 * Create the frame.
	 */
	public Stock() {
		JFrame frame = new JFrame("재고");
		frame.setTitle("\uACC4\uC815");
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);

		String[] headings = new String[]{"상품코드","입고일자","상품명","수량","가격","유통기한"};
		Object[][] data = new Object[][] {
			{"ABC-123","2022-06-01","참이슬","3","1000","2022-06-10"}
		
		};
		panel.setLayout(null);
		JTable StockTable = new JTable(data,headings);
		StockTable.setBackground(SystemColor.inactiveCaption);
		StockTable.setPreferredScrollableViewportSize(new Dimension(700,600));
		
		//setvisible 느낌
		StockTable.setFillsViewportHeight(true);
		
		//이걸 추가해줘야 전체적인 테이블모양이 나옴
		JScrollPane Stock = new JScrollPane(StockTable);
		Stock.setBounds(0, 74, 702, 328);
		panel.add(Stock);
		
		frame.getContentPane().add(panel);
		
		JLabel lblTitle = new JLabel();
		lblTitle.setIcon(new ImageIcon(Stock.class.getResource("/com/swing/Image/image/title.png")));
		lblTitle.setBounds(0, 0, 884, 75);
		panel.add(lblTitle);
		
		JButton btnStockInvenTory = new JButton("\uC7AC\uACE0\uC870\uD68C");
		btnStockInvenTory.setBounds(764, 74, 120, 75);
		panel.add(btnStockInvenTory);
		
		JButton btnStockModify = new JButton("\uC7AC\uACE0\uC218\uC815");
		btnStockModify.setBounds(764, 144, 120, 75);
		panel.add(btnStockModify);
		
		JButton btnStockAdd = new JButton("\uC785\uACE0");
		btnStockAdd.setBounds(764, 217, 120, 75);
		panel.add(btnStockAdd);
		
		JButton btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setBounds(764, 290, 120, 75);
		panel.add(btnCancel);
		
		
		
		frame.setVisible(true);
		frame.setSize(900,500);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
