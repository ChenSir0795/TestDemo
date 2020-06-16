package 字符串;

public class Test {
public static void main(String[] args) {
	String s=new String("HeLLo");
	String s1=new String("I am a good cat");
	String s2=new String("  abcd  ");
	
	System.out.println(s1.indexOf("a"));
	System.out.println(s1.lastIndexOf("a"));
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
	System.out.println(s1.replaceAll("cat","pig"));
	System.out.println("取消前长度："+s2.length());
	String s3=s2.trim();
	System.out.println(s3);
	System.out.println("取消后长度："+s3.length());
	}
}
	

