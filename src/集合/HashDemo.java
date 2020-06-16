package 集合;

public class HashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("邱炫",18);
		//同一个对象多吃调用hahCode方法的返回值是相同的
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		//默认情况系，不同对象的哈希值是不同的
		Student s2=new Student("陈盼",18);
		System.out.println(s2.hashCode());
		System.out.println("----------");
		System.out.println("hello".hashCode());
		System.out.println("world".hashCode());
		System.out.println("java".hashCode());
		System.out.println("----------");
		System.out.println("通话".hashCode());
		System.out.println("聊天".hashCode());
	}

}
