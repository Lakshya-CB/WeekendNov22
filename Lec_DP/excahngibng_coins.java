package Lec_DP;

import java.util.HashMap;
import java.util.Scanner;

public class excahngibng_coins {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println(profit(scn.nextInt(),new HashMap<Integer,Integer>()));
	}

	public static int profit(int n,HashMap<Integer,Integer> HM) {
		if(n==0) {
			return 0;
		}
		if(HM.containsKey(n)) {
			return HM.get(n);
		}
		int sp1 = n;// beech liya !!
		int sp2 = profit(n/2,HM)+profit(n/3,HM)+profit(n/4,HM);
		HM.put(n, Math.max(sp1, sp2));
		return Math.max(sp1, sp2);
	}
}
