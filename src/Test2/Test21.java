package Test2;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum=0;
		for(int i=0;i<=20;i++) {
			sum+=jiecheng(i);
		}
		System.out.println(sum);
	}
	public static long jiecheng(int n) {
		long mult=1;
		for(int i=1;i<=n;i++) {
			mult=mult*i;
		}
		return mult;
	}
}
