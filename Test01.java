package s21212_00;

public class Test01 {

	public static void main(String[] args) {
		int cnt = 1;
		int sum = 0;
		
		do {
			
			sum = sum + cnt;
			cnt++;
			
		} while (cnt >= 10);
		
		System.out.println("sum :"+sum);
	}
}
