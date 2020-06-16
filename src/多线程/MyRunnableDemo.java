package 多线程;

public class MyRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable my=new MyRunnable();
		Thread t1=new Thread(my,"飞机");
		Thread t2=new Thread(my,"高铁");
		t1.start();
		t2.start();
	}

}
