package Lec_DP;

public class LCS {
	public static void main(String[] args) {

	}

	public static int solve(String str1, String str2) {
		if(str1.isEmpty() ||str2.isEmpty()) {
			return 0;
		}
		if (str1.charAt(0) == str2.charAt(0)) {
			return 1 + solve(str1.substring(1), str2.substring(1));

		} else {
			int sp1 = solve(str1.substring(1), str2);
			int sp2 = solve(str1, str2.substring(1));
			return Math.max(sp1, sp2);

		}
	}
}
