package Lec_12;

public class Dokha {
	public static void main(String[] args) {
		int n = 100_000;
		long start = System.currentTimeMillis();

		int sum =0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
//			str = str + i;
			sb.append(i);
//			sum = sum +i;
		}
		String ans = sb.toString();
		long end = System.currentTimeMillis();

		System.out.println((end - start) / 1000.0);
	}
}
