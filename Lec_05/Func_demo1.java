package Lec_05;

public class Func_demo1 {
	public static void fun2ush() {
		// void => return type
		// fun1 => function ka naam
		System.out.println("masti");
	}

	public static void main(String[] args) {
		fun2ush();
		int soln = add(2, 3, 5);
		fun1();
	}

	public static void fun1() {
		// void => return type
		// fun1 => function ka naam
		System.out.println("parai!");
		return;
	}

	public static int add(int a, int b, int c) {
		System.out.println(a + b + c);
		return a + b + c;
	}

	public static int mult(int a, int b, int c, int d) {
		int soln = a * b * c * d;
		return soln;
	}
}
