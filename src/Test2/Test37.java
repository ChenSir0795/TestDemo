package Test2;

import java.util.Scanner;

public class Test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("一共有参赛人员：");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[] b=new boolean[n];
		for(int i=0;i<b.length;i++) {
			b[i]=true;
		}
		int incount=n;
		int countnum=0;
		int index=0;
		while(incount>1) {
			
			if(b[index]) {
				countnum++;
				if(countnum==3) {
					b[index]=false;
					countnum=0;
					incount--;
				}
			}
			index++;
			if(index==n) {
			index=0;	
			}
		}
		for(int i=0;i<n;i++) {
			if(b[i]) {
				System.out.println("这个数是"+(i+1));
			}
		}
	}
}


