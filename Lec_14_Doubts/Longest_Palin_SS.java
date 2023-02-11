package Lec_14_Doubts;

public class Longest_Palin_SS {
	public static void main(String[] args) {
		allPalinSS2("nitootib");
		
	}
	public static void allPalinSS2(String str) {
		String ans = "";
		for (int i = 0; i < str.length(); i++) {
			String str1 =panini(str, i, i); // odd , i+2 char
			String str2 =panini(str, i, i + 1);// even
			if(ans.length()<str1.length()){
				ans = str1;
			}
			if(ans.length()<str2.length()){
				ans = str2;
			}
		}
		System.out.println(ans);
	}

	public static String panini(String str, int L, int R) {
		String ans = "";
		while (L >= 0 && R < str.length()) {
			if (str.charAt(L) == str.charAt(R)) {
				ans = str.substring(L, R + 1);
				L--;
				R++;
			} else {
				return ans;
			}
		}
		return ans;
	}

}
