package Lec_06;

public class Arrays_demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr);

		int size = arr.length;
		System.out.println(size);

//		indexing!!
//		set at index i
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 6;
		arr[3] = 8;
		arr[4] = 10;
				
		
//		get at index i
		
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		System.out.println(arr[3]);
//		System.out.println(arr[4]);
//		System.out.println(arr[50909000]);
		
		System.out.println(arr[arr.length - 1]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}
