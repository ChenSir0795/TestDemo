package �ӿ�;

public class Basketballplayer extends Player implements SpeakEnglish {

	public Basketballplayer() {
		
	}
	
	public Basketballplayer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public void study() {
		System.out.println("����ѧԱѧ������");
	}
	public void eat() {
		System.out.println("��ţ�ţ���ţ��");
	}
	public void speak() {
		System.out.println("����ѧԱ˵Ӣ��");
	}

	
}
