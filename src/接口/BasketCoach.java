package 接口;

public class BasketCoach extends Coach {
	public BasketCoach() {
		
	}
	public BasketCoach(String name,int age) {
		super(name,age);
	}
	public void teach() {
		System.out.println("教大篮球");
	}
	public void eat() {
		System.out.println("吃东西");
	}
	
}
