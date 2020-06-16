package Test2;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入年月日：");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int month=sc.nextInt();
		int day=sc.nextInt();
		int[] arr= {31,29,31,30,31,30,31,31,30,31,30,31};
		int sum=0;
		sum=day;
		for(int i=1;i<month;i++) {
			sum+=arr[i];
		}
		boolean isRigth=(((year%4==0&&year%100==0)||year%400==0)&&month>2);
		if(isRigth) {
			sum+=1;
		}
		System.out.println(year+"年"+month+"月"+day+"日，这是这年的"+sum);
	}

}
