package TEST;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		System.out.println(add(10.0,20.0));
	}
	public static int add(int x,int y) {
		int result=x+y;
		return x+y;
	}
	public static int add(int x,int y,int z) {
		int result=x+y+z;
		return x+y+z;
	}
	public static double add(double d,double e) {
		double result=d+e;
		return d+e;
	}
}
