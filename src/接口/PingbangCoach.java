package �ӿ�;

public class PingbangCoach extends Coach implements SpeakEnglish {
	public PingbangCoach() {
		
	}
	public PingbangCoach(String name,int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("ƹ���������ţ�̣������");
	}
	public void teach() {
		System.out.println("ƹ��������̷���");
	}
	public void speak() {
		System.out.println("ƹ�������˵Ӣ��");
	}
}

