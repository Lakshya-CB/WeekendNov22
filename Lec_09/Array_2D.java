package Lec_09;

public class Array_2D {
	public static void main(String[] args) {
		int[][] arr = new int[3][5]; // RxC
		System.out.println(arr);

		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		for (int[] row : arr) {
			for (int ali : row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}

		System.out.println();

//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 3;
//		arr[0][3] = 4;
//		arr[0][4] = 5;
		int ali2 = 1;
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				arr[r][c] = ali2;
				ali2++;
			}
		}

		for (int[] row : arr) {
			for (int ali : row) {
				System.out.print(ali + " ");
			}
			System.out.println();
		}

		System.out.println();

//		System.out.println(arr.length);

	   	 int[][] arr1 = { { 11, 12, 13, 14 },
	   					    { 21, 22, 23, 24 },
	   					    { 31, 32, 33, 34 },
	   					    { 41, 42, 43, 44 }};
	}
}
