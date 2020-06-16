package Test1;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int arr[][] = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//		   int arr1[][]=new int[3][3];
		   for(int i=0;i<arr.length;i++) {
			   for(int j=0;j<=i;j++) {
				   swap(arr[i][j],arr[j][i]);
			   }			  
		   }
		   for(int i=0;i<arr.length;i++) {
			   for(int j=0;j<arr[0].length;j++) {
					   System.out.print(arr[i][j]+" ");
			   }			  
			   System.out.println();
		   }
		   
		  
	}
	public static void swap(int a,int b) {
		int tmp=a;
		a=b;
		b=tmp;
	}

}
