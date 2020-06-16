package Test2;

import java.util.Scanner;

public class Test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个小于5位的数：");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[5];
		int i=0;
		do {
			arr[i]=num%10;
			num=num/10;
			i++;
		}while(num!=0);
		System.out.println("输入的数字是"+i+"位数");
		System.out.println("数字的逆序是：");
		for(int j=0;j<i;j++) {
			System.out.print(arr[j]);
		}
		
	}

}
