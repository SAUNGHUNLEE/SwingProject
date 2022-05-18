package com.swing.view;


import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;

import java.awt.Font;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainView extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		

	}

	/**
	 * Create the frame.
	 */
	public MainView() {
		setTitle("MainView");
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		MainPanel(contentPane);
		
		//����ð�,���������� ���ǵ���ϴ� ������� �˷��ִ� ����
		JLabel lblNewLabel = new JLabel("\uD604\uC7AC\uC2DC\uAC04 \uD45C\uC2DC,?\uB2D8(\uAD00\uB9AC\uC790or\uBB3C\uD488\uB4F1\uB85D\uD558\uB294\uC0AC\uB78C)");
		lblNewLabel.setFont(new Font("����", Font.BOLD, 15));
		lblNewLabel.setBounds(600, 83, 314, 84);
		contentPane.add(lblNewLabel);
		
	

		
		
	}
	
	//�̹��� ũ�� ����,�̹����������̾ƴ� �̹��� ���� �̷��������(ũ�⸦ �����ص� �߸��� �κ��� �Ȼ���)
	ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage();  //ImageIcon�� Image�� ��ȯ.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg); 
		return xyimg;
	}
	
	ImageIcon imageSetSize2(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage();  //ImageIcon�� Image�� ��ȯ.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg); 
		return xyimg;
	}
	
	ImageIcon imageSetSize3(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage();  //ImageIcon�� Image�� ��ȯ.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg); 
		return xyimg;
	}
	
	ImageIcon imageSetSize4(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage();  //ImageIcon�� Image�� ��ȯ.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg); 
		return xyimg;
	}
	
	ImageIcon imageSetSize5(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage();  //ImageIcon�� Image�� ��ȯ.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg); 
		return xyimg;
	}
	
	ImageIcon imageSetSize6(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage();  //ImageIcon�� Image�� ��ȯ.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg); 
		return xyimg;
	}
	
	
	public void MainPanel(JPanel panel) {

		JLabel lblTitle = new JLabel("");
		ImageIcon titleimg = new ImageIcon(MainView.class.getResource("/com/swing/Image/image/title.png"));
		titleimg = imageSetSize(titleimg,1800,200);
		lblTitle.setIcon(titleimg);
		lblTitle.setBounds(0, 0, 944, 73);
		contentPane.add(lblTitle);


		
		//�޼��� ������
		JLabel lblMessage = new JLabel();
		ImageIcon messageImg = new ImageIcon(LoginView.class.getResource("/com/swing/Image/image/message.png"));
		messageImg = imageSetSize6(messageImg,50,50);
		lblMessage.setIcon(messageImg);
		
		lblMessage.setBounds(34, 83, 50, 57);
		contentPane.add(lblMessage);
		
		//�ȳ��ϼ���. KM25�Դϴ�.
		JLabel lblMessageInput = new JLabel("\uC5B4\uC11C\uC624\uC138\uC694. KM25\uC785\uB2C8\uB2E4.");
		lblMessageInput.setFont(new Font("����", Font.BOLD, 15));
		lblMessageInput.setBounds(96, 97, 241, 29);
		contentPane.add(lblMessageInput);
		
		
		//��ǰ�Ǹ�
		JButton btnProductSale = new JButton("\uD310\uB9E4");
		btnProductSale.setFont(new Font("����", Font.BOLD, 25));
		
		ImageIcon productImg = new ImageIcon(LoginView.class.getResource("/com/swing/Image/image/product.png"));
		productImg = imageSetSize2(productImg,100,100);
		btnProductSale.setIcon(productImg);
		

		contentPane.add(btnProductSale);
		btnProductSale.setBounds(59, 184, 193, 151);
		contentPane.add(btnProductSale);
		
		//���
		JButton btnChart = new JButton("\uD1B5\uACC4");
		btnChart.setFont(new Font("����", Font.BOLD, 25));
		
		ImageIcon chartImg = new ImageIcon(LoginView.class.getResource("/com/swing/Image/image/statistics.png"));
		chartImg = imageSetSize3(chartImg,100,100);
		btnChart.setIcon(chartImg);
		
		btnChart.setBounds(354, 184, 193, 151);
		contentPane.add(btnChart);

		//���
		JButton btnStock = new JButton("\uC7AC\uACE0");
		btnStock.setFont(new Font("����", Font.BOLD, 25));
		
		ImageIcon stockImg = new ImageIcon(LoginView.class.getResource("/com/swing/Image/image/quantity.png"));
		stockImg = imageSetSize4(stockImg,50,50);
		btnStock.setIcon(stockImg);
		
		btnStock.setBounds(639, 270, 224, 65);
		contentPane.add(btnStock);
		
		//����
		JButton btnTotalPrice = new JButton("\uC815\uC0B0");
		btnTotalPrice.setFont(new Font("����", Font.BOLD, 25));
		
		ImageIcon totalImg = new ImageIcon(LoginView.class.getResource("/com/swing/Image/image/totalPrice.png"));
		totalImg = imageSetSize5(totalImg,50,50);
		btnTotalPrice.setIcon(totalImg);
		
		btnTotalPrice.setBounds(639, 184, 224, 65);
		contentPane.add(btnTotalPrice);
		
		
		
		//�������
		JButton btnAdminAdd = new JButton("\uACC4\uC815\uB4F1\uB85D");
		btnAdminAdd.setFont(new Font("����", Font.BOLD, 20));
		btnAdminAdd.setBounds(59, 378, 127, 84);
		contentPane.add(btnAdminAdd);
		

		
		//��������
		JButton btnModify = new JButton("\uACC4\uC815\uC218\uC815");
		btnModify.setFont(new Font("����", Font.BOLD, 20));
		btnModify.setBounds(275, 378, 127, 84);
		contentPane.add(btnModify);
		
		//��������
		JButton btnDelete = new JButton("\uACC4\uC815\uC0AD\uC81C");
		btnDelete.setFont(new Font("����", Font.BOLD, 20));
		btnDelete.setBounds(479, 378, 127, 84);
		contentPane.add(btnDelete);
		
		
		//�α׾ƿ�
		JButton btnLogOut = new JButton("\uB85C\uADF8\uC544\uC6C3");
		btnLogOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	
		btnLogOut.setFont(new Font("����", Font.BOLD, 20));
		btnLogOut.setBounds(688, 378, 127, 84);
		contentPane.add(btnLogOut);
		
	
	

		
		
	
		
	
	}
}
