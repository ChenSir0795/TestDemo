package Test1;

public class Cat {
	private String name;
	public static void main(String[] args) {
		Cat c=new Cat();
		c.setName("china");
		c.show();
	}

	public void setName(String name) {
		this.name=name;
	}
	public void show() {
	System.out.println(name);
}
}