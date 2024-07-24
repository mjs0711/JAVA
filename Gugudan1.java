package test;

public class Gugudan1 {

	public static void main(String[] args) {			
		for (int i = 2; i <= 9; i++) {
			System.out.println("-----" + i + "-----");
			for (int j = 1; j <= 9; j++) {
			System.out.printf("%2d *%2d = %2d%n" , i, j, (j*i));
			}
		}
	}	
}
