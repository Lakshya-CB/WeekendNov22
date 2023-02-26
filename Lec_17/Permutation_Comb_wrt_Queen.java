package Lec_17;

public class Permutation_Comb_wrt_Queen {
	public static void main(String[] args) {
		boolean[] placed = new boolean[4];
//		perm(2, "", 4, placed);
		comb(2, -1,"", 4);
	}

	public static void perm(int n, String ans, int total_seats, boolean[] placed) {

		if (n == 0) {
			System.out.println(ans);
			return;
		}
		for (int seat = 0; seat < total_seats; seat++) {
//			seat!!
			if (placed[seat] == false) {
				placed[seat] = true;
				perm(n - 1, ans + "Q" + seat, total_seats, placed);
				placed[seat] = false;
			}
		}
	}
	public static void comb(int n,int last, String ans, int total_seats) {

		if (n == 0) {
			System.out.println(ans);
			return;
		}
		for (int seat = last+1; seat < total_seats; seat++) {
//			seat!!
				comb(n - 1,seat, ans + "Q" + seat, total_seats);
		}
	}
	

}
