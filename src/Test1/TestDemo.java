package Test1;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcde";
		String s1="hello";
		String s2="world";
	    String s3=s.substring(1);
	    String s4=s.substring(2,4);
	    String s5=s1.concat(s2);
	    char[] s6= {'h','e','l','l','o'};
	    System.out.println(s1);
		System.out.println(s2);
	    System.out.println("s3="+s3);
	    System.out.println("s4="+s4);
	    System.out.println("s字符串长度："+s.length());
	    System.out.println("s1和s2相等："+s1.equals(s2));
	    System.out.println("s1和s2拼接"+s5);
		
	}

}
