package Lec_19_20;

import java.util.ArrayList;
import java.util.List;

public class Palind_Partition {
	public static void main(String[] args) {
		List<String> AL = new ArrayList<>();
		List<List<String>> Biggy = new ArrayList<>();

		suvle2("abc", "", AL, Biggy);
		System.out.println(Biggy);

	}

	public static void suvle(String table, String bag, List<String> AL) {
		if (table.isEmpty()) {
			System.out.println(bag + "--" + AL);
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
//			if (isTasty(piece)) {
			String remain = table.substring(chakku);
//			System.out.println(piece + "-" + remain);
			List<String> copy = new ArrayList<>(AL);
			copy.add(piece);
			suvle(remain, bag + "~~" + piece, copy);
//			}
		}
	}

	public static void suvle2(String table, String bag, List<String> AL, List<List<String>> Biggy) {
		if (table.isEmpty()) {
//			System.out.println(bag + "--" + AL);
			Biggy.add(new ArrayList<>(AL));
		}
		for (int chakku = 1; chakku <= table.length(); chakku++) {
			String piece = table.substring(0, chakku);
//			if (isTasty(piece)) {
			String remain = table.substring(chakku);
			AL.add(piece);
			suvle2(remain, bag + "~~" + piece, AL,Biggy);
			AL.remove(AL.size() - 1);
		}
	}

	public static boolean isTasty(String piece) {
		int s = 0;
		int e = piece.length() - 1;
		while (s < e) {
			if (piece.charAt(s) != piece.charAt(e)) {
				return false;
			}
			s++;
			e--;
		}

		return true;
	}
}
