package TEST;

public class A extends Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		Book b2=new Book();
		b.shuming="java程序设计";
		b.jiage=30.0;
		b.show();
		b.shuming="c语言程序设计";
		b.jiage=40.0;
		b.show();
	}

}
