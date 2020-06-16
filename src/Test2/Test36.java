package Test2;

import java.util.Arrays;
import java.util.Scanner;

public class Test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入10个数");
		Scanner sc=new Scanner(System.in);
		int n=10;
		int[] arrA=new int[n];
		for(int i=0;i<arrA.length;i++) {
			arrA[i]=sc.nextInt();
		}
		System.out.println("移动前的10个数"+Arrays.toString(arrA));
		System.out.println("请输入要移动的数");
		Scanner s=new Scanner(System.in);
		int m=sc.nextInt();
		int[] arrB=new int[n];
		int k=m;
		for(int i=m;i<arrA.length;i++) {
			arrB[i]=arrA[i-m];
		}
		for(int i=0;i<k;i++) {
			arrB[i]=arrA[arrA.length-m];
			m--;
		}
		System.out.println("移动后的10个数为："+Arrays.toString(arrB));
	}

}
