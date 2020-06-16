package 集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDeom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Student> c=new ArrayList<Student>();
		Student s1=new Student("林青霞",30);
		Student s2=new Student("张曼玉",30);
		Student s3=new Student("王祖贤",30);
		c.add(s1);
		c.add(s2);
		c.add(s3);
		//遍历
		Iterator<Student> it=c.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			System.out.println(s.getName()+","+s.getAge());
		}
	}

}
