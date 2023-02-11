package Lec_14_Doubts;

import java.util.ArrayList;
import java.util.Scanner;

public class Next_permutation {
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int t = scn.nextInt();
			while (t > 0) {
				t--;
				int num = scn.nextInt();
				ArrayList<Integer> AL = new ArrayList<>();
				while (num > 0) {
					num--;
					AL.add(scn.nextInt());
				}
				System.out.println(AL);
	
				int org = AL.size() - 2;
				while (org >= 0 && AL.get(org) >= AL.get(org + 1)) {
					org--;
				}
				////////////////////////
				if (org != -1) {
					int to_swap = AL.size() - 1;
					while (AL.get(to_swap) <= AL.get(org)) {
						to_swap--;
					}
	//		/////////////////
					System.out.println(org + " - " + to_swap);
					int temp = AL.get(org);
					AL.set(org, AL.get(to_swap));
					AL.set(to_swap, temp);
				}
	//		/////////////////
				System.out.println(AL);
				Rev(AL, org + 1, AL.size() - 1);
	
//				System.out.println(AL);
				for(int digit : AL) {
					System.out.print(digit + " ");
				}
				System.out.println();
	//		/////////////
			}
	
		}
	
		public static void Rev(ArrayList<Integer> AL, int s, int e) {
			while (s < e) {
				int temp = AL.get(s);
				AL.set(s, AL.get(e));
				AL.set(e, temp);
				s++;
				e--;
			}
		}
}
