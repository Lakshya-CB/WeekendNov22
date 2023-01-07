package Lec_07;

public class Rotation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		print(arr);
		rotation(arr, 2);
		print(arr);
		
		System.out.println(-13%4);

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void rotation(int[] arr, int rot) {
		rot = rot % arr.length;
		if(rot<0) {
			rot = rot+arr.length;
		}
		for (int r = 0; r < rot; r++) {
			int jeb = arr[arr.length - 1];
			for (int i = arr.length - 2; i >= 0; i--) {
				arr[i + 1] = arr[i];
			}
			arr[0] = jeb;
		}
	}
	public static void rotation2(int[] arr, int rot) {
		rot = rot % arr.length;
		if(rot<0) {
			rot = rot+arr.length;
		}
//		Step 1) :
		Rev(arr, 0, arr.length-1);
//		Step 2) :
		Rev(arr, 0, rot-1);
//		Step 3) 
		Rev(arr, rot, arr.length-1);
		
	}
	public static void Rev(int[] arr, int s, int e) {
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
