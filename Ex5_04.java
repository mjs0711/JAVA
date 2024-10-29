package ch05;

import java.util.Arrays;

public class Ex5_04 {
	public static void main(String[] args) {
		int[] numArr = {1,2,3,4,5,6,7,8,9,};
		System.out.println(Arrays.toString(numArr));
		
		for (int i=0; i < 100; i++) {
			int n = (int)(Math.random() * 10); {
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
			System.out.println(n+ " ");
			}
			System.out.println();
			System.out.println(Arrays.toString(numArr));
		}
	}
}
