package Lec_21;

public class Client {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1);
		System.out.println(s1.age);
		System.out.println(s1.Name);
		
		Student s2 = s1;
		
		s2.Name = "aaa";
		System.out.println(s1.Name);
	}
}
