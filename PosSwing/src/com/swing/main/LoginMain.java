package com.swing.main;

import com.swing.view.MainView;
import com.swing.view.ProductView;
import com.swing.view.LoginView;

public class LoginMain {
	LoginView loginView;
	MainView mainView;


	public static void main(String[] args) {
		LoginMain loginMain = new LoginMain();
		loginMain.loginView = new LoginView(); // �α���â ���̱�

		loginMain.loginView.setLoginMain(loginMain); // �α���â���� ���� Ŭ����������


	}

	public void showFrameTest() {
		loginView.dispose();
		this.mainView = new MainView();
		
	}
	

	

}
