package Test2;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入a的值:");
		int a=sc.nextInt();
		System.out.print("请输入n的值:");
		int n=sc.nextInt();
		int i=1;
		int[] arr=new int[n];
		arr[0]=a;
		while(i<n) {
			a*=10;
			arr[i]=a+arr[i-1];
			i++;
		}
		int sum=0;
		for(int s:arr) {
			sum+=s;
			if(s==arr[n-1]) {
				System.out.print(s);
				break;
			}
			System.out.print(s+"+");
		}
		System.out.println("="+sum);
	}

}
