package ����;

public class Student implements Comparable<Student> {
private String name;
private int age;
//public char[] hashCode;
	public Student() {
	
}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int compareTo(Student s) {
		
	//return 0;s1��s2һ��
	//return 1;s2>s1
	//return -1;s2<s1
		//���������С����
	int num=this.age-s.age;
	return num;
	}
}
