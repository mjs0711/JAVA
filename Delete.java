package mjs_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) throws Exception {
// 		0. 데이터베이스 연결
		Class.forName("oracle.jdbc.OracleDriver");
		
		String 접속주소 = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection con = DriverManager.getConnection(접속주소, "sw212", "1234");
				
		
		String 쿼리문 = "select pc_menu from pc_menu";
		PreparedStatement pstmt = con.prepareStatement(쿼리문);
		
		ResultSet rs = pstmt.executeQuery();
		
//		1. pc_menu 꺼내오기
		while(rs.next()) {
			System.out.println(rs.getString(0));
		}
//		2. 삭제할 메뉴 선택받기
		
//		3. 삭제 발사버튼 만들기
	
	}
}
