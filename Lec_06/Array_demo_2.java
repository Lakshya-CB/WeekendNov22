package Lec_06;

public class Array_demo_2 {
	public static void main(String[] args) {
		int[] arr = new int[10];
//		arr[0] =3;
//		arr[1] =6;
//		arr[2] =9;
//		arr[3] =12;
		for(int i=0;i<arr.length;i++) {
			arr[i] = 3*(i+1);
		}
		System.out.println(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		System.out.println("===============");
		
		for( int aloo: arr) {
//			aloo = arr[i]
			aloo = 10;
//			System.out.println(aloo);
		}

		System.out.println("===============");
		for( int aloo: arr) {
			System.out.println(aloo);
		}
	}
}
