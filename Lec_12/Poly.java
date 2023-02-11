package Lec_12;

public class Poly {

	public static void main(String[] args) {

	}

	public static int solve(int n, int x) {
		int ans =0;
		int exp = 1;
		for(int c = 1;c<= n;c++) {
//			int temp = (int) (c*Math.pow(x, c)); //nlogn
			int temp = (int) (c*exp); //n
			
			exp = exp *x;
			ans = ans + temp;
		}
		return ans;
	}
}
