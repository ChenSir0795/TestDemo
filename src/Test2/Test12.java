package Test2;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������н��");
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		if(money<10) {
			System.out.println("������нΪ"+money+"��Ԫ�Ľ���Ϊ��"+money*0.1+"��Ԫ");
		}else {
			System.out.println("������нΪ"+money+"��Ԫ�Ľ���Ϊ��"+(money%100)*0.01+"��Ԫ");	
		}
		switch(money/10) {
		case 1:
			System.out.println("������нΪ"+money+"��Ԫ�Ľ���Ϊ��"+10*0.1+(money%10)*0.075+"��Ԫ");
			break;
		case 2:case 3:
			System.out.println("������нΪ"+money+"��Ԫ�Ľ���Ϊ��"+(money%20)*0.05+"��Ԫ");
			break;
		case 4:case 5:
			System.out.println("������нΪ"+money+"��Ԫ�Ľ���Ϊ��"+(money%40)*0.03+"��Ԫ");
			break;
		case 6:case 7: case 8: case 9:
			System.out.println("������нΪ"+money+"��Ԫ�Ľ���Ϊ��"+(money%60)*0.015+"��Ԫ");
			break;
		}
	}

}
