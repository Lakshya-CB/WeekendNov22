package Lec_17;

public class Combination_wrt_seat {
	public static void main(String[] args) {
//		Comb(2, 0, "", 4);
		boolean[][] board = new boolean[4][4];
		comb_2D(0, 0, 4, "", 4, 4, board);
	}

	public static void Comb(int n, int curr, String path, int total) {

		if (n == 0) {
			System.out.println(path);
			return;
		}
		if (curr == total) {
			return;// -ve BC
		}

		Comb(n - 1, curr + 1, path + "Q" + curr, total);
		Comb(n, curr + 1, path, total);

	}

	public static void print(boolean[][] board) {
		for (boolean[] row : board) {
			for (boolean b : row) {
				if (b) {
					System.out.print("/");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public static void comb_2D(int r, int c, int n, String path, int tot_r, int tot_c, boolean[][] board) {

		if (n == 0) {
			System.out.println(path);
			print(board);
			System.out.println("+++++++++++++++++++++++++++");
			return;
		}
		if (c == tot_c) {
			r++;
			c = 0;
		}
		if (r == tot_r) {
			return;

		}
		if (isSafe(r, c, board)) {
			board[r][c] = true;
			comb_2D(r, c + 1, n - 1, path + "{" + r + "," + c + "}", tot_r, tot_c, board);
			board[r][c] = false;
		}
		comb_2D(r, c + 1, n, path, tot_r, tot_c, board);

	}

	public static boolean isSafe(int r, int c, boolean[][] board) {
		for (int row = 0; row < r; row++) {
			if (board[row][c]) {
				return false;
			}
		}
		for (int col = 0; col < c; col++) {
			if (board[r][col]) {
				return false;
			}
		}
		int r1 = r;
		int c1 = c;
		while (r1 >= 0 && c1 >= 0) {
			if (board[r1][c1]) {
				return false;
			}
			r1--;
			c1--;
		}
		int r2 = r;
		int c2 = c;
		while (r2 >= 0 && c2 <board[0].length) {
			if (board[r2][c2]) {
				return false;
			}
			r2--;
			c2++;
		}
		return true;
	}
}
