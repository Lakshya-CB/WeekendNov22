package Lec_03_Patterns;

public class Pat_01 {
	public static void main(String[] args) {
		int n = 5;

		int row = 1;
		while (row <= n) {
			int cnt_st = 0;
			while (cnt_st < n) {
//				if (row == 1 && row ==n) {
				if (row == 1 || row == n || 
						cnt_st == 0||cnt_st==n-1) {

					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				cnt_st++;
			}
			row++;
			System.out.println();

		}
	}
}
