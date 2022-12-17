package Lec_04_Patterns_2;

public class Rotate_num {
	public static void main(String[] args) {
		int num = 12345;
		int rot = 7;

		int baack_up = num;

		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		num = baack_up;

		System.out.println(nod);
		rot = rot % nod;

		for (int r = 0; r < rot; r++) {
			int digit = num % 10;
			int remain = num / 10;
//			System.out.println(digit + " - " + remain);

			int mult = (int) Math.pow(10, 4);
//			System.out.println(mult);

			num = digit * mult + remain;

			System.out.println(num);
		}
	}
}
