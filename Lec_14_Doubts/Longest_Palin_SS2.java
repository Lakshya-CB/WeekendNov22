package Lec_14_Doubts;

public class Longest_Palin_SS2 {
	public static void main(String[] args) {
		String input ="nitootib"; 
		allPalinSS2(input);
		System.out.println(input.substring(s,e+1));

	}
	static int len = 0;
	static int s = 0;
	static int e = 0;
	
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
				if(len<temp.length()) {
					len = temp.length();
					Longest_Palin_SS2.s = L;
					Longest_Palin_SS2.e = R;
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
