package Test2;

import java.util.Scanner;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入三个数：");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int temp=0;
		if(num1<num2) {
			temp=num2;
			num2=num1;
			num1=temp;
		}
		if(num1<num3) {
			temp=num3;
			num3=num1;
			num1=temp;
		}
		if(num2<num3) {
			temp=num3;
			num3=num2;
			num2=temp;
		}	
		System.out.println("这三个数从大到小的顺序是："+num1+" "+num2+" "+num3);
	}

}
