package after;

import java.util.Scanner;

public class S21200_03v1 {
	public static void main(String[] args) {
		char grade;
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		
		if(score>=90) {
			System.out.println("점수가 100~90입니다.");
			System.out.println("등급은 A입니다.");
		} else if(score>=80) {
			System.out.println("점수가 90~90입니다.");
			System.out.println("등급은 B입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~79입니다.");
			System.out.println("등급은 C입니다.");
		} else  {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D입니다.");
		}
	}
}
