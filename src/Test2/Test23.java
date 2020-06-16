package Test2;

public class Test23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("第五个人的年龄是:"+GetAge(5,2));
	}
	private static int GetAge(int nums,int MoreAge) {
		if(nums==1) {
			return 10;
		}
		return GetAge(nums-1,MoreAge)+MoreAge;
	}
}
