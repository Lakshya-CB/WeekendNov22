package Lec_02;

public class prime_02 {
	public static void main(String[] args) {
	
		int num = 6;
		int div = 1;
		int fac = 0;
		while (div <= num) {
			int rem = num % div;
			if (rem == 0) {
				fac = fac + 1;
				div = div + 1;
			}
			System.out.println(div + " - " + rem);
		}
		System.out.println(fac);
		if(fac==2) {
			System.out.println("Prime");
		}else {
			System.out.println("Not prime");
		}
	}
}
