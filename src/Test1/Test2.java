package Test1;


	public class Test2 extends Base{
	    static{
	        System.out.println("test static");
	    }
	    public Test2(){
	        System.out.println("test constructor");
	    }
	    public static void main(String[] args) {
	        new Test2();
	    }
	}
	class Base{
	    static{
	        System.out.println("base static");
	    }
	    public Base(){
	        System.out.println("base constructor");
	    }
	}


