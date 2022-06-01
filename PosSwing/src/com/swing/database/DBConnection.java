package com.swing.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBConnection {
	//��� 
	public static void main(String[] args) {
		createUser("sinbc500","�����","dontsee","A");
		ArrayList<String> list = getCustomers();
		for(String item:list) {
			System.out.println(item);
		}
	}
	
	
	//DB ���� java�� ��������
	private static ArrayList<String> getCustomers() {
		try {
			Connection con = getConnection();
			PreparedStatement psmt = con.prepareStatement("Select userId, userPw, userName, userGrant FROM user");
			ResultSet rs = psmt.executeQuery();
			ArrayList<String> list = new ArrayList<String>();
			while(rs.next()) {
				list.add("userId : " + rs.getString("userId") +
						 "userPW: " + rs.getString("userPw") + 
						 "userName: " +rs.getString("userName") + 
						 "userGrant: " +rs.getString("userGrant"));
			}
			System.out.println("���� ���");
			return list;
			
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}


	//DB���� ����
	public static void createUser(String idTxt, String nameTxt, String passTxt, String authTxt)
	{
		try{
			Connection con = getConnection();
			PreparedStatement insert = con.prepareStatement(""
					+ "INSERT INTO user"
					+ "(userId,userPw,userName,userGrant) "
					+ "VALUE "
					+ "('"+idTxt+"','"+nameTxt+"','"+passTxt+"','"+authTxt+"')");
			insert.executeUpdate();
			System.out.println("����");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	//DB����
	private Connection con;
	private Statement st;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	static String driver = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://localhost:3010/swing?serverTimezone=Asia/Seoul";
	static String uid = "root";
	static String pwd = "53393939";
	
	public static Connection getConnection(){
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,uid,pwd);
			st = con.createStatement();
			System.out.println("MySQL ���� ���� ����");
		
			
		} catch (ClassNotFoundException  cnfe) {
			
			System.out.println("DB ����̹� �ε� ���� : " + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB ���ӽ��� : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return con;

		
	}
	
	// <DB ���� ���� 1> �޼ҵ� : ps + conn
	public static void dbClose(PreparedStatement ps, Connection conn) throws SQLException {
		if (ps != null)
			ps.close();
		if (conn != null)
			conn.close();
		System.out.println("�ڿ��ݳ�, DB Close!!");
	}
	
	// <DB ���� ���� 2> �޼ҵ� : st + conn
	public static void dbClose(Statement st, Connection conn) throws SQLException {
		if (st != null)
			st.close();
		if (conn != null)
			conn.close();
		System.out.println("�ڿ��ݳ�, DB Close!!");
	}
	
	// <DB ���� ���� 3> �޼ҵ� : rs + ps + conn
	public static void dbClose(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		if (rs != null)
			rs.close();
		if (ps != null)
			ps.close();
		if (conn != null)
			conn.close();
		System.out.println("�ڿ��ݳ�, DB Close!!");
	}

	// <DB ���� ���� 4> �޼ҵ� : rs + st + conn
		public static void dbClose(ResultSet rs, Statement st, Connection conn) throws SQLException {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (conn != null)
				conn.close();
			System.out.println("�ڿ��ݳ�, DB Close!!");
		}
	
	
	



}
