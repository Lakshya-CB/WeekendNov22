package Lec_DP;

import java.util.Scanner;

public class coin_change_permu {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
			
//		System.out.println(solve(scn.nextInt(), 1));
//		System.out.println(BU(scn.nextInt()));
	}

	public static int solve(int curr, int prev_step) {
		if (curr == 0) {
			return 1;
		}
		if (curr < 0) {
			return 0;
		}
		if (prev_step == 1) {
			int sp1 = solve(curr - 1, 1);
			int sp2 = solve(curr - 2, 2);
			return sp1 + sp2;
		} else {
			return solve(curr - 2, 2);
		}
	}

	public static int BU(int N) {
		int[][] dp = new int[N + 1][3];
		for (int curr = 0; curr <= N; curr++) {
			for (int prev_step = 2; prev_step >= 1; prev_step--) {
				if (curr == 0) {
					dp[curr][prev_step] = 1;
					continue;
				}
//				dp[curr][prev_step]
				if (prev_step == 1) {
					int sp1 = dp[curr - 1][1];
					int sp2 = 0;
					if (curr - 2 >= 0) {
						sp2 = dp[curr - 2][2];
					}
					dp[curr][prev_step] = sp1 + sp2;
				} else {
					if (curr - 2 >= 0) {
						dp[curr][prev_step] = dp[curr - 2][2];
					}
				}
			}
		}
		return dp[N][1];
	}

}
