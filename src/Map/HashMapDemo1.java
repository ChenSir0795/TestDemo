package Map;

import java.util.HashMap;
import java.util.Set;

import ����.Student;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,String> hm=new HashMap<Student,String>();
		Student s1=new Student("����ϼ",30);
		Student s2=new Student("������",39);
		Student s3=new Student("������",32);
		hm.put(s1, "����");
		hm.put(s2, "��ɳ");
		hm.put(s3, "����");
		Set<Student> keySet=hm.keySet();
		for(Student key:keySet) {
			String value=hm.get(key);
			System.out.println(key.getAge()+","+key.getName()+","+value);
		}
		
	}

}
