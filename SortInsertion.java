package SortInsertion;

import java.util.Arrays;

public class SortInsertion {
	public static void main(String[] args) {
		int[] score = { 7, 5, 4, 3, 1 };

		System.out.println("Arrays.length: " + score.length);
		System.out.println("원시자료:" + Arrays.toString(score));

		insertionSort(score);

		System.out.println("정렬자료:" + Arrays.toString(score));
	}

	public static void insertionSort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
	}
}
