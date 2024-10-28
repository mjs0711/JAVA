package ch05;

public class Ex5_05v1 {
	public static void main(String[] args) {
		int i_num = 26;
		int i_group = 4;
		int[] ball = new int[i_num];
		
		for(int i=0; i < ball.length; i++) {
			ball[i] = i+1;
			
			int tmp = 0;
			int i_r = 0;
			for(int j=0; j < 200; j++) {
				i_r = (int)(Math.random() * i_num);
				tmp = ball[0];
				ball[0] = ball[i_r];
				ball[i_r] = tmp;
			}
		}

	}

}
