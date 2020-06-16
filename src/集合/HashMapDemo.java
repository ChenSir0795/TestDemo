package 集合;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	HashMap<Student,String> hm=new HashMap<Student, String>();
	Student s1=new Student("林青霞",30);
	Student s2=new Student("王祖贤",30);
	Student s3=new Student("张曼玉",30);
	hm.put(s1,"丰城");
	hm.put(s2,"南昌");
	hm.put(s3,"上海");
	//遍历集合
	Set<Student> KeySet=hm.keySet();
	for(Student key:KeySet) {
		String value=hm.get(key);
		System.out.println(key.getAge()+","+key.getName()+","+value);
	}
	}

}
