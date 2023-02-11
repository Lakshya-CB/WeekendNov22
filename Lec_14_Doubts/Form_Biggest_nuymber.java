package Lec_14_Doubts;

import java.util.Arrays;
import java.util.Scanner;

public class Form_Biggest_nuymber {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			t--;
			
			int[] arr = new int[scn.nextInt()];
			for(int i=0;i<arr.length;i++) {
				arr[i] = scn.nextInt(); 
			}
			for (int count = 1; count <= arr.length - 1; count++) {
				for (int i = 0; i <= arr.length - 2; i++) {
					if (compare(arr[i], arr[i + 1]) < 0) {
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
					}
				}
			}
			String ans = "";
			for (int ali : arr) {
				ans = ans + ali;
			}
			System.out.println(ans);
		}
	}

	public static int compare(int n1, int n2) {
		long c1 = Long.parseLong(n1 + "" + n2);
		long c2 = Long.parseLong(n2 + "" + n1);
		if (c1 > c2) {
			return 1;
		} else {
			return -1;
		}
	}
}
