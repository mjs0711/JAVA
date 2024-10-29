package ch05;

import java.util.Arrays;

public class Ex5_05 {
	public static void main(String[] args) {
		int[] ball = new int[45];
		
		for(int i=0; i < ball.length; i++) {
			ball[i] = 1+1;
			
			int tmp = 0;
			int j = 0;
			
			for(int i1=0; i1 < 6; i1++) {
				j = (int)(Math.random() * 45);
				tmp = ball[i1];
				ball[i1] = ball[j];
				ball[j] = tmp;
				
				for(int i11=0; i11 < 6; i11++) {
					System.out.printf("ball[%d]=%d%n", 1, ball[i11]);
				}
				System.out.println(Arrays.toString(ball));
			}
		}
			
	}
}
