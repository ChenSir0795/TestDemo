package Test1;

public class AnimalDeom {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat1 c=new Cat1();
		c.eat();
		Dog d=new Dog();
		d.work();
	}
}
 class Animal{
	public void eat() {
		System.out.println("è�Թ�ͷ");
	}
	public void work() {
		System.out.println("������");
	}
}
 class Cat1 extends Animal{
	
}
 class Dog extends Animal{
	 
 }
