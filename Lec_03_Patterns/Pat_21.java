package Lec_03_Patterns;

public class Pat_21 {
	public static void main(String[] args) {
		int n = 4;
		int row = 1;
		int total_st = 1;
		int total_sp = 2 * n - 3;

		while (row <= n) {
//          *1
			int cnt_st1 = 0;
			while (cnt_st1 < total_st) {
				System.out.print("* ");
				cnt_st1++;
			}
//			space
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}
//          *2
			int cnt_st2 = 0;
			if (row == n) {
				cnt_st2 = 1;
			}
			while (cnt_st2 < total_st) {
				System.out.print("* ");
				cnt_st2++;
			}

			row++;
			total_st++;
			total_sp = total_sp - 2;
			System.out.println();
		}
	}
}
