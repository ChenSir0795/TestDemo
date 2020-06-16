package Map;

import java.util.HashMap;
import java.util.Set;

import 集合.Student;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,String> hm=new HashMap<Student,String>();
		Student s1=new Student("林青霞",30);
		Student s2=new Student("张曼玉",39);
		Student s3=new Student("王祖贤",32);
		hm.put(s1, "西安");
		hm.put(s2, "淘沙");
		hm.put(s3, "杜市");
		Set<Student> keySet=hm.keySet();
		for(Student key:keySet) {
			String value=hm.get(key);
			System.out.println(key.getAge()+","+key.getName()+","+value);
		}
		
	}

}
