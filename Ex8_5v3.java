package jch08;

import java.util.Scanner;

public class Ex8_5v3 {

   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
         
      System.out.println("1.숫자를 입력하세요");
      int num1 = sc.nextInt();
      System.out.println("2.숫자를 입력하세요");
      int num2 = sc.nextInt();
      System.out.println("3.0으로 나눌 수 없음");
      
      
      try {
         
         System.out.println(0/0); // 예외 발생
         System.out.println(4); // 실행되지 않는다.
      } catch (ArithmeticException ae) {
         ae.printStackTrace();
         
      } catch (RuntimeException ae) {
         ae.printStackTrace();
         
      } catch (Exception ae) {
         ae.printStackTrace();
         
      }// try-catch의 끝
      
      System.out.println("333/0=0");
   } //main 메서드 끝

}
