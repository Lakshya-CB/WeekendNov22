package Lec_16;

public class Palind_Partition {
	public static void main(String[] args) {
		suvle("abcd", "");
	}

	public static void suvle(String table, String bag) {
		if (table.isEmpty()) {
			System.out.println(bag);
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
//			if (isTasty(piece)) {
				String remain = table.substring(chakku);
//			System.out.println(piece + "-" + remain);
				suvle(remain, bag + "~~" + piece);
//			}
		}
	}

	public static boolean isTasty(String piece) {
		int s =0;
		int e = piece.length()-1;
		while(s<e) {
			if(piece.charAt(s) != piece.charAt(e)) {
				return false;
			}
			s++;e--;
		}
		
		return true;
	}
}
