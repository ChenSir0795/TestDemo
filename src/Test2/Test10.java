package Test2;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("������С������ĸ߶ȣ��������Ĵ���");
	Scanner sc=new Scanner(System.in);
	float h=sc.nextFloat();
	float n=sc.nextFloat();
	float sum=h;
	h=h/2;
	for(int i=2;i<=n;i++) {
		sum+=h*2;
		h=h/2;
	}
	System.out.println("С���100�׷���"+n+"�ε��ܸ߶�Ϊ��"+sum);
	}

}
