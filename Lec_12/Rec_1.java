package Lec_12;

public class Rec_1 {
	public static void main(String[] args) {
		PD(4);
	}
	public static void PD(int n) {
		if(n==0) {
			return;
		}
//		BP : PD(4)
//		SP : PD(3)
		System.out.println(n);
		PD(n-1);
	}
}
