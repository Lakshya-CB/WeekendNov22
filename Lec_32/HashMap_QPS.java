package Lec_32;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class HashMap_QPS {
//2some karadiya
	public static void main(String[] args) {
//		int[] arr1 = { 30, 20, 40, 50, 70, 30, 20, 20, 50, 50 };
//
//		int[] arr2 = { 50, 80, 30, 20, 20, 20, 90, 50, 20 };
//		intersection(arr1, arr2);
		int[] arr = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 1, 8, 6 };
//		chain(arr);
		Median(arr);
	}

	public static void intersection(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> HM = new HashMap<>();
		for (int ali : arr2) {
//			if (HM.containsKey(ali)) {
//				int prev = HM.get(ali);
//				HM.put(ali, prev + 1);
//			} else {
//				HM.put(ali, 1);
//			}
			int prev = HM.getOrDefault(ali, 0);
			HM.put(ali, prev + 1);
		}
		System.out.println(HM);
		for (int ali : arr1) {
			if (HM.containsKey(ali) && HM.get(ali) > 0) {
				System.out.println(ali);
				int prev = HM.get(ali);
				HM.put(ali, prev - 1);
			}
		}
	}

	public static void chain(int[] arr) {
//		 [2,12,9,16,10,5,3,20,25,11,1,8,6]
		HashSet<Integer> Set = new HashSet<>();
		for (int ali : arr) {
			Set.add(ali);
		}
		for (int ali : arr) {
			if (!Set.contains(ali - 1)) {
				int s = ali;
				while (Set.contains(s)) {
					System.out.print(s + " ");
					s++;
				}
				System.out.println();
			}
		}
	}

	public static void Median(int[] arr) {
		PriorityQueue<Integer> Left = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> Right = new PriorityQueue<>();
		for (int ali : arr) {
			if (Left.isEmpty() || ali < Left.peek()) {
				Left.add(ali);
			} else {
				Right.add(ali);
			}
			if (Left.size() - Right.size() > 1) {
				Right.add(Left.poll());
			}
			if (Right.size() - Left.size() > 1) {
				Left.add(Right.poll());
			}
			if (Left.size() == Right.size()) {
				System.out.println((Left.peek() + Right.peek()) / 2.0);
			} else if (Left.size() > Right.size()) {
				System.out.println(Left.peek());
			} else {
				System.out.println(Right.peek());
			}
		}

	}
}
