package Lec_25;

import java.util.Scanner;

public class Viviek {
	public static void main(String[] args) {
//		int[] arr = { 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1 };
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(solve(arr, 0, arr.length-1));
	}

	public static int solve(int[] arr, int s, int e) {
		int ans = 0;
		for(int chakku = s;chakku<=e-1;chakku++) {
			long L_sum = sum(arr, s, chakku);
			long R_sum = sum(arr, chakku+1,e);
			if(L_sum==R_sum) {
//				left => 
				int L = solve(arr, s, chakku);
				int R = solve(arr, chakku+1, e);
				int curr =  Math.max(L, R)+1;
				ans = Math.max(ans, curr);
			}
		}
		return ans;
	}
	public static long sum(int[] arr, int s, int e) {
		long sum=0;
		for(int i=s;i<=e;i++) {
			sum=sum + arr[i];
		}
		return sum;
	}
}
