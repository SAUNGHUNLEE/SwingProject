package com.swing.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
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
			System.out.println("MySQL 서버 연동 성공");
		
			
		} catch (ClassNotFoundException  cnfe) {
			
			System.out.println("DB 드라이버 로딩 실패 : " + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return con;

		
	}
	
	// <DB 연결 해제 1> 메소드 : ps + conn
	public static void dbClose(PreparedStatement ps, Connection conn) throws SQLException {
		if (ps != null)
			ps.close();
		if (conn != null)
			conn.close();
		System.out.println("자원반납, DB Close!!");
	}
	
	// <DB 연결 해제 2> 메소드 : st + conn
	public static void dbClose(Statement st, Connection conn) throws SQLException {
		if (st != null)
			st.close();
		if (conn != null)
			conn.close();
		System.out.println("자원반납, DB Close!!");
	}
	
	// <DB 연결 해제 3> 메소드 : rs + ps + conn
	public static void dbClose(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		if (rs != null)
			rs.close();
		if (ps != null)
			ps.close();
		if (conn != null)
			conn.close();
		System.out.println("자원반납, DB Close!!");
	}

	// <DB 연결 해제 4> 메소드 : rs + st + conn
		public static void dbClose(ResultSet rs, Statement st, Connection conn) throws SQLException {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (conn != null)
				conn.close();
			System.out.println("자원반납, DB Close!!");
		}
	
	
	



}
