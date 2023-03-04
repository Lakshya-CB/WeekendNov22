package Heap_and_HashMap;

public class Soduku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//		simple(arr);
//		wave(arr);
		display(arr);
		System.out.println("============");
		transpose(arr);
		display(arr);
	}
	static void simple(int arr[][]) {
		for(int col=0;col<arr[0].length;col++) {
			for(int row=0;row<arr.length;row++) {
				System.out.print(arr[row][col]+"  ");
			}
			System.out.println();
		}
	}
	static void wave(int arr[][]) {
		for(int col=0;col<arr[0].length;col++) {
			if(col%2==0) {
				for(int row=0;row<arr.length;row++) {
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();
			}
			else {
				for(int row=arr.length-1;row>=0;row--) {
					System.out.print(arr[row][col]+" ");
				}
				System.out.println();
			}
		}
	}
	static void transpose(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
	}
	static void display(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
