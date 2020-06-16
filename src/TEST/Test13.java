package TEST;
import java.util.Scanner;
public class Test13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("请输入两个数：");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println(add(a,b));
}
	public static int add(int x,int y) {
		int result=x+y;
		return result;
	}
}
