package Lec_02;

public class GCD_03 {
	public static void main(String[] args) {
		int a = 24;
		int b = 94;

		int divisor = a;
		int dividend = b;

		while (divisor != 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(dividend);

	}
}
