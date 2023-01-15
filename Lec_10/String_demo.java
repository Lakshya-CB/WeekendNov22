package Lec_10;

public class String_demo {
	public static void main(String[] args) {
		String str = "kya ?! hua bhai";
		System.out.println(str.length());
		
		char ch = str.charAt(3);
		System.out.println("-"+ch);
		
		int i = str.indexOf("a");
		System.out.println(i);
		
		int i2 = str.lastIndexOf("a");
		System.out.println(i2);
		
		System.out.println(str.startsWith("kya"));
		System.out.println(str.endsWith("bhai2"));
		
		str = "abcd";
		for(int s=0;s<str.length();s++) {
			for(int e = s+1;e<=str.length();e++) {
				System.out.println(str.substring(s,e));
			}
		}
	}
}
