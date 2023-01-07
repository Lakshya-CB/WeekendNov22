package Lec_07;

public class Bar_graph {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 5, 6, 1 };
		disp(arr);
	}
	public static void disp(int[] arr) {
		int jeb = arr[0];
		for(int ali : arr) {
			if(jeb<ali) {
				jeb =ali;
			}
		}
		for(int ht = jeb; ht>0;ht--) {
			for(int ali : arr) {
				if(ali >=ht) {
					System.out.print("|");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}
