package Lec_DP;

import java.util.Scanner;

public class Doubts_Rat_in_a_maze {
	static boolean found = false;
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		char[][] board = new char[n][];
		for (int i = 0; i < n; i++) {
			board[i] = scn.next().toCharArray();
		}
		int[][] ans = new int[n][m];
		solve(0, 0, ans, board);
		if(found==false) {
			System.out.println(-1);
		}
		
	}

	public static void solve(int r, int c, int[][] ans, char[][] board) {

		if (found||c == ans[0].length || r == ans.length || board[r][c] == 'X') {
			return;
		}
		ans[r][c] = 1;
		if (c == ans[0].length - 1 && r == ans.length - 1) {
			found = true;
			for(int[] row : ans) {
				for(int ali : row) {
					System.out.print(ali + " ");
				}
				System.out.println();
			}
			System.out.println("==============");
			return;
		}
		
		solve(r, c + 1, ans, board);
		solve(r + 1, c, ans, board);
		ans[r][c] = 0;

	}
}
