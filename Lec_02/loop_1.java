package Lec_02;

public class loop_1 {
	public static void main(String[] args) {
		int n = 5;
		int cnt = 1;
		int sum = 0;
		while (cnt <= n) {
//			System.out.println(cnt);
			sum = sum +cnt;
			cnt = cnt + 1;
			
		}
		System.out.println(sum);
		System.out.println(cnt);
	}
}
