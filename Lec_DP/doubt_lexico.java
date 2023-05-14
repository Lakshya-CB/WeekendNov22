package Lec_DP;

public class doubt_lexico {
	public static void main(String[] args) {
		for (int digit = 1; digit <= 9; digit++) {
			solve(digit, 1000);
		}
	}

	public static void solve(int n, int limit) {
//		if (n > limit) {
//			return;
//		}
//		n=1
		System.out.println(n);
		for (int digit = 0; digit <= 9; digit++) {
			if (n * 10 + digit <= limit) {
//				System.out.println(n*10+digit);
				solve(n * 10 + digit, limit);
			}
		}
	}
}
