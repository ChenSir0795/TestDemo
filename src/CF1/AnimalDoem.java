package CF1;

public class AnimalDoem {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.setName("�ӷ�è");
		c.setAge(5);
		System.out.println(c.getAge()+","+c.getName());
		c.catchMouse();
		Cat c2=new Cat();
		c2.setName("�ӷ�è");
		c2.setAge(5);
		System.out.println(c2.getAge()+","+c.getName());
		c2.catchMouse();
		Dog d=new Dog();
		d.setAge(24);
		d.setName("�������ӹ���");
		System.out.println(d.getAge()+","+d.getName());
		d.lookdoor();
		
	}
}
