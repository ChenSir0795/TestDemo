package Test2;

public class Test20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
		for(double i=1;i<=20;i++) {
			sum+=f1(i)/f2(i);
		}
		System.out.println("sum="+sum);
	}
	public static double f1(double n) {
		if(n==1)
			return 2;
		else if(n==2)
			return 3;
		else
			return f1(n-1)+f1(n-2);
	}
	public static double f2(double n) {
		if(n==1)
			return 1;
		else if(n==2)
			return 2;
		else
			return f2(n-1)+f1(n-2);
	}
}
