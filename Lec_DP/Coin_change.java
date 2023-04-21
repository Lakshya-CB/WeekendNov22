package Lec_DP;

public class Coin_change {
	public static void main(String[] args) {
		int[] coins = { 3, 2, 1 };
		int Amount = 500;
		System.out.println(solve(Amount, 0, coins));
		System.out.println(solveTD(Amount, 0, coins, new Integer[Amount + 1][coins.length]));
		System.out.println(BU(Amount, coins));
	}

	public static int BU(int Amount, int[] coins) {
		int[][] dp = new int[Amount + 1][coins.length + 1];

		for (int A = 0; A <= Amount; A++) {
			for (int idx = coins.length - 1; idx >= 0; idx--) {
//				dp[A][idx]!!!!1
				if (A == 0) {
					dp[A][idx] = 1;
					continue;
				}
				int sp1 = 0;
				if (A - coins[idx] >= 0) {
					sp1 = dp[A - coins[idx]][idx];
				}
				int sp2 = dp[A][idx + 1];
				dp[A][idx] = sp1 + sp2;
			}
		}
		return dp[Amount][0];
	}

	public static int solve(int A, int idx, int[] coins) {
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		if (A == 0) {
			return 1;
		}
		int sp1 = solve(A - coins[idx], idx, coins);
		int sp2 = solve(A, idx + 1, coins);
		return sp1 + sp2;

	}

	public static int solveTD(int A, int idx, int[] coins, Integer[][] dp) {
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		if (A == 0) {
			return 1;
		}
		if (dp[A][idx] != null) {
			return dp[A][idx];
		}
		int sp1 = solveTD(A - coins[idx], idx, coins, dp);
		int sp2 = solveTD(A, idx + 1, coins, dp);
		dp[A][idx] = sp1 + sp2;
		return sp1 + sp2;
	}

}
