package mjs_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class create {

	public static void main(String[] args) throws Exception {
	     // 1.드라이버 로드
	      Class.forName("oracle.jdbc.OracleDriver");
	      
	      // 2.Connection 객체 만들기
	      String url = "jdbc:oracle:thin:@localhost:1521:xe";
	      Connection con = DriverManager.getConnection(url, "sw212", "1234");
	      
	      // 3.Statement 객체 만들기
	      Statement st = con.createStatement();
	      
	      // 4.ResultSet 객체 만들기
	      ResultSet rs = st.executeQuery("select max(menu_no) from PC_MENU");
	      
	      rs.next();
	      System.out.println(rs.getInt("max(menu_no"));
	      
	     Scanner sc = new Scanner(System.in);
	     System.out.println("메뉴 추가 페이지입니다");
	     
	     System.out.println("메뉴 번호를 입력하세요."); 
	     int 메뉴번호 = sc.nextInt();
	     
	     System.out.println("메뉴 종류를 입력하세요."); 
	     int 메뉴종류= sc.nextInt();
	     
	     System.out.println("메뉴명을 입력하세요."); 
	     int 메뉴명 = sc.nextInt();
	     
	     System.out.println("가격을 입력하세요."); 
	     int 가격 = sc.nextInt();
	     
	     String sql = "insert into PC_MENU values( "
	    		 									+메뉴번호+", '"
	    		 									+메뉴종류+"', '"
	    		 									+메뉴명+"', "
	    		 									+가격+")";
	     
	     int 결과 = st.executeUpdate(sql);
	      
	     System.out.println(결과);
	}
}
