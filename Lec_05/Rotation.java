package Lec_05;

public class Rotation {
	public static void main(String[] args) {
		int num = 12345;
		int r = 3;

		int baackup = num;
		int nod = 0;
		while (num > 0) {
			num = num / 10;
			nod++;
		}
		num = baackup;
		int dividend = (int) Math.pow(10, r);

		int p1 = num / dividend;
		int p2 = num % dividend;
		System.out.println(p1 + " - " + p2);

		int mult = (int) Math.pow(10, nod - r);
		System.out.println(p2 * mult + p1);
	}
}
