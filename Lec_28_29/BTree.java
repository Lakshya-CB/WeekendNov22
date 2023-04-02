package Lec_28_29;

import java.util.LinkedList;
import java.util.Queue;

public class BTree {
	class Node {
		public Node(int i) {
			// TODO Auto-generated constructor stub
			data = i;
		}

		int data;
		Node left;
		Node right;
	}

	Node root;

	public void print() {
		print(root);
	}

	private void print(Node nn) {
		if (nn == null) {
			return;
		}
		String str = "";
		if (nn.left != null) {
			str = nn.left.data + "";
		}
		str = str + " => " + nn.data + " <= ";
		if (nn.right != null) {
			str = str + nn.right.data;
		}
		System.out.println(str); // S
		print(nn.left); // L
		print(nn.right); // R

	}

	int pre_idx = 0;

	public BTree(int[] pre) {
		pre_idx = 0;
		root = createPre(pre);
	}

	private Node createPre(int[] pre) {
		if (pre_idx >= pre.length || pre[pre_idx] == -1) {
			pre_idx++;
			return null;
		}
		Node nn = new Node(pre[pre_idx]);
		pre_idx++;
		nn.left = createPre(pre);
		nn.right = createPre(pre);

		return nn;
	}

	public BTree(int[] pre, int[] in) {
		root = createPreIn(pre, 0, pre.length - 1, in, 0, pre.length - 1);
	}

	private Node createPreIn(int[] pre, int ps, int pe, int[] in, int is, int ie) {
		if (ps > pe) {
			return null;
		}
		Node nn = new Node(pre[ps]);
		int found = -1;
		int L_size = 0;
		for (int i = is; i <= ie; i++) {
			if (in[i] == pre[ps]) {
				found = i;
				break;
			}
			L_size++;
		}

		nn.left = createPreIn(pre, ps + 1, ps + L_size, in, is, found - 1);
		nn.right = createPreIn(pre, ps + L_size + 1, pe, in, found + 1, ie);
		return nn;
	}

	public int size() {
		return size(root);
	}

	private int size(Node nn) {
		if (nn == null) {
			return 0;
		}
		return size(nn.left) + size(nn.right) + 1;
	}

	public int Ht() {
		return Ht(root);
	}

	int max_Dia = Integer.MIN_VALUE;

	private int Ht(Node nn) {
		if (nn == null) {
			return -1;
		}
		int L = Ht(nn.left);
		int R = Ht(nn.right);
		int slef = L + R;
		max_Dia = Math.max(max_Dia, slef);
		return Math.max(L, R) + 1;

	}

	public int Dia() {
		return Dia(root);

	}

	private int Dia(Node nn) {
		if (nn == null) {
			return 0;
		}
		int L = Dia(nn.left);
		int R = Dia(nn.right);

		int self = Ht(nn.left) + Ht(nn.right) + 2;

		return Math.max(self, Math.max(L, R));
	}

	class DiaPair {
		int Dia = 0;
		int Ht = -1;
	}

	private DiaPair Dia2(Node nn) {
		if (nn == null) {
			return new DiaPair();
		}
		DiaPair L = Dia2(nn.left);
		DiaPair R = Dia2(nn.right);

		int self_Dia = L.Ht + R.Ht + 2;
		int self_Ht = Math.max(L.Ht, R.Ht) + 1;
		DiaPair slef = new DiaPair();
		slef.Ht = self_Ht;
		slef.Dia = Math.max(self_Dia, Math.max(L.Dia, R.Dia));

		return slef;
	}

	public void lvl() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node nn = Q.poll();
			System.out.println(nn.data);
			if (nn.left != null) {
				Q.add(nn.left);
			}
			if (nn.right != null) {
				Q.add(nn.right);
			}
		}
	}

	public void lvl2() {
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		int curr_len = Q.size();
		while (!Q.isEmpty()) {
			for (int count = 1; count <= curr_len; count++) {
				Node nn = Q.poll();
				System.out.print(nn.data + " ");
				if (nn.left != null) {
					Q.add(nn.left);
				}
				if (nn.right != null) {
					Q.add(nn.right);
				}

			}
			curr_len = Q.size();
			System.out.println("aaaaaaaaaag");
		}
	}

	public BTree(int[] lvl, int i) {
		int idx = 0;
		root = new Node(lvl[idx]);
		idx++;
		Queue<Node> Q = new LinkedList<>();
		Q.add(root);
		while (!Q.isEmpty()) {
			Node nn = Q.poll();
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.left = new Node(lvl[idx]);
				Q.add(nn.left);
			}
			idx++;
			if (idx < lvl.length && lvl[idx] != -1) {
				nn.right = new Node(lvl[idx]);
				Q.add(nn.right);
			}
			idx++;
		}
	}

	public boolean isBal() {
		return isBal(root);
	}

	class isBalPair {
		boolean isBal = true;
		int Ht = -1;
	}

	private boolean isBal(Node nn) {
		if (nn == null) {
			return true;
		}
		boolean slef = Math.abs(Ht(nn.left) - Ht(nn.right)) <= 1;
		boolean L = isBal(nn.left);
		boolean R = isBal(nn.right);

		return slef && L && R;
	}

	private isBalPair isBal2(Node nn) {
		if (nn == null) {
			return new isBalPair();
		}
		isBalPair L = isBal2(nn.left);
		isBalPair R = isBal2(nn.right);

		boolean slef = Math.abs(L.Ht - R.Ht) <= 1;
		int Ht = Math.max(L.Ht, R.Ht) + 1;
		isBalPair ans = new isBalPair();
		ans.Ht = Ht;
		ans.isBal = slef && L.isBal && R.isBal;
		return ans;
	}

	public boolean isBST() {
		return isBST(root).isBST;
	}

	class isBSTPair {
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		boolean isBST = true;
	}

	private isBSTPair isBST(Node nn) {
		if (nn == null) {
			return new isBSTPair();
		}

//		boolean self = max(nn.left) < nn.data && nn.data <min(nn.right);
		isBSTPair L = isBST(nn.left);
		isBSTPair R = isBST(nn.right);
		isBSTPair ans = new isBSTPair();

		ans.max = Math.max(nn.data, Math.max(L.max, R.max));
		ans.min = Math.min(nn.data, Math.min(L.min, R.min));

		boolean self = L.max < nn.data && nn.data < R.min;
		ans.isBST = L.isBST && R.isBST && self;

		return ans;
	}

	public void delBST(int ali) {
		root = delBST(root, ali);
	}

	private Node delBST(Node nn, int ali) {

		if (nn.data > ali) {
			nn.left = delBST(nn.left, ali);
		} else if (nn.data < ali) {
			nn.right = delBST(nn.right, ali);
		}else{
//			c1, ali is leaf!!
			if(nn.left==null && nn.right==null) {
				return null;
			}
			if(nn.left==null && nn.right!=null) {
				return nn.right;
			}
			if(nn.left!=null && nn.right==null) {
				return nn.left;
			}
		}
		return null;
	}

}
