package Heap_and_HashMap;

import java.util.ArrayList;

public class palindrome_partitioning {
	public static void main(String[] args) {
		String str="aab";
		
		ArrayList<ArrayList<String>>Al=new ArrayList<>();
		partitioning(str,Al);
		System.out.println(Al);
	}
	public static void partitioning(String str,ArrayList<ArrayList<String>>Al) {
		if(str.isEmpty()) {
			return;
		}
		Al.add(new ArrayList<>());
		for(int i=1;i<=str.length();i++) {
			String piece=str.substring(0,i);
			String rem=str.substring(i,str.length());
			if(check(piece)==true) {
				Al.get(Al.size()-1).add(piece);
			}
			partitioning(rem,Al);
			
		}
	}
	public static boolean check(String str) {
		int start=0;
		int end=str.length()-1;
		while(end>start) {
			if(str.charAt(end)!=str.charAt(start)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
