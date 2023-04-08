package Lec_31;

import java.util.PriorityQueue;

public class PQ_QPSD {
	public static void main(String[] args) {
//		int[] arr = { 20, 30, 60, 50, 10, 55, 57, 40 };
//		K_Largest(arr, 3);
		int[][] arr = 
			{{10,20,30}, 
			{15,35}, 
			{5,7,12,25} ,
			 {17, 22, 40}};
		mergeK_Sorted(arr);
	}

	public static void K_Largest(int[] arr, int k) {
		PriorityQueue<Integer> PQ = new PriorityQueue<Integer>();
		for (int ali : arr) {
			PQ.add(ali);
			if (PQ.size() > k) {
				PQ.poll();
			}
		}
		System.out.println(PQ);
	}

	static class pair implements Comparable<pair> {
		public pair(int i, int arr_idx2, int j) {
			// TODO Auto-generated constructor stub
			ali = i;
			arr_idx = arr_idx2;
			ali_idx = j;
		}

		int ali;
		int arr_idx;
		int ali_idx;
		@Override
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return this.ali- o.ali;
		}
	}

	public static void mergeK_Sorted(int[][] mat) {
		PriorityQueue<pair> PQ = new PriorityQueue<>();
		for (int arr_idx = 0; arr_idx < mat.length; arr_idx++) {
			PQ.add(new pair(mat[arr_idx][0], arr_idx, 0));
		}

		while (!PQ.isEmpty()) {
			pair nn = PQ.poll();
			System.out.println(nn.ali);

			nn.ali_idx++;
			if (nn.ali_idx < mat[nn.arr_idx].length) {
				nn.ali = mat[nn.arr_idx][nn.ali_idx];
				PQ.add(nn);
			}
		}
	}
}
