package Lec_30;

import java.util.Stack;

public class LinkedList<PUI> {
	class Node {
		public Node(PUI ali) {
			data = ali;
		}

		PUI data;
		Node next;
	}

	Node head;

	public void disp() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println();
	}

	public int size() {
		int size = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			size++;
		}
		return size;
	}

	public PUI getFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		return head.data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public PUI getLast() {
		if (isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		Node temp = head;
		while (temp.next != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		return temp.data;
	}

	public PUI getAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;

	}

	private Node getNodeAt(int idx) {
		if (idx < 0 || idx >= size()) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		Node temp = head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	public void addLast(PUI ali) {
		if (isEmpty()) {
			addFirst(ali);
			return;
		}
		Node last = getNodeAt(size() - 1);
		last.next = new Node(ali);
	}

	public void add(PUI ali) {
		addLast(ali);
	}

	public void addFirst(PUI ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}

	public void addAt(PUI ali, int idx) {
		if (idx < 0 || idx >= size() + 1) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		if (idx == 0) {
			addFirst(ali);
			return;
		}
		if (idx == size()) {
			addLast(ali);
			return;
		}
		Node prev = getNodeAt(idx - 1);
		Node after = prev.next;
		Node nn = new Node(ali);
		prev.next = nn;
		nn.next = after;
	}

	public PUI removeFirst() {
		if (isEmpty()) {
			throw new RuntimeException("kya remove karu ??");
		}
		PUI ans = head.data;
		head = head.next;
		return ans;
	}
}
