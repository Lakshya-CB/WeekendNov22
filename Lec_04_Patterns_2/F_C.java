package Lec_04_Patterns_2;

public class F_C {
	public static void main(String[] args) {
		int min_F = 0;
		int max_F = 100;
		int step = 20;

		for (int F = min_F; F <= max_F; F = F + step) {
//			int C = (5 / 9) * (F - 32);
			
//			int C = 5 * (F - 32) / 9;
			int C = (int)((5 / 9.0) * (F - 32));
			
			System.out.	println(F + " - " + C);
		}
	}
}
