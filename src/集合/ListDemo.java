package 集合;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("hello");
		list.add("world");
		list.add("java");
		list.add("world");
		//System.out.println(list);
		//迭代器方式遍历
//		Iterator<String> it=list.iterator();
//		while(it.hasNext()) {
//			String s=it.next();
//			System.out.println(s);
//		}
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("---------");
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("hello");
		linkedList.add("world");
		linkedList.add("java");
		linkedList.add("java");
		for(String s:linkedList) {
			System.out.println(s);
		}
	}

}
