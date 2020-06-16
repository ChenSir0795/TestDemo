package 集合;

import java.util.HashSet;

public class HashSetDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> hs=new HashSet<Student>();
		Student s1=new Student("林青霞",30);
		Student s2=new Student("张曼玉",30);
		Student s3=new Student("王祖贤",30);
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		for(Student s:hs) {
			System.out.println(s.getAge()+","+s.getName());
		}
	}

}
