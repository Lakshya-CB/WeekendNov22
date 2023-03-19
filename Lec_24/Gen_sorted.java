package Lec_24;

public class Gen_sorted {
	public static void main(String[] args) {
		int[] arr1 = { 10, 15, 25 };
		int[] arr2 = { 1, 5, 20, 30 };

		solve("", 0, arr1, 0, arr2, true, Integer.MIN_VALUE);
	}

	public static void solve(String path, int idxA, int[] A, int idxB, int[] B, boolean turnA, int prev) {
		if (turnA) {
			if (!path.isEmpty()) {
				System.out.println(path);
			}
			for (int i = idxA; i < A.length; i++) {
				if (A[i] > prev) {
					solve(path + A[i] + " ", i + 1, A, idxB, B, false, A[i]);
				}
			}
		} else {
			for (int i = idxB; i < B.length; i++) {
				if (B[i] > prev) {
//				System.out.println(path+B[i]);
					solve(path + B[i] + " ", idxA, A, i + 1, B, true, B[i]);
				}
			}
		}
	}
}
