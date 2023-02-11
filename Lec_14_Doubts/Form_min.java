package Lec_14_Doubts;

import java.util.Arrays;
import java.util.Scanner;

public class Form_min {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			t--;

			String str = scn.next();
			int[] arr = new int[str.length() + 1];
			int num = 1;
			for (int i = 0; i <= str.length();) {
				if (i == str.length() || str.charAt(i) == 'I') {
					arr[i] = num;
					num++;
					i++;
				} else {
					int countD = 0;
					int j = i;
					for (; j < str.length(); j++) {
						if (str.charAt(j) == 'D') {
							countD++;
						} else {
							break;
						}
					}
					for (int idx = j; idx >= i; idx--) {
						arr[idx] = num;
						num++;
					}
					i = j + 1;
				}
			}
//			System.out.println(Arrays.toString(arr));
			String ans = "";
			for(int ali : arr) {
				ans = ans + ali;
			}
			System.out.println(ans);
		}
	}
}
