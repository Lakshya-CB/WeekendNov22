package Lec_06;

public class Array_QPS {
	public static void main(String[] args) {
		int[] arr = { 10, 11, 9, 18, 1 };
//		System.out.println(max(arr));
//		System.out.println(Find(arr, 9));
		print(arr);
		Rev(arr);
		print(arr);

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int max(int[] arr) {

//		int jeb = Integer.MIN_VALUE;
		int jeb = arr[0];

		for (int aam : arr) {
			if (aam > jeb) {
				jeb = aam;
			}
		}
		return jeb;
	}

	public static int Find(int[] arr, int ali) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ali) {
				return i;
			}
		}
		return -1;
	}

	public static void RevPrint(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void Rev(int[] arr) {
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
//			chwap!! s and e
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}
}
