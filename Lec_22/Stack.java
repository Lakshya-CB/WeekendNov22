package Lec_22;

public class Stack {
	int[] arr;
	int tos;

	public Stack() {
		this(5);
	}

	public Stack(int cap) {
		tos = -1;
		arr = new int[cap];
	}

	public int size() {
		return tos + 1;
	}
	public void add(int ali) {
		if(size()==arr.length) {
			throw new RuntimeException("full hun bhai");
		}
		tos++;
		arr[tos] = ali;
	}
	public boolean isEmpty() {
		return size()==0;
	}
	public int peek() {
		if(isEmpty()) {
			throw new RuntimeException("kya dheek rha hein?");
		}
		return arr[tos];
	}
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException("kya dheek rha hein?");
		}
		int ans = arr[tos];
		tos--;
		return ans;
	}
	public void disp() {
		for(int i=0;i<=tos;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
