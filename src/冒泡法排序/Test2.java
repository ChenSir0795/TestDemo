package 冒泡法排序;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入人数：");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] score=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("请输入第"+(i+1)+"个学生的成绩：");
			score[i]=sc.nextInt();
		}
		int max=score[0];
		for(int i=1;i<n;i++) {
			if(score[i]>max)
				max=score[i];
		}
		for(int i=0;i<n;i++) {
			if(max-score[i]<=10) {
				System.out.println(score[i]+"分为A等级");
			}else if(max-score[i]<=20) {
				System.out.println(score[i]+"分为B等级");
			}else if(max-score[i]<=30) {
				System.out.println(score[i]+"分为C等级");
			}else {
				System.out.println(score[i]+"分为D等级");
			}
		}
	}

}
