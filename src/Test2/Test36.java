package Test2;

import java.util.Arrays;
import java.util.Scanner;

public class Test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������10����");
		Scanner sc=new Scanner(System.in);
		int n=10;
		int[] arrA=new int[n];
		for(int i=0;i<arrA.length;i++) {
			arrA[i]=sc.nextInt();
		}
		System.out.println("�ƶ�ǰ��10����"+Arrays.toString(arrA));
		System.out.println("������Ҫ�ƶ�����");
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
		System.out.println("�ƶ����10����Ϊ��"+Arrays.toString(arrB));
	}

}
