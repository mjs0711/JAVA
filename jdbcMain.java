package mjs_jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class jdbcMain {
   public static void main(String[] args) throws Exception {
	   
	   Connection con = DBConnect.getConnection();
	   PreparedStatement pstmt;
	   
	   Scanner sc = new Scanner(System.in);
	   boolean 진행 = true;
	   
	   System.out.println("SW212 PC방에 오신걸 환영합니다.");
	   
	   while(true) {
		   System.out.printf("메뉴를 선택하세요.");
		   System.out.printf("(1)Create (2)Read (3)Update (4)Delete (5)Exit > ");
		   int 선택 = sc.nextInt();
		   
		   switch(선택) { 
		   case 1:
		   		
		   		break;
		   case 2:
		   		
		   		break;
		   case 3:
		   		
		   		break;
		   case 4:
		   
		   		break;
		   default:
			   System.out.println("Bye~");
			   진행 = false;
		   }
	   }
      }
   }
