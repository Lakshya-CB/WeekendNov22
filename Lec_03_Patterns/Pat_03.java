package Lec_03_Patterns;

public class Pat_03 {
public static void main(String[] args) {
	int n = 5;
	int row = 1;
	int total_st  = n;
	while(row<=n) {
		int cnt_st = 0;
		while(cnt_st< total_st) {
			System.out.print("* ");
			cnt_st++;
		}
		
		row++;
		total_st--;
		System.out.println();
	}
}
}
