package ���߳�;

public class MyRunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable my=new MyRunnable();
		Thread t1=new Thread(my,"�ɻ�");
		Thread t2=new Thread(my,"����");
		t1.start();
		t2.start();
	}

}
