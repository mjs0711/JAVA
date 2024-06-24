package test000;

public class Calculator {
	
	int add(int a, int b) {
		return a + b;
	}
	int add(int a, int b, int c) {
		return a + b;
	}
	int add(double a, double b) {
		a += b;
		if (a > 10) {
			return 5;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.add(3,4));		  //test1
		System.out.println(c.add(2,4,8));	  //tset2
		System.out.println(c.add(3.14,2.54)); //test3
	}
}
