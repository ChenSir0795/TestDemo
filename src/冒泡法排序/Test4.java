package 冒泡法排序;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入学生的分值：");
		Scanner sc=new Scanner(System.in);
//		int score=sc.nextInt();
		int[][] arr=new int[5][3];
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int max=arr[0][0],min=arr[0][0],sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
				sum+=arr[0][0];
			}
		}
		System.out.println("最高分："+max);
		System.out.println("最低分："+min);
		System.out.println("平均分："+(double)sum/arr.length);
		
			
	}

}
