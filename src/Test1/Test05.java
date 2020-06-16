package Test1;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr=new int[3][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
	System.out.println(arr[0][0]+arr[0][2]+arr[1][1]+arr[2][0]+arr[2][2]);
	}
}
