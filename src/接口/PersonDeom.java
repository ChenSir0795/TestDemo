package ½Ó¿Ú;

public class PersonDeom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pingbangplayer p=new pingbangplayer();
		p.setName("ÇñìÅ");
		p.setAge(18);
		System.out.println(p.getAge()+","+p.getName());
		p.speak();
		p.study();
		p.eat();
		BasketCoach b=new BasketCoach();
		b.setAge(24);
		b.setName("³ÂÅÎ");
		System.out.println(b.getAge()+","+b.getName());
		b.eat();
		b.teach();
	}

}
