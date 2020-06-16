package 接口;

public class PingbangCoach extends Coach implements SpeakEnglish {
	public PingbangCoach() {
		
	}
	public PingbangCoach(String name,int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("乒乓球教练喝牛奶，吃面包");
	}
	public void teach() {
		System.out.println("乒乓球教练教发球");
	}
	public void speak() {
		System.out.println("乒乓球教练说英语");
	}
}

