package S21212_java90;

public class S21212_wrapper_01 {
	public static void main(String[] args) {
		// 기본박싱
		System.out.println("---기본 박싱 및  언박싱-----------------");
		Integer is1 = new Integer(127);
		Integer is2 = new Integer("127");
		// 언박싱
		int si1 = is1.intValue();
		int si2 = is2.intValue();

		System.out.println("기본박싱is1:" + is1 + "언박싱si1:" + si1);
		System.out.println("기본박싱is1:" + is2 + "언박싱si1:" + si2);

		System.out.println("기박is1:" + System.identityHashCode(is1) + "언박:" + System.identityHashCode(si1));
		System.out.println("기박is1:" + System.identityHashCode(is1) + "언박:" + System.identityHashCode(si2));

	}

}
