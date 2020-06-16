package Test1;

public class fengzhuang {
	 private String name;
	 private int age;
//	 public fengzhuang() {
//		 
//	 }
	 public void Student(String name,int age) {
		 this.name=name;
		 this.age=age;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void setAge(int age) {
		 this.age=age;
	 }
	public static void main(String[] args) {
		fengzhuang f=new fengzhuang();
		f.setAge(20);
		f.setName("·â×°");
		System.out.println(f.getName()+","+f.getAge());
	}
}