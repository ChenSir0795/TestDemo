package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		//void add(int index,E element):在此集合中的指定位置插入指定的元素
		list.add(1,"javaee");
		System.out.println(list);
		System.out.println(list.remove(1));
		
	}

}
