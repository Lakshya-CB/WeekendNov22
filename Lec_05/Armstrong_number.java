package Lec_05;

public class Armstrong_number {
	public static void main(String[] args) {
		int n = 10000;
		printTill(n);

	}

	public static void printTill(int num) {
		for (int n = 1; n <= num; n++) {
//			System.out.println("aaaaaa");
			if (isArmstrong(n)) {
				System.out.println(n);
			}
		}
	}

	public static boolean isArmstrong(int n) {
		int nod = numOfDigits(n);
		int ans =0;
		int baackup = n;
		while (n > 0) {
			int digit = n % 10;
			ans =  ans +(int)Math.pow(digit, nod);
			n = n / 10;
		}
		if(baackup==ans) {
			return true;
		}else {
			return false;
		}

	}

	public static int numOfDigits(int n) {
		int ans = 0;
		while (n > 0) {
			n = n / 10;
			ans++;
		}
		return ans;
	}

}
