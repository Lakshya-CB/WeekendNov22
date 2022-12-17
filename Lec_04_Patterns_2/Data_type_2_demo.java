package Lec_04_Patterns_2;

public class Data_type_2_demo {
	public static void main(String[] args) {

		System.out.println(1 > 2);

		boolean b = 32 > 1;

		System.out.println(b);
//		while(b) {
//			System.out.println("aag laga do!");
//		}
		if (b) {
			System.out.println("K");
		}
		if (b || 3 > 5) {
			System.out.println("nacho");
		}
		String str = "bagdad";
		System.out.println(str);

		System.out.println("Hello" + 10);
		System.out.println("Hello" + 10 + 20);
		System.out.println(10 + "Hello" + 10 + 20);
		System.out.println(20 + 10 + "Hello" + 10 + 20);
		System.out.println(20 + 10 + "Hello" + (10 + 20));
	}
}
