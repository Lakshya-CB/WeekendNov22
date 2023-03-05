package Lec_21;

public class Student {
	private String Name = "babbu";// Data parsing
	private int age = 100;// Data parsing

	public void Intro() {
//		System.out.println(this);
		System.out.println(this.Name + " age hein meri " + this.age);
	}

	public void discoo(String Name) {
		System.out.println(this.Name + " party with " + Name);
	}

	Student() {

	}

	Student(String Name, int age) {
		this.Name = Name;
		this.age = age;
	}

	public String getName() {
		return Name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception {

		if(age <0) {
//			throw new RuntimeException("chup rah be! ya mat kar");// unchecked
			throw new Exception("chup reh mat kar");
		}
		this.age = age;
	}
}
