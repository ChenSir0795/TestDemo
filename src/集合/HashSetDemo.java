package ����;

import java.util.HashSet;

public class HashSetDemo {
/*
 * HashSet�����ص�
 * 1:�ײ����ݽṹ�ǹ�ϣ��
 * 2���Լ��ϵĵ���˳�����κα�֤��Ҳ����˵����֤�洢��ȡ����Ԫ��˳��һ��
 * 3��û�д������ķ��������Բ���ʹ��ƽ��ͨ��forѭ������
 * 4��������Set���ϣ������ǲ������ظ�Ԫ�صļ���
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("hello");
		hs.add("world");
		hs.add("java");
		for(String s:hs) {
			System.out.println(s);
		}
		
	}

}
