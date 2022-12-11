package Lec_02;

public class Fibo_03 {
	public static void main(String[] args) {
		int n = 0;
		int a = 0;
		int b = 1;

		int cnt = 1;
		while (cnt <= n) {
			int c = a + b;
//			System.out.println(c);
			a = b;
			b = c;

			cnt++;
		}
		System.out.println(a);

	}
}
