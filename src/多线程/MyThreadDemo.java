package 多线程;

public class MyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread my1=new MyThread("高铁");
		MyThread my2=new MyThread("飞机");
//		my1.run();
//		my2.run();
//	my1.setName("高铁");
//	my1.setName("飞机");
		my1.start();
		my2.start();
		//static Thread currentThread()返回当前正在执行的线程对象的引用
		//System.out.println(Thread.currentThread().getName());
	}

}
