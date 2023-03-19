package Lec_25;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_QPS {
	public static void main(String[] args) {
		Queue<Integer> Q = new LinkedList<>();
		Q.add(10);
		Q.add(20);
		Q.add(30);
		Q.add(40);
//		System.out.println(Q);
//		System.out.println(Q.poll());
//		print(Q);
		System.out.println(Q);
		Rev(Q,0);
//		System.out.println(Q);
		int[] arr= {-20,10,-5,4,6,-9,-80,60,50};
		First_negK(arr, 3);
	}
	public static void Rev(Queue<Integer>Q, int cnt) {
		if(cnt==Q.size()) {
			return;
		}
		int ali = Q.poll();
		Q.add(ali);
		Rev(Q,cnt+1);
		System.out.println(ali);
		
	}
	public static void print(Queue<Integer>Q) {
		for(int i=1;i<=Q.size();i++) {
			int ali = Q.poll();
			System.out.print(ali+" ");
			Q.add(ali);
		}
		System.out.println();
	}
	public static void First_negK(int[] arr, int k) {
		Queue<Integer> Q= new LinkedList<>();
		for(int i=0;i<k;i++) {
			if(arr[i]<0) {
				Q.add(i);
			}
		}
		System.out.println(arr[Q.peek()]);
		for(int s =1;s<=arr.length-k;s++) {
//			idx to del s-1;
			if(!Q.isEmpty()&& Q.peek()==s-1) {
				Q.poll();
			}
			int e = s+k-1;
			if(arr[e]<0) {
				Q.add(e);
			}
			System.out.println(arr[Q.peek()]);
			
		}
	}
}
