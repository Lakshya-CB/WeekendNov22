package Lec_DP;

public class Fibo_ {
	public static void main(String[] args) {
		int n = 10000;
//		System.out.println(FiboTD(n, new Integer[n + 1]));
		System.out.println(FiboBU(n));
	}

	public static int FiboBU(int NUM) {
		int[] dp = new int[NUM+1];
		// BC
		dp[0] = 0;
		dp[1] = 1;
		
		for(int n = 2;n<=NUM;n++) {
//			just fill !~!!~!!!
//			dp[n]!!
			int sp1 = dp[n-1];
			int sp2 = dp[n - 2];
			dp[n] = sp1 + sp2;
		}
		return dp[NUM];
	}

	public static int Fibo(int n) {
		if (n <= 1) {
			return n;
		}
		int sp1 = Fibo(n - 1);
		int sp2 = Fibo(n - 2);
		return sp1 + sp2;
	}

	public static int FiboTD(int n, Integer[] dp) {
//		Top Down!!
//		Memoization
//		Memorization!!
		if (n <= 1) {
			return n;
		}
		if (dp[n] != null) {
			return dp[n];
		}
		int sp1 = FiboTD(n - 1, dp);
		int sp2 = FiboTD(n - 2, dp);
		dp[n] = sp1 + sp2;
		return sp1 + sp2;
	}
}
