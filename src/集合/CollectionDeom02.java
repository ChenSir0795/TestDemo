package 集合;
import java.util.ArrayList;
import java.util.Collection;
public class CollectionDeom02 {

	public static void main(String[] args) {
		//boolean add(E e):添加元素
		// TODO Auto-generated method stub
		Collection<String> c=new ArrayList<String>();
		//System.out.println(c.add("hello"));
		c.add("hello");
		c.add("world");
		c.add("java");
		//boolean remove(Object o):从集合中移除指定的元素
		//System.out.println(c.remove("world"));
		
		//void clear():从集合中移除指定的元素
		//c.clear();
		
		//boolean contains (Object o):判断集合中是否存在指定的元素
//		System.out.println(c.contains("world"));
//		System.out.println(c.contains("java"));
		
		//boolean isEmpty():判断集合是否为空
		//System.out.println(c.isEmpty());
		
		//int size()：集合的长度，也就是集合中的个数
		System.out.println(c.size());
		System.out.println(c);
	}

}
