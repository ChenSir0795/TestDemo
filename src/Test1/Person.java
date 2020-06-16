package Test1;

public class Person {
	private static String type;
	private static String name;
	public static void main(String[] args) {
		Person p=new Person();
		p.setname("张三");
		p.setType("人类");
		System.out.println(p.getname()+","+p.getType());
		}
	public static String getType() {
		return type;
	}
	public void setType(String type) {
		this.type=type;
	}
	public static String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
}
