package Lec_02;

public class Digit_rev {
	public static void main(String[] args) {
		int num = 12345;
		int soln = 0;

		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
//			System.out.println(rem + " - " + num);
			soln = soln * 10 +  rem;
//			System.out.print(rem);
		}
		System.out.println(soln);

	}
}
