package Lec_08;

public class Soooorting {
	public static void main(String[] args) {
		int[] arr = { 50, 40, 30, 20, 10 };
		print(arr);
//		System.out.println("============");
////		bubble(arr);
//		Selection(arr);
		Insertion(arr);
		print(arr);

	}

	public static void print(int[] arr) {
		for (int ali : arr) {
			System.out.print(ali + " ");
		}
		System.out.println();
	}

	public static void bubble(int[] arr) {
		for (int count = 1; count < arr.length; count++) {
			for (int i = 0; i <= arr.length - 2; i++) {
//			i and i+1
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			print(arr);
		}
	}

	public static void Selection(int[] arr) {

		for (int last = arr.length - 1; last >= 1; last--) {

			int max = 0;
			for (int i = 0; i <= last; i++) {
				if (arr[i] > arr[max]) {
					max = i;
				}
			}
//		max and last ko chwaap!"
			int temp = arr[last];
			arr[last] = arr[max];
			arr[max] = temp;
			print(arr);
		}
	}

	public static void Insertion(int[] arr) {
		for (int idx_ins = 1; idx_ins < arr.length; idx_ins++) {

			int idx = idx_ins - 1;
			int ali = arr[idx_ins];
			while (idx>=0 && arr[idx] > ali) {
				arr[idx + 1] = arr[idx];
				idx--;
			}
			arr[idx + 1] = ali;

			print(arr);
			System.out.println("=====++==++");
		}

	}

}
