package Lec_04_Patterns_2;

public class Data_types_demo {
	public static void main(String[] args) {
		byte b = (byte)(3013122);
		// explicit type cast!!
		
		
		System.out.println(b);
		
		short s = -32000;
		System.out.println(s);
		
		int i = 2147483647;
		System.out.println(i);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		long l = 1_000_000_000_000l;
		System.out.println(l);
		
		float f = 2.4f;
		System.out.println(f);
		
		double d = 2.5;
		System.out.println(d);
		
		
		char ch = 'a';
		System.out.println((int)(ch));
		System.out.println((int)('z'));
		
		System.out.println((char)75);
		
		System.out.println((char)('a'+'g'));
		
		
	}
}
