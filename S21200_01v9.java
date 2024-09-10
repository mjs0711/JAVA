package after;

public class S21200_01v9 {
	public static void main(String[] args) {
		int  intX = 1;
		int intXnum = ++intX + 10;
		int intY =1;
		int intYnum = intY++ + 10;
		
		System.out.println("++intXnum:" +intXnum+" intX:"+intX);
		System.out.println("intYnum++:"+intYnum+" intY:"+intY);	
	}
}
