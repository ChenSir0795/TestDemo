package �ӿ�;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
//set�����ص�
//�������ظ������ķ�����
//û�������ķ��������Բ���ʹ����ͨforѭ������
	//HashSet���Լ��ϵĵ���˳�����κα�֤
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		set.add("hello");
		set.add("world");
		set.add("java");
		set.add("java");
		for(String s:set) {
			System.out.println(s);
		}
	}

}
