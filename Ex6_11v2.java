package ch06;

class Data_1 {
	//Data_1() {}; 정의되어 있는 생성자가 하나도 없으므로 컴파일러가 자동 생성
	int value;
}

class Data_2 {
	//Data_2() {}; 정의된 생성자가 있으므로 기본생성자가 필히 있어야 한다.
	int value;
	
	Data_2(int x) { // 매개변수가 있는 생성자
		value = x;
	}
}

public class Ex6_11v2 {
	
	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		//compile error발생 -> 생성자가 있는데 기본생성자가 없어서 에러
		Data_2 d2 = new Data_2(10); //Data_2(int x)를 사용하거나 또는 Data_2() {}; 정의		
		System.out.println(d1.value);
		System.out.println(d2.value);
	}
}
