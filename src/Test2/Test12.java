package Test2;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入您的年薪：");
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		if(money<10) {
			System.out.println("当你年薪为"+money+"万元的奖金为："+money*0.1+"万元");
		}else {
			System.out.println("当你年薪为"+money+"万元的奖金为："+(money%100)*0.01+"万元");	
		}
		switch(money/10) {
		case 1:
			System.out.println("当你年薪为"+money+"万元的奖金为："+10*0.1+(money%10)*0.075+"万元");
			break;
		case 2:case 3:
			System.out.println("当你年薪为"+money+"万元的奖金为："+(money%20)*0.05+"万元");
			break;
		case 4:case 5:
			System.out.println("当你年薪为"+money+"万元的奖金为："+(money%40)*0.03+"万元");
			break;
		case 6:case 7: case 8: case 9:
			System.out.println("当你年薪为"+money+"万元的奖金为："+(money%60)*0.015+"万元");
			break;
		}
	}

}
