package s21212_recursion;
public class Recursion1_SumPlus {
	static int sumPlus(int num) {
		System.out.println("ing :" + num);
		if(num == 1) {
			return 1;
		} else {
				return num+sumPlus(num-1);
		}
	}

	public static void main(String[] args) {
		System.out.println("Sum :" + sumPlus(10));

	}

}
