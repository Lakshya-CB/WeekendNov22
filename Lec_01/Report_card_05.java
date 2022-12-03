package Lec_01;

import java.util.*;

public class Report_card_05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int marks = scn.nextInt();
		if (70 <= marks && marks < 80) {
			System.out.println("C");
		} else if (60 <= marks && marks < 70) {
			System.out.println("D");
		} else if (90 <= marks && marks <= 100) {
			System.out.println("A");
		} else if (80 <= marks && marks < 90) {
			System.out.println("B");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("E");
		} else {
			System.out.println("Fail");
		}
	}
}
