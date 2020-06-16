package Test2;

public class Test27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=2;i<=100;i++) {
			if(isprime(i)) {
				System.out.print(i+" ");
				sum++;
				if(sum%10==0) {
					System.out.println();
				}
			}
		}
	}
	private static boolean isprime(int i) {
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(i%j==0) {
				return false;
			}
			
		}
		return true;
	}
}
