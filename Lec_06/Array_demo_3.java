package Lec_06;

public class Array_demo_3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] other = arr;
		
		other[0] = 99;
		
		System.out.println(arr[0]);
	}
}
