package �ӿ�;

public class pingbangplayer extends Player implements SpeakEnglish {
	public pingbangplayer() {	
	}
	public pingbangplayer(String name,int age) {
		super(name,age);
	}
	public void study() {
		System.out.println("ƹ����Աѧ���򣬷���");
	}
	public void eat() {
		System.out.println("ƹ����Ա��Ϻ���ף�����");
	}
	public void speak() {
		System.out.println("ƹ����Ա˵Ӣ��");
	}
}
