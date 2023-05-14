package Lec_DP;

import java.util.HashMap;

public class Distinct_ss {
	public static void main(String[] args) {
		String str = "abc";
		System.out.println(solve(str, new HashMap<>()));
	}

	public static int solve(String str,HashMap<String , Integer> HM) {
		if (str.isEmpty()) {
			return 1;
		}
		if(HM.get(str)!=null) {
			return HM.get(str);
		}
		char ch = str.charAt(0);
		int sp1 = solve(str.substring(1),HM);
		int found = str.indexOf(ch, 1);
		if (found == -1) {
			HM.put(str, (2*sp1)%1000000007);
			return (2 * sp1)%1000000007;
		}
		int ex = solve(str.substring(found + 1),HM);

		HM.put(str, (2 * sp1 - ex)%1000000007);
		return (2 * sp1 - ex)%1000000007;

	}
	public int distinctSubseqII(String s) {
        long ans = solve(s,new HashMap<>())%1000000007;
				ans = ans-1;
				if(ans<0){
					ans = ans+1000000007;
				}
        return (int)ans;
    }
    public static long solve(String str,HashMap<String , Long> HM) {
		if (str.isEmpty()) {
			return 1;
		}
		if(HM.get(str)!=null) {
			return HM.get(str);
		}
		char ch = str.charAt(0);
		long sp1 = solve(str.substring(1),HM);
		int found = str.indexOf(ch,1);
		if (found == -1) {
			HM.put(str, sp1%1000000007+sp1%1000000007);
			return sp1%1000000007+sp1%1000000007;
		}
		long ex = solve(str.substring(found + 1),HM);
		HM.put(str, (sp1%1000000007+sp1%1000000007 - ex)%1000000007);
		return (sp1%1000000007+sp1%1000000007 - ex)%1000000007;
	}
}
