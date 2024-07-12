package ch6.Test5;

class After {
	//클래스 변수
	static int cntStatic = 50;
	int cnt = 70;
	String name = "방과후2차";
	After(String name, int cnt) {
		this.name = name;
		this.cnt++;
		cntStatic++;
		System.out.println(name + " cnt:" + cnt + " cntStatic:" + cntStatic);
	}
}
public class StaticTest {
	public static void main(String[] args) {
		After n1 = new After("A", 10);
		After n2 = new After("B", 20);
		After n3 = new After("C", 30);
		
		System.out.println(n1.name + " cnt:" + n1.cnt + " cntStatic:" + n1.cntStatic);
		System.out.println(n2.name + " cnt:" + n2.cnt + " cntStatic:" + n2.cntStatic);
		System.out.println(n3.name + " cnt:" + n3.cnt + " cntStatic:" + n3.cntStatic);
	}
}
