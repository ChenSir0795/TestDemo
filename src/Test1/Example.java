package Test1;
class Student{
	final String name = "black";
	public void introduce() {
		System.out.println("我是一个学生,我叫"+name);
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.introduce();
	}

}
