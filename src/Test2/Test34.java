package Test2;

import java.util.Scanner;

public class Test34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��������������");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		//scanner.close();
		int temp=0;
		if(num1<num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}
		if(num2<num3) {
			temp=num2;
			num2=num3;
			num3=temp;
		}
		if(num1<num2) {
			temp=num1;
			num1=num2;
			num2=temp;
		}
		System.out.print("���������Ӵ�С��˳���ǣ�"+num1+" "+num2+" "+num3);
	}

}
