package ����;

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
		//void add(int index,E element):�ڴ˼����е�ָ��λ�ò���ָ����Ԫ��
		list.add(1,"javaee");
		System.out.println(list);
		System.out.println(list.remove(1));
		
	}

}
