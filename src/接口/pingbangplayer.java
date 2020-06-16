package 接口;

public class pingbangplayer extends Player implements SpeakEnglish {
	public pingbangplayer() {	
	}
	public pingbangplayer(String name,int age) {
		super(name,age);
	}
	public void study() {
		System.out.println("乒乓球员学接球，发球");
	}
	public void eat() {
		System.out.println("乒乓球员吃虾米米，喝粥");
	}
	public void speak() {
		System.out.println("乒乓球员说英语");
	}
}
