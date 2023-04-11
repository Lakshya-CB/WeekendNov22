package Lec_33;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Graph {
//HashMap<V,Nbrs> HM
//HashMap<Integer,HashMap<V2,E>>
//	HashMap<V1,HashMap<V2,E_Wt>>
	HashMap<Integer, HashMap<Integer, Integer>> HM;

	public Graph(int numV) {
		HM = new HashMap<>();
		for (int V = 1; V <= numV; V++) {
			HM.put(V, new HashMap<>());
		}
	}

	public void addEdge(int v1, int v2, int wt) {
		HashMap<Integer, Integer> Nbrs_V1 = HM.get(v1);
		Nbrs_V1.put(v2, wt);

		HashMap<Integer, Integer> Nbrs_V2 = HM.get(v2);
		Nbrs_V2.put(v1, wt);

	}

	public boolean containsEdge(int v1, int v2) {
		return HM.get(v1).containsKey(v2);
	}

	public int getEdge(int v1, int v2) {
		return HM.get(v1).get(v2);
	}

	public void remove(int v1, int v2) {
		HM.get(v1).remove(v2);
		HM.get(v2).remove(v1);
	}

	public int numOfEdges() {
		int ans = 0;
		for (int v : HM.keySet()) {
			ans = ans + HM.get(v).size();
		}
		return ans / 2;
	}

	public boolean hasPath(int v1, int v2) {
		return hasPath(v1, v2, new HashSet<>());
	}

	private boolean hasPath(int v1, int v2, HashSet<Integer> Visited) {
		if (v1 == v2) {
			return true;
		}
		System.out.println(v1);
		boolean ans = false;
		Visited.add(v1);
		for (int nbr : HM.get(v1).keySet()) {
			if (!Visited.contains(nbr)) {
				boolean sp = hasPath(nbr, v2, Visited);
				ans = ans || sp;
			}
		}
		return ans;
	}

	public void AllPath(int v1, int v2) {
		AllPath(v1, v2, new HashSet<>(), "" + v1);
		return;
	}

	private void AllPath(int v1, int v2, HashSet<Integer> Visited, String path) {
		if (v1 == v2) {
			System.out.println(path);
			return;
		}
		Visited.add(v1);
		for (int nbr : HM.get(v1).keySet()) {
			if (!Visited.contains(nbr)) {
				AllPath(nbr, v2, Visited, path + " - " + nbr);
			}
		}
		Visited.remove(v1);

	}

	public void BFS(int v1) {
		Queue<Integer> Q = new LinkedList<>();
		HashSet<Integer> Visited = new HashSet<>();
		Q.add(v1);
		while (!Q.isEmpty()) {
			int curr = Q.poll();
			if (Visited.contains(curr)) {
				System.out.println("cyclce!!!");
				continue;
			}
			System.out.println(curr);
			Visited.add(curr);
			for (int nbr : HM.get(curr).keySet()) {
				if (!Visited.contains(nbr)) {
					Q.add(nbr);
				}
			}
		}
	}

	public void BFT() {
		int numOfComps = 0;
		HashSet<Integer> Visited = new HashSet<>();
		for (int V : HM.keySet()) {
			if (Visited.contains(V)) {
				continue;
			}
			numOfComps++;
			System.out.println("=============");
			Queue<Integer> Q = new LinkedList<>();
			Q.add(V);
			while (!Q.isEmpty()) {
				int curr = Q.poll();
				if (Visited.contains(curr)) {
					System.out.println("cyclce!!!");
					continue;
				}
				System.out.println(curr);
				Visited.add(curr);
				for (int nbr : HM.get(curr).keySet()) {
					if (!Visited.contains(nbr)) {
						Q.add(nbr);
					}
				}
			}
		}
	}

	class Dijpair implements Comparable<Dijpair> {
		public Dijpair(int src, int i) {
			v = src;
			wt = i;
		}

		int v;
		int wt;

		@Override
		public int compareTo(Dijpair o) {
			return this.wt - o.wt;
		}
	}

	public void Dikjstra(int src) {
//		Elog(V)
		PriorityQueue<Dijpair> PQ = new PriorityQueue<>();
		PQ.add(new Dijpair(src, 0));
		HashSet<Integer> Visited = new HashSet<>();
		while (!PQ.isEmpty()) {
			Dijpair curr = PQ.poll();
			System.out.println(curr.v + " - " + curr.wt);
			Visited.add(curr.v);
			for (int nbr : HM.get(curr.v).keySet()) {
				if (!Visited.contains(nbr)) {
					Dijpair nn = new Dijpair(nbr, 0);
					nn.wt = curr.wt + getEdge(nbr, curr.v);
					PQ.add(nn);
				}
			}
		}

	}
}
