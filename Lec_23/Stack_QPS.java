package Lec_23;

import java.util.Arrays;
import java.util.Stack;

public class Stack_QPS {
	public static void main(String[] args) {
		Stack<Integer> S = new Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.add(40);
		S.add(50);
//		System.out.println(S);
////		System.out.println(S.pop()); 
////		System.out.println(S);
////		System.out.println(S.pop()); 
////		System.out.println(S);	
////		print_rec(S);
//		print_recR(S);
//		System.out.println(S);
		Rev(S);
		System.out.println("================");
		int[] arr = { 50, 30, 20, 40, 10, 45, 5, 60, 15, 8 };
		NextGr8_2(arr);
	}

	public static void print(Stack<Integer> S) {
		Stack<Integer> EX = new Stack<>();
		while (!S.isEmpty()) {
			int ali = S.pop();
			EX.add(ali);
			System.out.print(ali + " ");
		}
		while (!EX.isEmpty()) {
			S.add(EX.pop());
		}
		System.out.println();
	}

	public static void print_rec(Stack<Integer> S) {
//		n
//		n-1
		if (S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		System.out.println(ali);
		print_rec(S);
		S.add(ali);
	}

	public static void print_recR(Stack<Integer> S) {
//		n
//		n-1
		if (S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		print_recR(S);
		S.add(ali);
		System.out.println(ali);
	}

	public static void copy(Stack<Integer> S, Stack<Integer> EX) {
		if (S.isEmpty()) {
			return;
		}
		int ali = S.pop();
		copy(S, EX);
		EX.add(ali);
	}

	public static void Rev(Stack<Integer> S) {
		Stack<Integer> EX = new Stack<>();
		copy(S, EX);
		System.out.println(EX);
		System.out.println(S);
		while (!EX.isEmpty()) {
			S.add(EX.pop());
		}
	}

	public static void NextGr8(int[] arr) {
//		{50,30,20,40,10,45,5,60,15,8};
		Stack<Integer> S = new Stack<>();
		for (int B : arr) {
			while (!S.isEmpty() && S.peek() < B) {
				int A = S.pop();
				System.out.println(A + "=>" + B);
			}
			S.add(B);
		}
	}

	public static void NextGr8_2(int[] arr) {
//		{50,30,20,40,10,45,5,60,15,8};
		Stack<Integer> S = new Stack<>();
		int[] ans = new int[arr.length];
		for (int idx = 0; idx < arr.length; idx++) {
			int B = arr[idx];
			while (!S.isEmpty() && arr[S.peek()] < B) {
				int A_idx = S.pop();
				ans[A_idx] = B; 
//				System.out.println(A + "=>" + B);
				
			}
			S.add(idx);
		}
		System.out.println(Arrays.toString(ans));
	}

}
