package ð�ݷ�����;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] score=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("�������"+(i+1)+"��ѧ���ĳɼ���");
			score[i]=sc.nextInt();
		}
		int max=score[0];
		for(int i=1;i<n;i++) {
			if(score[i]>max)
				max=score[i];
		}
		for(int i=0;i<n;i++) {
			if(max-score[i]<=10) {
				System.out.println(score[i]+"��ΪA�ȼ�");
			}else if(max-score[i]<=20) {
				System.out.println(score[i]+"��ΪB�ȼ�");
			}else if(max-score[i]<=30) {
				System.out.println(score[i]+"��ΪC�ȼ�");
			}else {
				System.out.println(score[i]+"��ΪD�ȼ�");
			}
		}
	}

}
