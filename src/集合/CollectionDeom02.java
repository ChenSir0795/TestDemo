package ����;
import java.util.ArrayList;
import java.util.Collection;
public class CollectionDeom02 {

	public static void main(String[] args) {
		//boolean add(E e):���Ԫ��
		// TODO Auto-generated method stub
		Collection<String> c=new ArrayList<String>();
		//System.out.println(c.add("hello"));
		c.add("hello");
		c.add("world");
		c.add("java");
		//boolean remove(Object o):�Ӽ������Ƴ�ָ����Ԫ��
		//System.out.println(c.remove("world"));
		
		//void clear():�Ӽ������Ƴ�ָ����Ԫ��
		//c.clear();
		
		//boolean contains (Object o):�жϼ������Ƿ����ָ����Ԫ��
//		System.out.println(c.contains("world"));
//		System.out.println(c.contains("java"));
		
		//boolean isEmpty():�жϼ����Ƿ�Ϊ��
		//System.out.println(c.isEmpty());
		
		//int size()�����ϵĳ��ȣ�Ҳ���Ǽ����еĸ���
		System.out.println(c.size());
		System.out.println(c);
	}

}
