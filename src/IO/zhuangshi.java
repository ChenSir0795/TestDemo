package IO;

public class zhuangshi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car benz=new car("benz");
		System.out.println("--------��װǰ--------");
		benz.show();
		Radarcar benz_A=new Radarcar(benz);
		System.out.println("--------��װ��--------");
		benz_A.show();
	}

}
class car{
	private String carname;
	public car(String carname) {
		this.carname=carname;
	}
	public void show() {
		System.out.println("����"+carname+"���л�������");
	}
}
class Radarcar{
	public car myCar;
	public Radarcar(car myCar) {
	this.myCar=myCar;
	}
	public void show() {
		myCar.show();
		System.out.println("���е����״﹦��");
	}
}

