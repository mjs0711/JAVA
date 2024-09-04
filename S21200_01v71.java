package s21212;

import java.util.Scanner;

public class S21200_01v71 {
	public static void main(String[] args) {
		String inString;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("입력하세요");
			inString = scanner.nextLine();
			
			System.out.println("입력된 문자열은:\"" + inString + "\"");
			if(inString.equals("q")) {
				break;
			}
		}

		System.out.println("종료"	);		
	}
}
