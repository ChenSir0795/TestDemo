package ð�ݷ�����;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("����������");
		String s=sc.nextLine();
		
		String[] arr=s.split(",");
		int[] Arr=new int[arr.length];
		for(int x=0;x<arr.length;x++) {
			Arr[x]= Integer.parseInt(arr[x]);;
		}
		int x=0,y=0,z=0;
		for(int i=0;i<Arr.length;i++) {
			if(Arr[i]>0) {
				x++;
			}else if(Arr[i]<0) {
				y++;
			}else {
				z++;
			}
		
		}
		System.out.println("�����ĸ���Ϊ��"+x);
		System.out.println("�����ĸ���Ϊ��"+y);
		System.out.println("0�ĸ���Ϊ��"+z);
	}

}
