package GUI;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Frame f=new Frame("WindowEvent");
		f.setSize(400,300);
		f.setLocation(300,200);
		f.setVisible(true);
		f.addWindowListener(new WindowListener() {
			public void windowOpend(WindowEvent e) {
				System.out.println("windowOpened---������¼�");
				
			}
			public void windowIconified(WindowEvent e) {
				System.out.println("windowIconified---���廯ͼ���¼�");
				
			}
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified---����ȡ��ͼ�껯�¼�");
			}
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeiconified---����ͣ���¼�");
			}
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing---�������ڹر��¼�");
			//	((Window)e.getComponent()).dispose();
			}
			public void windowClosed(WindowEvent e) {
				System.out.println("windowClosed---����ر��¼�");
			}
			
			public void windowActivated(WindowEvent e) {
				System.out.println("windowActivated---���弤���¼�");
			}
		//	@Override
//			public void windowOpened(WindowEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

}
