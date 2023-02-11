package Lec_14_Doubts;

public class Longest_Palin_SS3 {
	public static void main(String[] args) {
		allPalinSS2("nitootib");
		System.out.println(ans);

	}
	static String ans = "";
	public static void allPalinSS2(String str) {
		for (int i = 0; i < str.length(); i++) {
			panini(str, i, i); // odd , i+2 char
			panini(str, i, i + 1);// even

		}
	}

	public static void panini(String str, int L, int R) {
		
		while (L >= 0 && R < str.length()) {
			if (str.charAt(L) == str.charAt(R)) {
				String temp = str.substring(L, R + 1);
				if(ans.length()<temp.length()) {
					ans = temp;
				}
				L--;
				R++;
			} else {
				return ;
			}
		}
		return ;
	}

}
