package Lec_07;

public class Array_QPS_2 {
	public static void main(String[] args) {
		int[] arr = {2,4,3,1,0};
		int[] copu = Copy(arr);
		print(arr);
		print(copu);
		
	}
	public static void print(int[] arr) {
		for(int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static int[] Copy(int[] arr) {
		int[] na = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			na[i] = arr[i];
		}
		return na;
	}
	public static int[] Inv(int[] arr) {
		int[] na = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int ali =arr[i];
			na[ali] = i;
		}	
		return na;
	}
}
