package Lec_08;

public class Sub_Array_sum1 {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		sumPrint(arr);
		sumPrint2(arr);
	}
	public static void sumPrint(int[] arr) {
	
		int max_sum = Integer.MIN_VALUE;
		for(int s =0;s<arr.length;s++) {		
			for(int e = s;e<arr.length;e++) {
//				System.out.println(s+" - "+e);
				int sum =0;
				for(int i =s;i<=e;i++) {
					System.out.print(arr[i]+" ");
					sum = sum+arr[i];
				}
				System.out.println("=>"+sum);
				max_sum = Math.max(max_sum, sum);
			}
		}
		System.out.println(max_sum);
	}
	public static void sumPrint2(int[] arr) {
		
		int max_sum = Integer.MIN_VALUE;
		for(int s =0;s<arr.length;s++) {		
			int sum =0;
			for(int e = s;e<arr.length;e++) {
//				System.out.println(s+" - "+e);
				
				sum = sum+arr[e];
//				System.out.println(sum);
				max_sum = Math.max(max_sum, sum);
			}
		}
		System.out.println(max_sum);
	}
	public static void Kadance(int[] arr) {
		int sum =0;
		int ans = Integer.MIN_VALUE;
		for(int ali : arr) {
			sum = sum +ali;
			ans = Math.max(ans,sum);
			if(sum<0) {
				sum =0;
			}
		}
		System.out.println(ans);
	}
}
