package ch05;

public class Ex5_MathRandom2 {
	public static void main(String[] args) {
		int num;
		
		System.out.println("** 10보다 작은 랜덤 함수 값");
		for (int i =0; i < 10; i++) {
			num = (int) (Math.random() * 10);
			System.out.println(num);
		}
		
		System.out.println("** 1부터 12까지의 랜덤 함수 값");
		for (int i = 0; i<10; i++) {
			num = (int) (Math.random()) * (12-1+1) +1;
			System.out.println(Math.round(Math.random()*10)+1);
		}
	}
}
