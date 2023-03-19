package Lec_25;

import java.util.Arrays;

public class Perm_letters {
	static boolean stop = false;

	public static void main(String[] args) {
		String str = "dbca";

		int[] batua = new int[26];
		for (int i = 0; i < str.length(); i++) {
			batua[str.charAt(i) - 'a']++;
		}
		System.out.println(Arrays.toString(batua));
		prem(batua, "", str);
	}

	public static void prem(int[] batua, String path, String org) {
		
		boolean ans = false;
		for (int i = 0; i < 26; i++) {
			if (batua[i] > 0) {
				ans = true;
				batua[i]--;
				char ch = (char) ('a' + i);
				prem(batua, path + ch, org);
				if(stop) {
					return;
				}
				batua[i]++;
			}
		}
		if (ans == false) {
			if(path.equals(org)) {
				stop = true;
				return;
			}
			System.out.println(path);
			
		}
	}
}
