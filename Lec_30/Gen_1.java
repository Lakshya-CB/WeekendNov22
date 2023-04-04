package Lec_30;

import java.util.Comparator;

import Lec_21.Student;

public class Gen_1 {
	public static void main(String[] args) {
		Student[] arr = new Student[5];

//		System.out.println(arr[0]);
		arr[0] = new Student("ZA", 10);
		arr[1] = new Student("B", 13);
		arr[2] = new Student("AC", 1);
		arr[3] = new Student("D", 120);
		arr[4] = new Student("1E", 5);

		print(arr);
		sort(arr,new compName());
		print(arr);

	}

	static class compName implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.Name.compareTo(o2.Name);
		}

	}

//	public static void print(Object[] arr) {
//		for(Object s : arr) {
//			System.out.print("{"+s+"}");
//		}
//		System.out.println();
//	}
	public static <UI> void print(UI[] arr) {
		for (UI ali : arr) {

			System.out.print("{" + ali + "}");
		}
		System.out.println();
	}

	public static <OO extends Comparable<OO>> void sort(OO[] arr) {
		for (int cnt = 1; cnt <= arr.length - 1; cnt++) {
			for (int i = 0; i <= arr.length - 2; i++) {
//				if (arr[i].age > arr[i + 1].age) {
				if (arr[i].compareTo(arr[i + 1]) > 0) {
					OO temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	public static <EE> void sort(EE[] arr, Comparator<EE> obj) {
		for (int cnt = 1; cnt <= arr.length - 1; cnt++) {
			for (int i = 0; i <= arr.length - 2; i++) {
//				if (arr[i].age > arr[i + 1].age) {
//				if (arr[i].compareTo(arr[i + 1])>0) {
				if (obj.compare(arr[i], arr[i + 1]) > 0) {
					EE temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
