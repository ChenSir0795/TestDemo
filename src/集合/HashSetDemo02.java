package ����;

import java.util.HashSet;

public class HashSetDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hs=new HashSet<Student>();
		Student s1=new Student("����ϼ",30);
		Student s2=new Student("������",30);
		Student s3=new Student("������",30);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		for(Student s:hs) {
			System.out.println(s.getAge()+","+s.getName());
		}
	}

}
