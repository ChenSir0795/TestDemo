package 集合;

import java.util.TreeSet;
import java.util.Comparator;
public class TreeSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Student2> ts=new TreeSet<Student2>(new Comparator<Student2>() {
			public int compare(Student2 s1,Student2 s2) {
				int num=s2.getSum()-s1.getSum();
				return num;
			}
		});
		Student2 s1=new Student2("林青霞",98,100);
		Student2 s2=new Student2("张曼玉",93,97);
		Student2 s3=new Student2("王祖贤",98,90);
		Student2 s4=new Student2("柳岩",98,102);
		Student2 s5=new Student2("风清杨",98,109);
		Student2 s6=new Student2("邱炫",90,99);
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		for(Student2 s:ts) {
			System.out.println(s.getName()+","+s.getChinese()+","+s.getMath());
		}
	}

	

}
