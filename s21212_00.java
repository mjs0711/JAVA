package s21212_00;

import java.util.Scanner;
import java.util.Stack;
public class TestApp1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();   // 스택의 수를 입력
      int[]A = new int[N];
      for (int i = 0; i < N; i++) {
         A[i] = sc.nextInt();
      }
      Stack<Integer> stack = new Stack<>();  // 스택 생성
      StringBuffer bf = new StringBuffer();  // 스트링  버퍼 생성
      int num = 1; // 오름차순 수
      boolean result = true;
      
      for (int i = 0; i < A.length; i++) {
         int su = A[i];   // 현재 수열의 수
         if (su >= num) { //현재 수열 값 >= 오름차순 자연수 : 값이 같아 질 때까지  push()수행
            stack.push(num++);
            bf.append("+\n");
         }  // push()
                                                   
          else {  //현재 ㅅㅅ 수열 값 < 오름차순 자연수: pop()을 수행하여 수열 원소를 꺼냅시다
           int n = stack.pop();
           // 스택의 가장 위의 수가 만들어야 하는 수열의 수 보다 크다면 수열 출력 불가능
           if (n > su) {
              System.out.println("NO");
              result = false;
              break;
           } else {
              bf.append("-\n");
           }
         }
      }
      if (result) System.out.println(bf.toString());
   }
}
