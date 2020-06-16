package Test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入矩形的长和宽:");
		System.out.println("请输入圆的半径:");
		System.out.println("请输入三角形的底和高:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double r=sc.nextDouble();
		double c=sc.nextDouble();
		double h=sc.nextDouble();
		System.out.println("矩形的面积为："+a*b);
		System.out.println("圆形的面积为："+r*r+"π");
		System.out.println("矩形的面积为："+c*h*1/2);
	}

}
