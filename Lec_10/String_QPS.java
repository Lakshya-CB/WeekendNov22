package Lec_10;

import java.util.Scanner;

public class String_QPS {
	public static void main(String[] args) {
//		Scanner scn = new Scanner(System.in);
////		String str = scn.nextLine(); // sentence
//		String str = scn.next(); // word
//
//		int i = scn.nextInt();
////		
//		System.out.println(str + " " + i);
//		System.out.println(str);
//		allPalinSS2(str);
		String str ="the sky is blue";
		Reverse_Words(str);
	}

	public static boolean isPalin(String str) {
		int l = 0;
		int r = str.length() - 1;
		while (l < r) {
			if (str.charAt(l) == str.charAt(r)) {
				l++;
				r--;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void allPalinSS(String str) {
		for (int s = 0; s < str.length(); s++) {
			for (int e = s + 1; e <= str.length(); e++) {
				String piece = str.substring(s, e);
				if (isPalin(piece)) {
					System.out.println(piece);
				}
			}
		}
	}

	public static void allPalinSS2(String str) {
		for (int i = 0; i < str.length(); i++) {
			panini(str, i, i); // odd , i+2 char
			panini(str, i, i + 1);// even
		}
	}

	public static void panini(String str, int L, int R) {
		while (L >= 0 && R < str.length()) {
			if (str.charAt(L) == str.charAt(R)) {
				System.out.println(str.substring(L, R + 1));
				L--;
				R++;
			} else {
				return;
			}
		}
	}

	public static void Reverse_Words(String str) {
		while (true) {
			int f = str.lastIndexOf(" ");
			String word = str.substring(f + 1);
			System.out.println(word);
			if(f ==-1) {
				return;
			}
			str = str.substring(0, f);
		}

	}


}
