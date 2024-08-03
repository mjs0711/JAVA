package ch06;

public class Ex5_2 {
	public static void main(String[] args) {
		int sum = 0;	// 총점을 저장하기 위한 변수
		double average = 0; // 평균을 저장하기 위한 변수
		
		int [] score = {98, 100, 88, 90, 92, 100, 99};
		
		for (int i=0; i < score.length; i++ ) {
			sum += score[i];
		}
		// 계산결과를 float로 얻기 위해서 형변환
		//average = sum / (float)score.length;
		average = (double) sum / score.length;
		
		System.out.println("Array: " + score.length);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);	
	}
}
