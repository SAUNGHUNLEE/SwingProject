package com.swing.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.swing.main.LoginMain;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class LoginView extends JFrame {
	private LoginMain loginMain;
	private MainView mainView;

	private JPanel contentPane;
	private JPasswordField txtPassWord;
	private JTextField txtLoginName;
	private boolean bLoginCheck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		/*
		 * EventQueue.invokeLater(new Runnable() { public void run() { try { LoginView
		 * frame = new LoginView(); frame.setVisible(true); } catch (Exception e) {
		 * e.printStackTrace(); } } });
		 */
	}

	/**
	 * Create the frame.
	 */
	public LoginView() {
		setTitle("login");
		setResizable(false);// 창이 가운데 나오게
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 330, 590);
		getContentPane().setLayout(null);

		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		LoginPanel(contentPane);
		setVisible(true);

	}

	// 이미지 크기 조절,이미지아이콘이아닌 이미지 에서 이루어져야함(크기를 조절해도 잘리는 부분이 안생김)
	ImageIcon imageSetSize(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}

	ImageIcon imageSetSize2(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}

	ImageIcon imageSetSize3(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}

	ImageIcon imageSetSize4(ImageIcon icon, int i, int j) { // image Size Setting
		Image ximg = icon.getImage(); // ImageIcon을 Image로 변환.
		Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
		ImageIcon xyimg = new ImageIcon(yimg);
		return xyimg;
	}

	// 로그인,아이디
	public void LoginPanel(JPanel panel) {

		panel.setLayout(null);

		JLabel lblTitle = new JLabel();
		ImageIcon titleimg = new ImageIcon(LoginView.class.getResource("/com/swing/Image/image/title.png"));
		titleimg = imageSetSize3(titleimg, 330, 100);
		lblTitle.setIcon(titleimg);

		lblTitle.setBounds(0, 0, 327, 53);
		contentPane.add(lblTitle);

		JLabel lblBottom = new JLabel();
		ImageIcon bottomimg = new ImageIcon(LoginView.class.getResource("/com/swing/Image/image/title.png"));
		bottomimg = imageSetSize3(bottomimg, 330, 100);
		lblBottom.setIcon(bottomimg);

		lblBottom.setBounds(0, 475, 327, 86);
		contentPane.add(lblBottom);

		JLabel lblLogo = new JLabel("KM25 POS");
		contentPane.add(lblLogo);
		lblLogo.setForeground(new Color(0, 0, 0));
		lblLogo.setFont(new Font("Arial", Font.BOLD, 30));
		lblLogo.setBounds(97, 103, 180, 71);

		JLabel lblLoginName = new JLabel();

		// 로그인 아이콘
		ImageIcon loginimg = new ImageIcon(LoginView.class.getResource("/com/swing/Image/image/login.png"));
		loginimg = imageSetSize(loginimg, 40, 40);
		lblLoginName.setIcon(loginimg);

		lblLoginName.setBounds(45, 188, 45, 53);
		contentPane.add(lblLoginName);

		JLabel lblPassWord = new JLabel();

		// 비밀번호 아이콘
		ImageIcon logoutimg = new ImageIcon(LoginView.class.getResource("/com/swing/Image/image/passwordImg.png"));
		logoutimg = imageSetSize2(logoutimg, 40, 40);
		lblPassWord.setIcon(logoutimg);

		lblPassWord.setBounds(45, 277, 45, 53);
		contentPane.add(lblPassWord);

		// 텍스트필드, 패스워드필드
		txtLoginName = new JTextField();
		txtLoginName.setBackground(new Color(220, 220, 220));
		txtLoginName.setBounds(88, 198, 172, 38);
		contentPane.add(txtLoginName);
		txtLoginName.setColumns(10);

		txtPassWord = new JPasswordField(20);
		txtPassWord.setBackground(new Color(220, 220, 220));
		txtPassWord.setBounds(88, 289, 172, 38);
		contentPane.add(txtPassWord);
		txtPassWord.setColumns(10);
		txtPassWord.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck();
			}
		});

		// 이미지 버튼
		JButton btnLogin = new JButton();
		btnLogin.setBackground(Color.WHITE);

		// 버튼 이미지 삽입
		ImageIcon btnloginimg = new ImageIcon(LoginView.class.getResource("/com/swing/Image/image/logout.png"));
		btnLogin.setPressedIcon(new ImageIcon(LoginView.class.getResource("/com/swing/Image/image/logout.png")));
		btnloginimg = imageSetSize4(btnloginimg, 40, 40);
		btnLogin.setIcon(btnloginimg);
		btnLogin.setBounds(144, 388, 45, 49);
		contentPane.add(btnLogin);

		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				isLoginCheck();
			}
		});

	}

	  // 로그인 성공이라면 매니져창 뛰우기 if(isLogin()){ loginMain.showFrameTest(); // 메인창 메소드를이용해 창뛰우기
	  public void isLoginCheck(){ 
		  if(txtLoginName.getText().equals("test") && new String(txtPassWord.getPassword()).equals("1234")){
			  JOptionPane.showMessageDialog(null, "로그인에 성공했습니다."); 
			  bLoginCheck = true;
			  if(isLogin()) {
				  loginMain.showFrameTest();
			  }
	  }else{ JOptionPane.showMessageDialog(null, "로그인에 실패했습니다.");
	  txtPassWord.setText(""); } }
	  
	 

//	public boolean isLoginCheck() {
//		boolean isLoginCheck = false;
//		if (txtLoginName.getText().trim().isEmpty() || txtPassWord.getPassword().toString().isEmpty()) {
//			JOptionPane.showMessageDialog(this, "아이디와 비밀번호를 입력하시길 바랍니다.", "입력오류", JOptionPane.ERROR_MESSAGE);
//		} else {
//			isLoginCheck = true;
//		}
//		return isLoginCheck;
//	}

	// LoginMain와 연동
	public void setLoginMain(LoginMain loginMain) {
		this.loginMain = loginMain;
	}

	public boolean isLogin() {
		return bLoginCheck;
	}

}
