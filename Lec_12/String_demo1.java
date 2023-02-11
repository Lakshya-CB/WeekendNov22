package Lec_12;

public class String_demo1 {
	public static void main(String[] args) {

		String str1 = "allo";

		String str2 = new String("allo");

		System.out.println(str1 == str2);
		System.out.println("~~~"+str1.equals(str2));

		String str3 = "allo";
		System.out.println(str1 == str3);
		System.out.println("~~~"+str1.equals(str3));
	}
}
