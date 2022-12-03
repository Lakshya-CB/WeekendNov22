package Lec_01;

import java.util.Scanner;

public class Odd_even_04 {
	public static void main(String[] args) {
		Scanner juuta = new Scanner(System.in);
		int num = juuta.nextInt();
//		int rem = num /2; // Quotient
//		int rem = num % 2; // Remainder

		if (0 == num%2) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
}
