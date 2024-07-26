package ch06;

public class Ex6_15v1 {
	// 배열생성
	static int[][] arr = new int[5][5];

	static {
		for (int i = 0; i < arr.length; i++) {
			int j = 0;
			// 학번은 학생 수 기준으로 무작위 추출
			arr[i][j] = (int) (Math.random() * 23) + 1;
		}
		// 같은 번호 발생 시 다시 생성
		for (int j = 0; j < arr.length; j++) {
			int i = 0;
			for (int k = j + 1; k < arr[i].length; k++) {
				if (arr[i][j] == arr[i][k]) {
					j = 9;
					i--;
					break;
				}
			}
			if (j==9) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("X3d ", arr[i][j]);
			}
			System.out.println();
		}
	}
}
