package Lec_05;

public class Global_variable_demo {
	static int pitpull = 999;

	public static void main(String[] args) {
		System.out.println(pitpull);
		int pitpull = 99;
		
		fun1();
		System.out.println(pitpull);
		System.out.println(Global_variable_demo.pitpull);

	}

	public static void fun1() {
		pitpull = pitpull + 1;

	}
}
