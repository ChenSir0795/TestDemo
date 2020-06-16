package Test1;

public class TEs04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=20;i++) {
			sum+=jiecheng(i);
		}
		System.out.println(sum);
	}
	
	
	public static int jiecheng(int n) {
		int x=1;
		for(int i=n;i>0;i--) {
			x=x*i;
		}
		return x;
	}
}
