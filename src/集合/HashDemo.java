package ����;

public class HashDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("����",18);
		//ͬһ�������Ե���hahCode�����ķ���ֵ����ͬ��
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		//Ĭ�����ϵ����ͬ����Ĺ�ϣֵ�ǲ�ͬ��
		Student s2=new Student("����",18);
		System.out.println(s2.hashCode());
		System.out.println("----------");
		System.out.println("hello".hashCode());
		System.out.println("world".hashCode());
		System.out.println("java".hashCode());
		System.out.println("----------");
		System.out.println("ͨ��".hashCode());
		System.out.println("����".hashCode());
	}

}
