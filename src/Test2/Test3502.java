package Test2;

import java.util.Arrays;
import java.util.Scanner;

public class Test3502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����������Ĵ�С");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("������"+n+"������");
		Scanner s=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int j=0;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
				}
		}
		int temp=arr[0];
		arr[0]=max;
		max=temp;
		int temp1=arr[arr.length-1];
		arr[arr.length-1]=min;
		min=temp1;
		System.out.println("ת��������"+Arrays.toString(arr));
	}

}
