package Lec_06;

public class Rotation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		print(arr);
		rotation(arr, 0);
		print(arr);

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void rotation(int[] arr, int rot) {
		int jeb = arr[arr.length-1];
		for (int i = arr.length - 2; i >= 0; i--) {
			arr[i + 1] = arr[i];
		}
		arr[i] = jeb;

	}
}
