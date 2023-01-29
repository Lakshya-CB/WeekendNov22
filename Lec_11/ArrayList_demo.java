package Lec_11;

import java.util.ArrayList;

public class ArrayList_demo {
	public static void main(String[] args) {
		int[] arr = new int[5];
		ArrayList<Integer> AL = new ArrayList<Integer>();

		AL.add(10);
		AL.add(20);
		AL.add(30);
		AL.add(40);

		System.out.println(AL);
//		indexing1!
		System.out.println(arr[0]);
		System.out.println(AL.get(AL.size() - 1));
		AL.set(0, 11);
		System.out.println(AL);

		AL.add(2, 25);
		System.out.println(AL);

		AL.remove(3);
//		System.out.println(AL);
//		int[] arr1 = { 10, 10, 20, 30, 35, 35, 40, 50, 60, 120, 130 };
//		int[] arr2 = { 20, 32, 35, 35, 35, 50, 55, 64, 70 };
//		System.out.println(Inter(arr1, arr2));
		System.out.println("==========");
		int[] arr1 = { 9, 9, 8, 7 };
		int[] arr2 = { 6, 5 };
		System.out.println(add(arr1, arr2));

	}

	public static ArrayList<Integer> Inter(int[] arr1, int[] arr2) {
		ArrayList<Integer> AL = new ArrayList<>();
		int idx1 = 0;
		int idx2 = 0;
		while (idx1 < arr1.length && idx2 < arr2.length) {
			if (arr1[idx1] == arr2[idx2]) {
				AL.add(arr1[idx1]);
				idx1++;
				idx2++;
			} else if (arr1[idx1] < arr2[idx2]) {
				idx1++;
			} else {
				idx2++;
			}
		}
		return AL;

	}

	public static ArrayList<Integer> add(int[] arr1, int[] arr2) {
		int idx1 = arr1.length - 1;
		int idx2 = arr2.length - 1;
		int carry = 0;
		ArrayList<Integer> AL = new ArrayList<>();
		while (idx1 >= 0 || idx2 >= 0) {
			int sum = carry;
			if (idx1 >= 0) {
				sum = sum + arr1[idx1];
			}
			if (idx2 >= 0) {
				sum = sum + arr2[idx2];
			}
			int digit = sum % 10;
			carry = sum / 10;
			AL.add(0, digit);
			idx1--;
			idx2--;
		}
		if (carry != 0) {
			AL.add(0, carry);
		}
		return AL;
	}
}
