package ch6.Test7;

import java.util.Arrays;

public class RandomChange {
	public static void main(String[] args) {
		int[] numArr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(Arrays.toString(numArr));
		// 배열에 정의된 수를 100번 동안 0~9의 임의 수를 선택하여.
		// 선택된 값을 인덱스로 0번째와 값을 교환
		for (int i = 0; i < 100; i++) {
			int n = (int) (Math.random() * 10); // 0~9 중의 한 값을 임의로 얻는다.
			int tmp = numArr[n];
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
		// main의 끝
	}
}
