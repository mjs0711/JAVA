package s21212_00;

public class S21212_03v4 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(true) {
			++i;
			sum += i;
			if(sum > 100) break;
			System.out.println("i="+i+" sum="+sum);
		}
		System.out.println("-----------------");
		System.out.println("i="+i+" sum=" +sum);
	}
}
