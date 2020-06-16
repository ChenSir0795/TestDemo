package Test2;

import java.util.Arrays;
import java.util.Scanner;

public class Test30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个数：");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int[] arrA= {1,2,3,5,6};
		int[] arrB=new int[arrA.length+1];
		int j=0;
		for(int i=0;i<arrA.length;i++) {
			
				arrB[0]=input;
				arrB[j+1]=arrA[i];
				j++;
			
		}
		
			int i=0;
			for(int k=1;k<arrB.length;k++) {
				if(arrB[i]>arrB[k]) {
					int temp=arrB[i];
					arrB[i]=arrB[k];
					arrB[k]=temp;
					
				}
				i++;
			}
			System.out.println(Arrays.toString(arrB));
			
		
	}

}
