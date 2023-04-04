package Lec_30;

public class Student implements Comparable<Student>{
	public String Name = "babbu";// Data parsing
	public  int age = 100;// Data parsing
	static int tots_Student = 20;
	public void Intro() {
//		System.out.println(this);
		System.out.println(this.Name + " age hein meri " + this.age);
	}

	public void discoo(String Name) {
		System.out.println(this.Name + " party with " + Name);
	}

	Student() {
		tots_Student++;
	}
	static int getTots() {
		return tots_Student;
	}
	public Student(String Name, int age) {
		tots_Student++;
		this.Name = Name;
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return Name + ","+age;
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

	@Override
	public int compareTo(Student o) {
//		A.compareTo(B)// A-B

		
		return this.age - o.age;
	}
}
