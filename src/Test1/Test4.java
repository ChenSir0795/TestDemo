package Test1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("请输入一个整数(1~20)： ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();

		int[][] arr = Test4.getData(inputNum);

		for(int i = 0; i < inputNum; i++)
		{
			for(int j = 0; j < inputNum; j++)
			{
				//打印数字前加空格，使整体对齐
				if(10 > arr[i][j])
					System.out.print("  " + arr[i][j] + " ");
				else if(100 > arr[i][j])
					System.out.print(" " + arr[i][j] + " ");
				else
					System.out.print(arr[i][j] + " ");

				//进行换行
				if(inputNum - 1 == j)
					System.out.println();
			}
		}
	}
	public static int[][] getData(int number)
	{
		//创建一个20*20的二维数组，用于放置数据，并返回
		int[][] arrs = new int[20][20];

		//数组中每一位用num表示，先初始化为1
		int num = 1;

		int i = 0;//表示数组中第一个数值
		int j = 0;//表示数组中第二个数值

		//每次循环四边组成一个圈，多次循环之后内嵌圈
		for(int k = 0; k <= number/2; k++)
		{
			//赋值上边(控制好结束条件)
			for(j = k, i = k; j < number - k; j++)
			{
				arrs[i][j] = num;
				num++;
			}
			//赋值右边 (控制好结束条件)
			for(j=j-1, i=i+1; i < number - k; i++)
			{
				arrs[i][j] = num;
				num++;
			}
			//赋值下边(控制好结束条件)
			for(j=j-1, i=i-1; j >  k - 1; j--)
			{
				arrs[i][j] = num;
				num++;
			}
			//赋值左边(控制好结束条件)
			for(j=j+1, i=i-1; i > k; i--)
			{
				arrs[i][j] = num;
				num++;
			}
		}
		return arrs;
	}

	

}
