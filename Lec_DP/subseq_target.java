package Lec_DP;

import java.util.Scanner;

public class subseq_target {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		int target = scn.nextInt();
		for (int ll = 1; ll <= arr.length; ll++) {
			solve(arr.length - 1, target, ll, "", arr);
		}
	}

	public static void solve(int i, int target, int len, String path, int[] arr) {
		if (len == 0 && target == 0) {
			System.out.println(path);
			return;
		}
		if (len < 0 || target < 0 || i < 0) {
			return;
		}
		solve(i - 1, target - arr[i], len - 1, path + arr[i] + " ", arr);
		solve(i - 1, target, len, path, arr);

	}
}
