package after;

public class S2120_01v99 {
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "abc";
		System.out.println("기본변수== :"+(str1==str2));
		System.out.println("기본변수equ:"+(str1.equals(str2)));
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		System.out.println("참조변수== :"+(str3==str4));
		System.out.println("참조변수equ :"+str3.equals(str4));
	}
}
