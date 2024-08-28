package s21200_java00;

import after.Student9;

public class StaticTest {
	public static void main(String[] args) {
		Student9 n1 = new Student9("Jhon");
		System.out.println("1static count:"+n1.count+",count9:"+n1.count9);
		
		Student9 n2 = new Student9("Nim");
		System.out.println("2static count:"+n2.count+",count9:"+n2.count9);
		
		Student9 n3 = new Student9("Sun");
		System.out.println("3static count:"+n3.count+",count9:"+n3.count9);
		
		System.out.println("------------------------------------");
		n1.count += n1.count;
		n1.count9 += n1.count9;
		System.out.println("4static count:"+n1.count+",count9:"+n1.count9);
		System.out.println("5static count:"+n2.count+",count9:"+n2.count9);
		System.out.println("6static count:"+n3.count+",count9:"+n3.count9);
	}
}
