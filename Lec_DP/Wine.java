package Lec_DP;

public class Wine {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 1, 4 };
		System.out.println(solve(arr, 0, arr.length - 1, new Integer[arr.length][arr.length]));
		System.out.println(BU(arr));
	}

	public static int solve(int[] arr, int s, int e, Integer[][] dp) {
		if (s > e) {
			return 0;
		}
		if (dp[s][e] != null) {
			return dp[s][e];
		}
		int day = arr.length - (e - s + 1) + 1;
		int sp1 = arr[s] * day + solve(arr, s + 1, e, dp);
		int sp2 = arr[e] * day + solve(arr, s, e - 1, dp);
		dp[s][e] = Math.max(sp1, sp2);
		return Math.max(sp1, sp2);

	}

	public static int BU(int[] arr) {
		int[][] dp = new int[arr.length + 10][arr.length + 10];
		for (int s = arr.length - 1; s >= 0; s--) {
			for (int e = 0; e < arr.length; e++) {
				if (s > e) {
					continue;
				}
//				dp[s][e]
				int day = arr.length - (e - s + 1) + 1;
				int sp1 = arr[s] * day;
				if (s + 1 < arr.length) {
					sp1 = sp1 + dp[s + 1][e];
				}
				int sp2 = arr[e] * day;
				if (e - 1 >= 0) {
					sp2 = sp2 + dp[s][e - 1];
				}
				dp[s][e] = Math.max(sp1, sp2);
			}
		}
		return dp[0][arr.length - 1];
	}

}
