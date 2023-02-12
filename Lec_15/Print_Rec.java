package Lec_15;

public class Print_Rec {
	public static void main(String[] args) {
//		CoinToss(3, "");
//		subSeq("abc", "");
		LKC("234", "");
	}

	public static void CoinToss(int n, String str) {
		if (n == 0) {
			System.out.println(str);
			return;
		}
//		BP : N
//		SP : N-1, +H , +T
		CoinToss(n - 1, str + "H");
		CoinToss(n - 1, str + "T");
	}

	public static void subSeq(String str, String team) {
		if (str.isEmpty()) {
			System.out.println(team + "^");
			return;
		}
		char ch = str.charAt(0);
		String remain = str.substring(1);

		subSeq(remain, team + ch); // Include
		subSeq(remain, team); // Exclude

	}

	static String[] all_options = { "", "", "abc", "def", 
			"ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

	public static void LKC(String digits, String path) {
		if(digits.isEmpty()) {
			System.out.println(path);
			return;
		}
//		digits = "2345"
		char ch = digits.charAt(0); // ch ='2'
		String remain = digits.substring(1); // remain = "345"
		String options = all_options[ch-'0']; // "abc"
		for(int i=0;i<options.length();i++) {
			char toAdd = options.charAt(i);
			LKC(remain, path+toAdd);
		}
	}
}
