package Test2;

import java.util.Scanner;

public class Test39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个数：");
		Scanner sc=new Scanner(System.in);
		double n=sc.nextDouble();
		if(n%2==0) {
			System.out.println(oushu(n));
		}else {
			System.out.println(jishu(n));
		}
			
	}
	public static double oushu(double n) {
		double sum=0;
		for(int i=2;i<=n;i+=2) {
			sum+=1.0/i;
		}
		return sum;
	}
	public static double jishu(double n) {
		double sum=0.0;
		for(int i=1;i<=n;i+=2) {
			sum+=1.0/i;
		}
		return sum;
	}
}
