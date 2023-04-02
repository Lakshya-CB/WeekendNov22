package Lec_28_29;

public class client {
	public static void main(String[] args) {
//	int[] pre = {10,20,40,-1,-1,50,-1,-1,30,-1,60};
//	BTree BT  = new BTree(pre);
		int[] in = { 40, 20, 50, 10, 30, 60 };
		int[] pre = { 10, 20, 40, 50, 30, 60 };
		BTree BT = new BTree(pre, in);

//		BT.print();
		int[] lvl= {10,20,30,40,50,-1,60,-1,-1,100,110,-1,-1,-1,200};
		BT= new BTree(lvl, 0);
		BT.lvl2();
	}
}
