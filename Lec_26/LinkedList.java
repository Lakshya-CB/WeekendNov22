package Lec_26;

public class LinkedList {
	class Node {
		public Node(int ali) {
			data = ali;
		}
		int data;
		Node next;
	}
	
	Node head;
	
	public void disp() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+ "=>");
			temp = temp.next;
		}
		System.out.println();
	}
	public int size() {
		int size =0;
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	public int getFirst() {
		if(isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		return head.data;
	}
	public boolean isEmpty() {
		return head ==null;
	}
	public int getLast() {
		if(isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		Node temp = head;
		while(temp.next!=null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
		return temp.data;
	}
	public int getAt(int idx) {
		if(idx<0|| idx>=size()) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		Node temp = head;
		for(int i=1;i<= idx;i++) {
			temp = temp.next;
		}
		return temp.data;
		
	}
	private Node getNodeAt(int idx) {
		if(idx<0|| idx>=size()) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		Node temp = head;
		for(int i=1;i<= idx;i++) {
			temp = temp.next;
		}
		return temp;
	}
	public void addLast(int ali) {
		if(isEmpty()) {
			addFirst(ali);
			return;
		}
		Node last= getNodeAt(size()-1);
		last.next = new Node(ali);
	}
	public void add(int ali) {
		addLast(ali);
	}
	public void addFirst(int ali) {
		Node nn = new Node(ali);
		nn.next = head;
		head = nn;
	}
	public void addAt(int ali, int idx) {
		if(idx<0|| idx>=size()+1) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		if(idx==0) {
			addFirst(ali);
			return;
		}
		if(idx==size()) {
			addLast(ali);
			return;
		}
		Node prev = getNodeAt(idx-1);
		Node after = prev.next;
		Node nn = new Node(ali);
		prev.next = nn;
		nn.next = after;
	}
	public int removeFirst() {
		if(isEmpty()) {
			throw new RuntimeException("kya remove karu ??");
		}
		int ans = head.data;
		head = head.next;
		return ans;
	}
	public int removeLast() {
		if(isEmpty()) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		if(size()==1) {
			return removeFirst();
		}
		Node secondLast = getNodeAt(size()-2);
		Node last = secondLast.next;
		secondLast.next = null;
		return last.data;
	}
	public int removeAt(int idx) {
		if(idx==0) {
			return removeFirst();
		}
		if(idx==size()-1) {
			return removeLast();
		}
		if(idx<0||idx>=size()) {
			throw new RuntimeException("kya deekh rha hein ?");
		}
		Node prev = getNodeAt(idx-1);
		Node curr = prev.next;
		Node after = curr.next;
		
		prev.next = after;
		return curr.data;
	}
	public void Rev() {
		Node curr = head;
		Node prev = null;
		while(curr!=null) {
			Node after = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = after;
		}
		head = prev;
	}
	public int Mid() {
		Node slow = head;
		Node fast = head;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
}
