package �쳣;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		  int a=show(4,0);
		  System.out.println(a);
	   }catch(Exception e) {
		   System.out.println(e);
		System.out.println("�쳣��ʾ"+e.getMessage());
	   }
	}
	   public static int show(int x,int y) {
//		   System.out.println(x/y);
//		   return x/y;
		   int result=x/y;
		   return result;
	   }

}
