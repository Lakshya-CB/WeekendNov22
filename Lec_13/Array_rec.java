package Lec_13;

public class Array_rec {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };

	}

	public static void print(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
//		BP : 0
//		SP : 1'
		System.out.println(arr[idx]);
		print(arr, idx + 1);
	}

	public static void Rev(int[] arr, int idx) {
		if (idx == arr.length) {
			return;
		}
//		BP : 0
//		SP : 1'

		Rev(arr, idx + 1);
		System.out.println(arr[idx]);
	}

	public static int Max(int[] arr, int idx) {
		if(idx==arr.length) {
			return Integer.MIN_VALUE;
		}
//		if(idx==arr.length-1) {
//			return arr[idx];
//		}
//		BP : aar,0
//		SP : arr, 1
		int sp = Max(arr, idx + 1);
		if (sp > arr[idx]) {
			return sp;
		} else {
			return arr[idx];
		}
	}
	public static boolean find(int[] arr, int idx, int ali) {
		if(idx==arr.length) {
			return false;
		}
//		BP : find(0,ali)
//		SP : find(1,ali)
		boolean sp = find(arr, idx+1, ali);
		if(arr[idx]==ali) {
			return true;
		}else {
			return sp;
		}
	}
}
