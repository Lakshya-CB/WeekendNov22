package Lec_05;

public class Inverse {
	public static void main(String[] args) {
		int num = 23145;
		int pos = 1;
		int sum =0;
		while (num > 0) {

			int digit = num % 10;
			num = num / 10;

			int ans = (int) (pos * Math.pow(10, digit - 1));
//			System.out.println(digit + " - " +
//			pos + " - " + ans);
			sum = sum+ans;

			pos++;
		}
		System.out.println(sum);

	}
}
