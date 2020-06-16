package Test2;

public class Test41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Peach(1));
	}
	private static int Peach(int i) {
		if(i==5) {
			return 6;
		}
		return Peach(i+1)*5+1;
	}
}
