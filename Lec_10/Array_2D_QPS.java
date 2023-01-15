package Lec_10;

public class Array_2D_QPS {
	public static void main(String[] args) {
		int[][] arr = { { 11, 12, 13, 14 } };
//		wavey(arr);
		spiral(arr);
	}

	public static void wavey(int[][] arr) {
		for (int c = 0; c < arr[0].length; c++) {
			if (c % 2 == 0) {
				for (int r = 0; r < arr.length; r++) {
					System.out.print(arr[r][c] + " ");
				}
			} else {
				for (int r = arr.length - 1; r >= 0; r--) {
					System.out.print(arr[r][c] + " ");
				}
			}
		}
	}

	public static void spiral(int[][] arr) {
		int min_r = 0;
		int max_r = arr.length - 1;
		int min_c = 0;
		int max_c = arr[0].length - 1;
		int count = 0;
		int lim = arr.length * arr[0].length;
		while (min_c <= max_c && min_r <= max_r) {
//		side 1 
			for (int r = min_r; r <= max_r && count < lim; r++) {
				System.out.print(arr[r][min_c] + " ");
				count++;
			}

			System.out.println();
//		side 2:
			for (int c = min_c + 1; c <= max_c && count < lim; c++) {
				System.out.print(arr[max_r][c] + " ");
				count++;

			}
			System.out.println();
//		side 3:
			for (int r = max_r - 1; r >= min_r && count < lim; r--) {
				System.out.print(arr[r][max_c] + " ");
				count++;

			}

			System.out.println();
//		side 4:
			for (int c = max_c - 1; c >= min_c + 1 && count < lim; c--) {
				System.out.print(arr[min_r][c] + " ");
				count++;

			}
			System.out.println();
			min_r++;
			min_c++;
			max_c--;
			max_r--;
			System.out.println("=======");
		}
	}

	public static boolean search(int[][] mat, int ali) {
		int r = mat.length - 1;
		int c = 0;
		while (r>=0 && c< mat[0].length) {
			if (ali == mat[r][c]) {
				return true;
			} else if (ali > mat[r][c]) {
				c++;
			} else {
				r--;
			}
		}
		return false;
	}
}
