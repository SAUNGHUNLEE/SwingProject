package com.swing.main;

import com.swing.view.MainView;
import com.swing.view.ProductView;
import com.swing.view.LoginView;

public class LoginMain {
	LoginView loginView;
	MainView mainView;


	public static void main(String[] args) {
		LoginMain loginMain = new LoginMain();
		loginMain.loginView = new LoginView(); // 로그인창 보이기

		loginMain.loginView.setLoginMain(loginMain); // 로그인창에게 메인 클래스보내기


	}

	public void showFrameTest() {
		loginView.dispose();
		this.mainView = new MainView();
		
	}
	

	

}
