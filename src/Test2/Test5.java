package Test2;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入两个数");
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
//		int temp=1;
		int multiple=input1*input2;
//		if(input1>input2) {
//			temp=input1;
//			input1=input2;
//			input2=temp;
//			while(temp!=0){
//				temp=input2%input1;
//				input2=input1;
//				input1=temp;
//			}
//			
//		}
		int tmp=1;
		while(input2!=0) {
			tmp=input2;
			input2=input1%input2;
			input1=tmp;
		}
		System.out.println("最小公倍数为："+multiple/tmp);
		System.out.println("最大公因数为："+tmp);
		
	}

}
