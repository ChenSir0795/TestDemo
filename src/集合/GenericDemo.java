package ����;

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 s=new Student2();
		s.setName("����");
		System.out.println(s.getName());
		System.out.println("--------");
		Generic<String> g=new Generic<String>();
		g.setT("����");
		System.out.println(g.getT());
		
	}

}
