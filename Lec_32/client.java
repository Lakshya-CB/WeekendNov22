package Lec_32;

public class client {
	public static void main(String[] args) {

//		BT.print();
		int[] lvl= {10,20,30,40,50,-1,60,-1,-1,100,110,-1,-1,-1,200};
		BTree BT= new BTree(lvl, 0);
		BT.lvl2();
		BT.Mertivaaakt();
	}
}
