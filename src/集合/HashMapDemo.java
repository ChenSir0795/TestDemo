package ����;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Student,String> hm=new HashMap<Student, String>();
	Student s1=new Student("����ϼ",30);
	Student s2=new Student("������",30);
	Student s3=new Student("������",30);
	hm.put(s1,"���");
	hm.put(s2,"�ϲ�");
	hm.put(s3,"�Ϻ�");
	//��������
	Set<Student> KeySet=hm.keySet();
	for(Student key:KeySet) {
		String value=hm.get(key);
		System.out.println(key.getAge()+","+key.getName()+","+value);
	}
	}

}
