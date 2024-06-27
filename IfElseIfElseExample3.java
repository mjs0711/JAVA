package s21212_java00;
import java.util.Scanner;

public class IfElseIfElseExample3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int score = sc.nextInt();
		
		while(true){
			if (score < 0 || score > 100) {
				System.out.println("잘못된 점수가 입력되었습니다.");
				break;
			}
			
			if (score >= 90) {
				System.out.println("점수가 100~90입니다.");
				System.out.println("등급은 A입니다.");
			} else if (score >= 80) {
				System.out.println("점수가 80~89입니다.");
				System.out.println("등급은 B입니다.");
			} else if (score >= 70) {
				System.out.println("점수가 70~79입니다.");
				System.out.println("등급은 C입니다.");
			} else {
				System.out.println("점수가 70점 미만입니다.");
				System.out.println("등급은 D입니다.");
			}
			
		}
    }
}


