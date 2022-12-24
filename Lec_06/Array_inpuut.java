package Lec_06;

import java.util.Scanner;

public class Array_inpuut {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int size = scn.nextInt();
		int[] arr = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
	
		for(int ali : arr) {
			System.out.print(ali+ " ");
		}
		System.out.println();
	
	}
}
