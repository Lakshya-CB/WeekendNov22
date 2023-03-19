package Lec_24;

public class Gen_sorted2 {
	public static void main(String[] args) {
		int[] arr1 = {10 ,15, 25};
		int[] arr2 = { 1 ,5 ,20 ,30 };

		solve("", 0, arr1, 0, arr2, true, Integer.MIN_VALUE);
	}

	public static void solve(String path, 
			int idxA, int[] A, int idxB, 
			int[] B, boolean turnA, int prev) {
		if (turnA) {
			if (idxA < A.length) {
				if (A[idxA] > prev) {
					solve(path + A[idxA] + " ", idxA + 1, A, idxB, B, false, A[idxA]);
				}
				solve(path, idxA + 1, A, idxB, B, true, prev);
			}else {
				if (!path.isEmpty()) {
					System.out.println(path);
				}
			}
		} else {
			if (idxB < B.length) {
//			System.out.println(path+B[idxB]+" ");
				if (B[idxB] > prev) {
					solve(path + B[idxB] + " ", idxA, A, idxB + 1, B, true, B[idxB]);
				}
				solve(path, idxA, A, idxB + 1, B, false, prev);
			}
		}
	}
}
