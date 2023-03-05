package Lec_21;

public class Client_4 {
	public static void main(String[] args) {

		System.out.println("==="+lll());
		Student s = new Student("Chottu", 12);
		try {
			s.setAge(13);
			System.out.println(s.getAge());
			s.setAge(-20);
			System.out.println(s.getAge());
			System.out.println("try END");
		} catch (Exception e) {
			System.out.println("milgaya exception!!");
//			e.printStackTrace();
//			System.out.println("asdasd");
			System.err.println("~~~~~~~" + e.getMessage());
			return;
		} finally {
			System.out.println("LOLO");
			int I = 10;
			System.out.println(I + 2);
		}
//		System.out.println("LOLO");
//		int I = 10;
//		System.out.println(I + 2);
	}

	public static int lll() {
		try {
			return 10;
		} finally {
			return 2;
		}
	}

}
