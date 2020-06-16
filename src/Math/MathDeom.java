package Math;

public class MathDeom {
	public static void main(String[] args) {
	System.out.println(Math.abs(88));
	System.out.println(Math.abs(-88));
	//public static double  ceil 返回大于或等于最小值double，等于一个整数
	System.out.println(Math.ceil(12.34));
	System.out.println(Math.ceil(12.54));
	//public static double floor 返回小于或等于最小值double，等于一个整数
	System.out.println(Math.floor(12.34));
	System.out.println(Math.floor(12.54));
	//public static int round(float a)按照四舍五入最近参照的int
	System.out.println(Math.round(12.34));
	System.out.println(Math.round(12.54));
	//public static int max(int a,int b)返回两个数中的最大的int
	System.out.println(Math.max(22,56));
	System.out.println(Math.min(22,56));
	//public static double pow double(int a,int b)返回a的b次幂
	System.out.println(Math.pow(2.0,3.0));
	//public static double random 返回double的正值
	System.out.println(Math.random()*100);
	}
}
