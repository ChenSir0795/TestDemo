package �ӿ�;

 interface Student2 {
	void work();
	void rest();
 }
class Student implements Student2{
	public void work() {
		System.out.println("ѧ��ȥʳ�óԷ�");
	}
	public void rest() {
		System.out.println("ѧ��������˯��");
	}
}
class Teach implements Student2{
	public void work() {
		System.out.println("��ʦ�ؽ̹������Է�");
	}
	public void rest() {
		System.out.println("��ʦ�ع�Ԣ˯��");
	}
}
class Parents implements Student2{
	public void work() {
		System.out.println("�ҳ����д����Է�");
	}
	public void rest() {
		System.out.println("�ҳ����д���˯��");
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



