package ���߳�;

public class MyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread my1=new MyThread("����");
		MyThread my2=new MyThread("�ɻ�");
//		my1.run();
//		my2.run();
//	my1.setName("����");
//	my1.setName("�ɻ�");
		my1.start();
		my2.start();
		//static Thread currentThread()���ص�ǰ����ִ�е��̶߳��������
		//System.out.println(Thread.currentThread().getName());
	}

}
