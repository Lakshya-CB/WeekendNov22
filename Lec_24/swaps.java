package Lec_24;

import java.util.Arrays;

public class swaps {
	public static void main(String[] args) {
		int[] arr = {5,2,3,2,7,9,4};
		swap(arr, 3);
	}
	public static void swap(int[] arr, int k) {
		if(k==0) {
			return;
		}
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
				swap(arr, k-1);
				
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

}
