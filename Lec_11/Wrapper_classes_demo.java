package Lec_11;

public class Wrapper_classes_demo {
	public static void main(String[] args) {

		int i = 1;
		
		Integer I = 10;
		
		i = I;// unboxing!!
		System.out.println(i);
		I = i;// autoboxing!!
		
		System.out.println(i+I);
		
		System.out.println(I+100);
	}
}
