package Lec_16;

public class Gen_paren {
	public static void main(String[] args) {
		suvle(0, 0, "", 4);
	}

	public static void suvle(int op, int cl, String path, int n) {
		if (op == n && cl == n) {
			System.out.println(path);
			return;
		}
		if(op<cl) {
			return;
		}
		if (op < n) {
			suvle(op + 1, cl, path + "(", n);
		}
		if (cl < n) {
			suvle(op, cl + 1, path + ")", n);
		}
	}
}
