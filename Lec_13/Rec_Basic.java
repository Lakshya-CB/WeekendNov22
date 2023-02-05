package Lec_13;

public class Rec_Basic {
	public static void main(String[] args) {
		PI(4);
	}

	public static void PI(int n) {
//	BP : PI(n)
//	SP : PI(n-1)
		if (n == 0) {
			return;
		}
		PI(n - 1);//
		System.out.println(n);
	}

	public static void PI2(int s, int e) {
		if (s > e) {
			return;
		}
//		BP : 1 to 4
//		SP : 2 to 4
		System.out.println(s);
		PI2(s + 1, e);
	}

	public static void PID(int n) {
		if (n == 0) {
			return;
		}
//		BP n
//		SP n-1
		System.out.println(n);
		PID(n - 1);
		System.out.println(n);
	}

	public static void PDI(int s, int e) {
		if(s>e) {
			return;
		}
//		BP : s to e e to s
//		SP : s+1 to e e to s+1
		System.out.println(s);
		PDI(s + 1, e);
		System.out.println(s);
	}
}
