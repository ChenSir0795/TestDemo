package 多线程;

public class ThreadPriorityDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPriority tp1=new ThreadPriority();
		ThreadPriority tp2=new ThreadPriority();
		ThreadPriority tp3=new ThreadPriority();
		tp1.setName("高铁");
		tp2.setName("飞机");
		tp3.setName("自行车");
//		System.out.println(tp1.getPriority());//5
//		System.out.println(tp2.getPriority());//5
//		System.out.println(tp3.getPriority());555
		System.out.println(Thread.MAX_PRIORITY);//10
		System.out.println(Thread.MIN_PRIORITY);//5
		System.out.println(Thread.NORM_PRIORITY);//1
		tp1.setPriority(5);
		tp1.setPriority(10);
		tp1.setPriority(1);

		tp1.start();
		tp2.start();
		tp3.start();

		
	}

}
