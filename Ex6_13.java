package ch06;

class Car {
	String color; // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door; // 문의 개수

	Car() {} // 생성자
	Car(String c, String g, int d) { // 생성자
		color = c;
		gearType = g;
		door = d;
	}
}

public class Ex6_13 {
	public static void main(String[] args) {
//	Car c = new Car();
//	c.color = "white";
//	c.geartype = "auto";
//	c.door = 4;
		Car c = new Car("white","auto",4);
		
		System.out.println("color:" + c.color + " gearType:" + c.gearType + " door" + c.door  );
	}
}
