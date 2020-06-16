package TEST;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=   5;i++) {
			for(int j=0;j<5-i;j++) {
				System.out.print("  ");
			}
		
		
		for(int k=1;k<=i;k++) {
			System.out.print(k+" ");
		}
		for(int m=i-1;m>0;m--) {
			System.out.print(m+" ");
		}
		System.out.println();
		}	
	}

}
