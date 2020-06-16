package IO;

public class zhuangshi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car benz=new car("benz");
		System.out.println("--------包装前--------");
		benz.show();
		Radarcar benz_A=new Radarcar(benz);
		System.out.println("--------包装后--------");
		benz_A.show();
	}

}
class car{
	private String carname;
	public car(String carname) {
		this.carname=carname;
	}
	public void show() {
		System.out.println("我是"+carname+"具有基本功能");
	}
}
class Radarcar{
	public car myCar;
	public Radarcar(car myCar) {
	this.myCar=myCar;
	}
	public void show() {
		myCar.show();
		System.out.println("具有倒车雷达功能");
	}
}

