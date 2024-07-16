package ch6.Test1;

class Car2 {
	// 속성
	String company = "현대자동차";
	String model = "제네시스G80";
	String color = "검정";
	int speed = 180;
	
	// 매개변수를 쓸려면 기본 생성자가 있어야한다.
	Car2() {};
	
	Car2(String color, int speed) {
		color = color;
		speed = speed;
	}
}
public class CarExample2 {
	public static void main(String[] args) {
		// 객체 생성 후 참조 변수에 저장
		Car2 myCar = new Car2();
		
		myCar.model = "그랜져";
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("컬러: " + myCar.color);
		System.out.println("최대속도: " + myCar.speed);
	}
}
