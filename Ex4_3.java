package zlast.t1;

import java.util.Scanner;

public class Ex4_3 {
	public static void main(String[] args) {
		int score = 0; 		// 점수를 저장하기 위한 변수
		char grade = ' ';   //학점을 저장하기 위한 변수, 공백으로 초기화
		
		//score 90점~100점 학점 A
		//		80점~89점  학점 B
		//		70점~79점  학점 C
		//		60점~69점  학점 D, 그 이하는 F
		System.out.println("점수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + "입니다");
	}
}
