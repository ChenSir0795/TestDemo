package ����;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;

public class IteratorDeom {

	public static void main(String[] args) {
		Collection<String> c=new ArrayList<String>();
		c.add("hello");
		c.add("world");
		c.add("java");
		//Iterator<E> iterator():���ش˼�����Ԫ�صĵ�������ͨ�����ϵ�iterator()�����õ�
		//E next():���ص�������һ��Ԫ��
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
		//��whileѭ���ж�
		while(it.hasNext()) {
			String s=it.next();
			System.out.println(s);
		}
	}

}
