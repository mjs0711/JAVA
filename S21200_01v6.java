package s21212;

import java.io.IOException;

public class S21200_01v6 {
	public static void main(String[] args) throws IOException {
		int keycode;
		
		while(true) {
			keycode = System.in.read();
			System.out.println("keycode: " + keycode);
			if(keycode == 113) {
			break;
			}
		}
		System.out.println("종료");
	}
}
