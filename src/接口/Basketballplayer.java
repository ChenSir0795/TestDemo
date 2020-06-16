package 接口;

public class Basketballplayer extends Player implements SpeakEnglish {

	public Basketballplayer() {
		
	}
	
	public Basketballplayer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public void study() {
		System.out.println("篮球学员学打篮球");
	}
	public void eat() {
		System.out.println("吃牛排，喝牛奶");
	}
	public void speak() {
		System.out.println("篮球学员说英语");
	}

	
}
