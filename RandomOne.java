package test000;

import java.util.Scanner;

public class RandomOne {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int luckyNum;
      int index = 0;
      int[] arryNum = new int[100];
      int[] arryOk = new int[6];

      for (;true;) {
         System.out.println("좋아하는 숫자를 입력하세요(1~9)");
         int a = scanner.nextInt();
         if (a < 1 || a > 9) {
            continue;
         }
         break;
      }
   }
}
