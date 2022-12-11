package Lec_03_Patterns;

public class Pat_01_p2 {
	public static void main(String[] args) {
		int n = 5;
//		Step 1
		int row = 1;
		int total_st = n;
		while (row <= n) {
//			Step 2 : *
			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print("* ");
				cnt_st++;
			}

			row++;
			System.out.println();
		}
	}
}
