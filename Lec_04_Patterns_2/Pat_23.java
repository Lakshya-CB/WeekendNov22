package Lec_04_Patterns_2;

public class Pat_23 {
	public static void main(String[] args) {
		int n = 5;
		int row = 1;
		int total_sp = n - 1;
		int total_st = 1;
		int num_st = 1;
		while (row <= n) {
			int cnt_sp = 0;
			while (cnt_sp < total_sp) {
				System.out.print("\t");
				cnt_sp++;
			}

			int num = num_st;

			int cnt_st = 0;
			while (cnt_st < total_st) {
				System.out.print(num + "\t");
				if (cnt_st < total_st / 2) {
					num++;
				} else {
					num--;
				}
				cnt_st++;
			}

			System.out.println();
			row++;
			num_st++;
			total_sp--;
			total_st = total_st + 2;
		}
	}
}
