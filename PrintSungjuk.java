package s21212_00;

public class PrintSungjuk {

	public static void main(String[] args) {
		String name = "민지성";
		String 	hakbun ="21212";
		int kor = 98;
		int eng = 91;
		int mat = 100;
		int tot = kor + eng + mat;
		double ave = tot / 3.;
				
		System.out.println("성명  학번     국어 영어 수학  총점  평균");
		System.out.println("--------------------------------------");
		System.out.printf("%s %-6s %3d %3d %3d %3d %3.1f \n",name,hakbun, kor,eng,mat,tot,ave);
		

	}

}
