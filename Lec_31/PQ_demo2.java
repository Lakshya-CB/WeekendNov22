package Lec_31;


public class PQ_demo2 {
	public static void main(String[] args) {
		Heap PQ = new Heap();
		PQ.add(10);
		PQ.add(100);
		PQ.add(2);
		PQ.add(50);
		PQ.add(9);
		System.out.println(PQ);
		System.out.println(PQ.poll());
		System.out.println(PQ);
		System.out.println(PQ.poll());
		
	}
}
