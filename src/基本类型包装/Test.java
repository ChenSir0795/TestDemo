package 基本类型包装;

public class Test {
public static void main(String[] args) {
	Integer i=Integer.valueOf(100);
	Integer ii=100;
	ii+=100;
	Integer iii=null;
	if(iii!=100) {
		System.out.println(iii);
	}
	iii+=100;
	System.out.println(ii);
	
}
}
