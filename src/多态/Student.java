package 多态;

public class Student  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		people p=new people();
		p.setName("杨过");
		p.setAge(30);
		p.setPhone("18301776565");
		System.out.println("姓名："+p.getName()+" 年龄：" +p.getAge()+ " 电话："+p.getPhone());
		
	}

}
