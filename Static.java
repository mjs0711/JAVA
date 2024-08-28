package s21200_java00;

class Student {
	//클래스 변수
	static int count = 0;
	Student(String name) {
		count++;
	}
}

public class Static {
	public static void main(String[] args) {
		
		Student n1 = new Student("Jhon");
		System.out.println("n1.count");
		Student n2 = new Student("Nim");
		System.out.println("n2.count");
		Student n3 = new Student("Sun");
		System.out.println("n3.count");	
	}
}
