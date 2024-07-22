package ch06;

class Name{
	static void print() { //클래스 메소드
		System.out.println("나는 정말할 수 있읍니다");
	}
	void print2() { //인스턴스 메소드
		System.out.println("이 프로그램은 또한 설명을 잘 할 수 있습니다");
	}
}

public class Ex6_71 {
	public static void main(String[] args) {			
		Name.print(); //클래스(static) 메소드는 인스턴스를 생성하지 않아도 호출이 가능
		//Name.print2();
		
		Name name = new Name(); //인스턴스 생성
		name.print2(); //인스턴스를 생성하여야만 호출이 가능
	}
}
