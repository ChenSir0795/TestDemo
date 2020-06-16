package Test1;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = {{5,7,9},{12,14,16,18},{23,25,36,47},{22,54,65,15},{22,34}};
		double sum=0.0;
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
				count++;
				}
			}
		System.out.println(sum/count);
		}
	}


