package Test1;
class Student{
	final String name = "black";
	public void introduce() {
		System.out.println("����һ��ѧ��,�ҽ�"+name);
	}
}
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.introduce();
	}

}
