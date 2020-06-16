package 抽象类;

public class AnimalDeom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aniaml1 a=new Cat1();
		a.setAge(5);
		a.setName("加菲猫");
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		a=new Cat1("加菲猫",5);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		Aniaml1 a1=new Dog1();
		a.setAge(5);
		a.setName("加菲狗");
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
		a=new Dog1("加菲狗",5);
		System.out.println(a.getName()+","+a.getAge());
		a.eat();
	}

}
