package ����;

import java.util.TreeSet;

/*
 * TreeSet�����ص�
 * 1��Ԫ�����������˳����ָ�洢��ȡ����˳�򣬶��ǰ���һ���Ĺ�������
 * TreeSet():������Ԫ�ص���Ȼ�����������
 * 2��û�д������ķ��������Բ�������ͨforѭ������
 * 3��������Set���ϣ����Բ������ظ���Ԫ�ؼ���
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(10);
		ts.add(20);
		ts.add(30);
		ts.add(10);
		for(Integer i:ts) {
			System.out.println(i);
		}
	}

}
