package Test1;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入两个数字：");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		System.out.println("a+b="+(a+b)+","+"+a-b="+(a-b)+","+"a*b="+a*b+","+"a/b="+a/b);
	}

}
