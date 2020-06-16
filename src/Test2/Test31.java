package Test2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一组数字：");
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
		System.out.println(Arrays.toString(arr));
	}

}
