package Lec_33;

public class Client {
	public static void main(String[] args) {
		Graph G = new Graph(7);
		G.addEdge(1, 4, 2);
		G.addEdge(1, 2, 6);
		G.addEdge(2, 3, 5);
		G.addEdge(3, 4, 3);
		G.addEdge(5, 4, 1);
		G.addEdge(5, 6, 6);
		G.addEdge(5, 7, 4);
		G.addEdge(6, 7, 2);
//		System.out.println(G.HM);
//		System.out.println(G.hasPath(1, 7));
//		G.AllPath(1, 7);
//		G.BFS(1);
//		G.remove(4, 5);
//		G.BFT();
		G.Dikjstra(1);
	}
}
