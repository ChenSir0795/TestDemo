package Test2;

public class Test19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=4;
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	 
	for(int i=1;i<=3;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(" ");
		}
		for(int k=3;k<=2*i-1;k--) {
			System.out.print("*");
		}
		System.out.println();
	}
	}

}
