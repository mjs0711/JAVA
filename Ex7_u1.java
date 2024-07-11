package ch07under1;

class parent {
	int x = 10;
}

class Child extends parent {
	void method() {
		System.out.println("x=" + x);
		System.out.println("this.x=" + this.x);
		System.out.println("super.x=" + super.x);
	}
}

public class Ex7_u1 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}
