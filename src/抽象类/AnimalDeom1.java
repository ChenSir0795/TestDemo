package ������;

public class AnimalDeom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aniaml1 a=new Cat1();
		a.setAge(5);
		a.setName("�ӷ�è");
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		a=new Cat1("�ӷ�è",5);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		Aniaml1 a1=new Dog1();
		a.setAge(5);
		a.setName("�ӷƹ�");
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		a=new Dog1("�ӷƹ�",5);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
	}

}
