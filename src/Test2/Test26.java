package Test2;

import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ����ĸ��");
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String input2=sc.nextLine();
		switch(input) {
		case "m":
			System.out.println("Monday");
			break;
		case "t":
			System.out.println("������ڶ�����ĸ:");
			input2=sc.nextLine();
			if(input2.equals("u")) {
				System.out.println("Tuesday");
			}else if(input2.equals("h")) {
				System.out.println("Thurday");
		}else
			System.out.println("fault");
			break;
	}
	}
}
