package Lec_07;

public class Sub_Array {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };

		for (int s = 0; s < arr.length; s++) {
			for (int e = s; e < arr.length; e++) {
//				System.out.println(s + " " + e);
				for(int i=s;i<=e;i++) {
					System.out.print(arr[i]+ " ");
				}
				System.out.println();
			}
		}
	}
}
