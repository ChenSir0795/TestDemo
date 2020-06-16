package Test2;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		for( i=1;i<=20;i++) {
			int m=f(i);
			System.out.println("第"+i+"年有兔子："+m);
		}
	}
	public static int f(int x) {
		if(x==1||x==2) {
			return 1;
		}
		else
			return f(x-1)+f(x-2);
	}
}
