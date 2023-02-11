package Lec_14_Doubts;

import java.util.Arrays;
import java.util.Scanner;

public class Form_min2 {
	public static void main(String[] args) {

		String str = "DDDIIDDD";
		int[] arr = new int[str.length() + 1];
		int countD = 0;
		int num = 1;
		for (int i = 0; i <= str.length(); i++) {
			if (i < str.length() && str.charAt(i) == 'D') {
				countD++;
			} else {
				for (int count = 1; count <= countD + 1; count++) {
					arr[i - count + 1] = num;
					num++;
				}
				countD = 0;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
