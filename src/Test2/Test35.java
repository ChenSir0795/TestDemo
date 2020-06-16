package Test2;

import java.util.Arrays;
import java.util.Scanner;

public class Test35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一组数组:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		int[] Arr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			Arr[i]=Integer.parseInt(arr[i]);
			System.out.print(arr[i]+" ");			
		}
		System.out.println();
		for(int i=0;i<Arr.length;i++) {
			System.out.print(Arr[i]+" ");
		}
	}
}
