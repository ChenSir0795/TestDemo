package ¼¯ºÏ;

import java.util.TreeSet;

public class TreeSetdemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student> ts=new TreeSet<Student>();
		Student s1=new Student("xishi",29);
		Student s2=new Student("wangzhaojun",28);
		Student s3=new Student("diaochan",30);
		Student s4=new Student("yangyuhuan",33);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		for(Student s:ts) {
			System.out.println(s.getAge()+","+s.getName());
		}
	}

}
