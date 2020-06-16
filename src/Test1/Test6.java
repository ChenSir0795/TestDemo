package Test1;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		System.out.print("请输入一个整数(1~20)： ");
		Scanner scanner = new Scanner(System.in);
		int inputNum = scanner.nextInt();
		int[][] mat=createMatrix(inputNum);
		for(int i=0;i<inputNum;i++) {
			for(int j=0;j<inputNum;j++) {
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static int[][] createMatrix(int n){
		int[][] matrix = new int[n][n];//n*n的二维数组，初始元素值都为0		
		int down = 1, right = 2, up = 3, left = 4;//分别表示右下左上四个方向		
		int direction = down;				
		int i = 0, j = 0;		
		for (int p = 1; p <= n*n; p++)	{			
			matrix[i][j] = p;		
			//判断方向向下的情况			
			if (direction == down){
				//如果当前位置的下面位置在下边界内且值还是初始值，则列不变，行号向下移动一位				
				if (i + 1 < n && matrix[i + 1][j] == 0)	{
					i++;
				} else {//如果超出下边界，或者下面的元素已经被修改过，则向左移动一行，且将方向改为向左					
					j++;					
					direction = right;				
					continue;				
				}
			}
			
			//判断方向向右的情况			
			if(direction == right){				
				//如果当前位置的右面位置在右边界内且值还是初始值，则行不变，列号向右移动一位				
				if (j + 1 < n && matrix[i][j + 1] == 0)	{					
					j++;			
				} else {//如果超出右边边界，或者右面的元素已经被修改过，则向下移动一行，且将方向改为向下					
					i--;					
					direction = up;					
					continue;				
				}
			}			
					
			//判断方向向上的情况			
			if (direction == up){				
				//如果当前位置的上面位置在上边界内且值还是初始值，则列不变，行号向左移动一位				
				if (i - 1 >= 0 && matrix[i - 1][j] == 0){					
					i--;
				} else {//如果超出上边界，或者上面的元素已经被修改过，则向右移动一列，且将方向改为向右					
					j--;
					direction = left;					
					continue;				
				}			
			}
			
			//判断方向向左的情况	  
			if (direction == left){				
				//如果当前位置的左面位置在左边界内且值还是初始值，则行不变，列号向左移动一位
				if (j - 1 >= 0 && matrix[i][j - 1] == 0){
					j--;				
				} else {//如果超出左边界，或者左面的元素已经被修改过，则向上移动一行，且将方向改为向上					
					i++;					
					direction = down;					
					continue;				
				}			
			}			
					
		}		
		return matrix;	
	}			

}
