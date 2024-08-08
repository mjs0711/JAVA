package ch6.Test7;

class Data1 {
	int value;
}
class Data2 {
	int value;
	Data2(){}; 
	Data2(int x) {
			value = x;		
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
		// 객체 생성 후 참조 변수에 저장
		Data1 d1 = new Data1();
		Data2 d2 = new Data2(); //에러 발생
		
		System.out.println("기본 생성자를 완전히 이해하고 있습니다.^^");
	}
}
