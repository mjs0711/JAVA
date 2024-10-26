package s21200;

public class S21200_03v41 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		while(true) {
			sum += ++i;
			if(sum > 100) break;
			System.out.println("i="+i+" sum="+sum);
		}
		System.out.println("----------");
		System.out.println("i="+i+" sum="+sum);
	}
}
