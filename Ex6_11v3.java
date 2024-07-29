package ch06;

class Car2 {
	String color; // 색상
	String gearType; // 변속기 종류 - auto(자동), manual(수동)
	int door; // 문의 개수

	Car2() {
		this("white", "auto", 4);
	}

	Car2(String color) {
		this(color, "auto", 4);
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}
	public class Ex6_11v3 {
		public static void main(String[] args) {
	Car2 c1 = new Car2();
	Car2 c2 = new Car2("blue");
	Car2 c3 = new Car2("red","auto(자동)",1);
		
	System.out.println("cl color=" + c1.color + ", gearType=" +
c1.gearType+ ", door="+c1.door);
	System.out.println("c2 color=" + c2.color + ", gearType=" +
c2.gearType+ ", door="+c2.door);
	System.out.println("c3 color=" + c3.color + ", gearType=" +
c3.gearType+ ", door="+c3.door);
	
		}
	}

