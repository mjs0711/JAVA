package test;

public class Gugudan2 {
	public static void main(String[] args) {
		for (int k = 2; k <=9; k++) {
			System.out.println(k + "   단   ");
		} System.out.println();
		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i*j < 10) {
					System.out.print(i+"*"+j+"="+" "+i*j + "\t");
				} else {
					System.out.print(i+"*"+j+"="+i*j + "\t");
				}
				
				} System.out.println("");
				
			}
		} 
	}
