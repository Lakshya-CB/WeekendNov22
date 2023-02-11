package Lec_12;

public class StringBuilder_demo {
	public static void main(String[] args) {
//		String str = "aajaad";
		String str = new String("aajaad");
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb);
		
		System.out.println("===========");
		System.out.println(str.length());
		System.out.println(sb.length());

		System.out.println("===========");
		System.out.println(str.charAt(3));
		System.out.println(sb.charAt(3));

		System.out.println("===========");
		sb.setCharAt(0, '~');
		System.out.println(sb);
		
		System.out.println("===========");
		sb.deleteCharAt(4);// O(n)
		System.out.println(sb);
		
		String ans = sb.toString();
		System.out.println(ans);
		
		System.out.println("===========");
		sb.append("asdsazxcv");
		System.out.println(sb);
		
		sb.insert(1, "zaadu");
		System.out.println(sb);
		
		
	}
}
