package Lec_DP;

import java.util.Arrays;

public class Coin_change_ex {
	public static void main(String[] args) {
		int[] coins = { 1, 2, 3, 4, 1, 2 };
		Arrays.sort(coins);
		System.out.println(Arrays.toString(coins));
		System.out.println("===========");

		int A = 6;
//		solve(coins, A, 0, "", true);
		PT(coins, A, 0, "");

	}

	public static int solve(int[] coins, int A, int idx, String path, boolean include) {
		if (A == 0) {
			System.out.println(path);
			return 1;
		}
		if (A <= 0 || idx == coins.length) {
			return 0;
		}
		if (include == false && coins[idx] == coins[idx - 1]) {
			return solve(coins, A, idx + 1, path, false);
		}
		int sp1 = solve(coins, A - coins[idx], idx + 1, path + " " + coins[idx], true);
		int sp2 = solve(coins, A, idx + 1, path, false);

		return sp1 + sp2;
	}

	public static int PT(int[] coins, int A, int idx, String path) {
		if (A == 0) {
			System.out.println(path);
			return 1;
		}
		if (A < 0 || idx == coins.length) {
			return 0;
		}
		int ans = 0;
		for (int i = idx; i < coins.length; i++) {
			if(i>idx && coins[i]==coins[i-1]) {
				continue;
			}
			int sp = PT(coins, A - coins[i], i + 1, path + coins[i]);
			ans = ans + sp;
		}
		return ans;
	}
}
