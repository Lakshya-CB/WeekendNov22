package Lec_04_Patterns_2;

import java.util.Scanner;

public class Lower_Upper {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		
		System.out.println(ch);
		
		if(ch>='a' && ch<='z') {
			System.out.println("Lower");
		}else if(ch>='A' && ch<='Z') {
			System.out.println("Upper");	
		}else {
			System.out.println("inbhalid");
		}
		
	}
}
