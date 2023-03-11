package Lec_22;

public class Client {
	public static void main(String[] args) {
		Stack S = new Stack();
		S.add(10);
		S.add(20);
		S.add(30);
		S.disp();
		System.out.println(S.pop());
		S.disp();
		S.add(40);
		S.add(50);
		S.disp();
		System.out.println(S.pop());
		S.disp();

	}
}
