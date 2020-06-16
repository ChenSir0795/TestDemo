package Test2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		System.out.println(shui(x));
	}
	public static int shui(int a) {
		for(int i=100;i<=999;i++) {
			int ge=i%10;
			int shi=i/10%10;
			int bai=i/10/10;
			if(ge*ge*ge+bai*bai*bai+shi*shi*shi==i) {
				System.out.println(i);
			}
		}
		return a;
	}
}
