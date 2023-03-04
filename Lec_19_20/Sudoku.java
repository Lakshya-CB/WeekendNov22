package Lec_19_20;

public class Sudoku {
	static boolean suuvle = false;
	public static void main(String[] args) {
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		suuvle = false;
		print(board);
		System.out.println("------------------");
		solve(0, 0, board);

		System.out.println("------------------");
		print(board);
	}

	public static void print(char[][] arr) {
		for (char[] row : arr) {
			for (char ch : row) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}

	public static void solve(int r, int c, char[][] board) {

		if (c == 9) {
			r++;
			c = 0;
		}
		if (r == 9) {
//			print(board);
//			System.out.println("============");
			suuvle = true;
			return;
		}
		if (board[r][c] != '.') {
			solve(r, c + 1, board);
		} else {
			for (char ch = '1'; ch <= '9'; ch++) {
				if (isSafe(board, r, c, ch)) {
					board[r][c] = ch;
					solve(r, c + 1, board);
					if(suuvle) {
						return;
					}
				}

			}
			
			board[r][c] = '.';
		}
	}

	private static boolean isSafe(char[][] board, int r, int c, char ch) {
		for (int row = 0; row < 9; row++) {
			if (board[row][c] == ch) {
				return false;
			}
		}
		for (int col = 0; col < 9; col++) {
			if (board[r][col] == ch) {
				return false;
			}
		}
		int boxr = r / 3;
		int boxc = c / 3;
		for(int row  = boxr*3;row<boxr*3+3;row++) {
			for(int col  = boxc*3;col<boxc*3+3;col++) {
				if(board[row][col]==ch) {
					return false;
				}
			}
		}
		return true;
	}
}
