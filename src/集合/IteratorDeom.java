package 集合;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;

public class IteratorDeom {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("hello");
		c.add("world");
		c.add("java");
		//Iterator<E> iterator():返回此集合中元素的迭代器，通过集合的iterator()方法得到
		//E next():返回迭代中下一个元素
		Iterator<String> it =c.iterator();
		/*System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		*/
		/*if(it.hasNext()) {
			System.out.println(it.next());
		}
		if(it.hasNext()) {
			System.out.println(it.next());
		}
		if(it.hasNext()) {
			System.out.println(it.next());
		}
		if(it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		//用while循环判断
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
	}

}
