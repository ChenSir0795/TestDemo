package ÄÚÖĞÀà;

public class Outer {
	private int num=10;
	public class Inner{
	public void show() {
		System.out.println(num);
	}
//	public void method() {
//		Inner i=new Inner();
//		i.method();
//	}
	}
	public void method() {
		// TODO Auto-generated method stub
		Inner i=new Inner();
		i.show();
	}
}
