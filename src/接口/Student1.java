package 接口;

 interface Student2 {
	void work();
	void rest();
 }
class Student implements Student2{
	public void work() {
		System.out.println("学生去食堂吃饭");
	}
	public void rest() {
		System.out.println("学生会寝室睡觉");
	}
}
class Teach implements Student2{
	public void work() {
		System.out.println("教师回教工餐厅吃饭");
	}
	public void rest() {
		System.out.println("教师回公寓睡觉");
	}
}
class Parents implements Student2{
	public void work() {
		System.out.println("家长回招待所吃饭");
	}
	public void rest() {
		System.out.println("家长回招待所睡觉");
	}
}
public class Student1{
		public void main(String[] args) {
			// TODO Auto-generated method stub
			Student s=new Student();
			Teach t=new Teach();
			Parents p=new Parents();
			s.work();s.rest();
			t.work();t.rest();
			p.work();p.rest();
	}
}



