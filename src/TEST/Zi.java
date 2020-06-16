package TEST;

public class Zi extends Fu{
	public int hight=180;
	public int age=12;
	public void show() {
		//int age=40;
		System.out.println(hight);
		System.out.println(age);
		System.out.println(this.age);
		System.out.println(super.age);
	}
}
	//this 代表本类对象引用
	//super:代表父类储存空间的表示（也可以指父类对象引用）