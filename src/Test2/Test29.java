package Test2;

import java.util.Arrays;
import java.util.Scanner;

public class Test29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入十个数字：");
		int[] arr=new int[10];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<9;i++) {
			for(int j=1+i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.print("排列后的顺序是："+Arrays.toString(arr));
	}

}
