package Test2;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int x=100;x<200;x++) {
			 if(su(x)) {
				 System.out.println(x);
			 }
		}
	}
	public static Boolean su(int i) {
		for(int j=2;j<=Math.sqrt(i);j++) {
			if(i%j==0) {
				return false;
			}
			
		}
		return true;
	}
}
