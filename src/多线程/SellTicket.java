package 多线程;

public class SellTicket implements Runnable {
	private int tickets=100;
	private Object obj=new Object();
	public void run() {
	while(true) {
		synchronized(obj) {
	if(tickets>0) {
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"正在售票"+tickets+"张票");
		tickets--;
	}
		}
	}
	}
}
