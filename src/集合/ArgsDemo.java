package ¼¯ºÏ;

public class ArgsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
		System.out.println(sum(10,20,30,40));
		System.out.println(sum(10,20,30,40,50));
	}
	public static int sum(int...a) {
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		return sum;
	}
}
