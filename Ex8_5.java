package jch08;

public class Ex8_5 {
   public static void main(String[] args) {
      System.out.println(1+" try블럭문 전");
      System.out.println(2+" try블럭문 전");
      
      try {
         System.out.println(3);
         System.out.println(0/0);
         System.out.println(4);
      } catch (ArithmeticException ae) {
        ae.printStackTrace();
        System.out.println("예외메시지 : " + ae.getMessage());
      } //try catch의 끝
   
    System.out.println(6);
   }
}


