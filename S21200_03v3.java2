package s21200;

import java.util.Scanner;

public class S21200_03v3 {
    public static void main(String[] args) {
        // 구구단 만들기
        Scanner sc = new Scanner(System.in);
        System.out.println("구구단을 기본으로 몇 단까지 할까요?");
        int k = sc.nextInt();
        
        // 각 단에 대한 구구단 출력
        for (int 단 = 2; 단 <= k; 단++) { // 2단부터 k단까지
            System.out.println(단 + "단:");
            for (int 곱 = 1; 곱 <= 9; 곱++) { // 1부터 9까지 곱하기
                System.out.println(단 + " * " + 곱 + " = " + (단 * 곱));
            }
            System.out.println(); // 단마다 빈 줄 추가
        }
    }
}
