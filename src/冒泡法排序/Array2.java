package 冒泡法排序;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入数据");
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
		System.out.println("正数的个数为："+x);
		System.out.println("负数的个数为："+y);
		System.out.println("0的个数为："+z);
	}

}
