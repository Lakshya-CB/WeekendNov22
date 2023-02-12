package Lec_15;

import java.util.Arrays;

public class Array_rec_2 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 20, 20, 30, 20 };
//		System.out.println(LastOcc(arr, 0, 20));
		System.out.println(Arrays.toString(allOcc(arr, 0, 20, 0)));

	}

	public static int firstOcc(int[] arr, int idx, int ali) {
		if (idx == arr.length) {
			return -1;
		}
//		BP: arr, 0
//		SP: arr, 1
		int sp = firstOcc(arr, idx + 1, ali);
		if (arr[idx] == ali) {
			return idx;
		} else {
			return sp;
		}
	}

	public static int LastOcc(int[] arr, int idx, int ali) {
		if (idx == arr.length) {
			return -1;
		}
		int sp = LastOcc(arr, idx + 1, ali);

		if (idx > sp && arr[idx] == ali) {
//		if (sp !=-1 && arr[idx] == ali) {

			return idx;
		} else {
			return sp;
		}
	}

	public static int[] allOcc(int[] arr, int idx, int ali, int cnt) {
		if (idx == arr.length) {
			return new int[cnt];
		}
		if (arr[idx] == ali) {
			int[] sp = allOcc(arr, idx + 1, ali, cnt + 1);
			sp[cnt] = idx;
			return sp;
		} else {
			int[] sp = allOcc(arr, idx + 1, ali, cnt);
			return sp;
		}

	}

}
