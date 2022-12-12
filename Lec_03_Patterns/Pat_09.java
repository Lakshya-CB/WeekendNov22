package Lec_03_Patterns;

public class Pat_09 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_st = 1;
		int total_sp = n - 1;
		while (row <= n) {
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("  ");
				cnt_sp++;
			}

			int cnt_st = 0;
			while (cnt_st < total_st) {
				if(cnt_st%2==0) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				cnt_st++;
			}

			System.out.println();
			row++;
			total_st = cnt_st + 2;
			total_sp--;
		}

	}
}
