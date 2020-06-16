package CF1;

public class Student extends Person1{
	public String name;
	public void getMessage() {
		System.out.println("class student");
}
	public Student(String name) {
		super();
		System.out.println(name+"is a student");
	}
}
