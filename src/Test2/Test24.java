package Test2;

import java.util.Scanner;

public class Test24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������һ��С��5λ������");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int[] arr=new int[5];
		int i=0;
		do {
			arr[i]=num%10;
			num=num/10;
			i++;
		}while(num!=0);
		System.out.println("�����������"+i+"λ��");
		System.out.println("���ֵ������ǣ�");
		for(int j=0;j<i;j++) {
			System.out.print(arr[j]);
		}
		
	}

}
