package Test1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("������һ������(1~20)�� ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		int[][] arr = Test4.getData(inputNum);

		for(int i = 0; i < inputNum; i++)
		{
			for(int j = 0; j < inputNum; j++)
			{
				//��ӡ����ǰ�ӿո�ʹ�������
				if(10 > arr[i][j])
					System.out.print("  " + arr[i][j] + " ");
				else if(100 > arr[i][j])
					System.out.print(" " + arr[i][j] + " ");
				else
					System.out.print(arr[i][j] + " ");

				//���л���
				if(inputNum - 1 == j)
					System.out.println();
			}
		}
	}
	public static int[][] getData(int number)
	{
		//����һ��20*20�Ķ�ά���飬���ڷ������ݣ�������
		int[][] arrs = new int[20][20];

		//������ÿһλ��num��ʾ���ȳ�ʼ��Ϊ1
		int num = 1;

		int i = 0;//��ʾ�����е�һ����ֵ
		int j = 0;//��ʾ�����еڶ�����ֵ

		//ÿ��ѭ���ı����һ��Ȧ�����ѭ��֮����ǶȦ
		for(int k = 0; k <= number/2; k++)
		{
			//��ֵ�ϱ�(���ƺý�������)
			for(j = k, i = k; j < number - k; j++)
			{
				arrs[i][j] = num;
				num++;
			}
			//��ֵ�ұ� (���ƺý�������)
			for(j=j-1, i=i+1; i < number - k; i++)
			{
				arrs[i][j] = num;
				num++;
			}
			//��ֵ�±�(���ƺý�������)
			for(j=j-1, i=i-1; j >  k - 1; j--)
			{
				arrs[i][j] = num;
				num++;
			}
			//��ֵ���(���ƺý�������)
			for(j=j+1, i=i-1; i > k; i--)
			{
				arrs[i][j] = num;
				num++;
			}
		}
		return arrs;
	}

	

}
