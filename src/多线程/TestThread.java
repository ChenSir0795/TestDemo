package ���߳�;

public class TestThread extends Thread {
public void run() {
	for(int i=0;i<20;i++) {
		System.out.println(i+"+++���߳�+++");
	}
}
	public static void main(String[] args) {
		
		TestThread thread=new TestThread();
		thread.start();
		for(int i=0;i<20;i++) {
			System.out.println(i+"---���߳�---");
		}
	}

}
