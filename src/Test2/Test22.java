package Test2;

public class Test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result=fact(20);
		System.out.println(result);
	}
	private static long fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
}
