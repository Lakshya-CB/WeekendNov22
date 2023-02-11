package Lec_12;

public class SOE {
	public static void main(String[] args) {
		int num = 250019;
		allPrimes(num);

	}

	public static void allPrimes(int num) {
		boolean[] isComp = new boolean[num + 1];
		for (int div = 2; div * div <= num; div++) {
			if (isComp[div] == true) {
				continue;
			}
			for (int table = div * div; table <= num; table = table + div) {
				isComp[table] = true;
			}
		}
		for(int i = 2;i<=num;i++) {
			if(isComp[i]== false) {
				System.out.println(i);
			}
		}

	}
}
