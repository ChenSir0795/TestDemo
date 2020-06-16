package Test2;

import java.util.Scanner;

public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一组数据：");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int[] arr=new int[5];
		int i=0;
		do {
			arr[i]=input%10;
			input=input/10;
			i++;
		}while(i<5);
		if(arr[0]==arr[4]&&arr[1]==arr[3]) {
			System.out.println("输出的是回文数字");
			
		}else
			System.out.println("输出的不是回文数字");
		
	}

}
