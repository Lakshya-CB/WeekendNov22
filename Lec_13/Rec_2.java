package Lec_13;

public class Rec_2 {
	public static void main(String[] args) {
//		System.out.println(Factorial(3));
		System.out.println(Fibo(7));
	}

	public static int Factorial(int n) {
		if (n == 0) {
			return 1;
		}
//		BP : n
//		SP : n-1
		int sp = Factorial(n - 1);
		return sp * n;
	}

	public static int pow(int a, int b) {
		if (b == 0) {
			return 1;
		}
//		BP : a^b
//		SP : a^b-1
		int sp = pow(a, b - 1);
		return sp * a;
	}

	public static int Fibo(int n) {
		if (n <= 1) {
			return n;
		}
//		BP : F(n)
//		SP : F(n-1) F(n-2)
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}

}
