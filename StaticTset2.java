package ch6.Tset6;

class After2 {
	//클래스 변수
	static int cntStatic =50;
	int cnt = 70;
	String name = "방과후2차";
	After2(String name, int cnt) {
		
		cntStatic++;
		System.out.println(name + " cnt:" + cnt + " cntStatic:" + cntStatic);
	}
}

public class StaticTset2 {
	public static void main(String[] args) {
		After2 n1 = new After2("A", 10);
		After2 n2 = new After2("B", 20);
		After2 n3 = new After2("C", 30);
		
		After2.cntStatic = 555;
		System.out.println(n1.name + " cnt:" + n1.cnt + " cntStatic:" + n1.cntStatic);
		System.out.println(n2.name + " cnt:" + n2.cnt + " cntStatic:" + n2.cntStatic);
		System.out.println(n3.name + " cnt:" + n3.cnt + " cntStatic:" + n3.cntStatic);
	}
}
