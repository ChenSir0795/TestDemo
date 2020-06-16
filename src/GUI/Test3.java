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
				System.out.println("windowOpened---窗体打开事件");
				
			}
			public void windowIconified(WindowEvent e) {
				System.out.println("windowIconified---窗体化图标事件");
				
			}
			public void windowDeiconified(WindowEvent e) {
				System.out.println("windowDeiconified---窗体取消图标化事件");
			}
			public void windowDeactivated(WindowEvent e) {
				System.out.println("windowDeiconified---窗体停用事件");
			}
			public void windowClosing(WindowEvent e) {
				System.out.println("windowClosing---窗体正在关闭事件");
			//	((Window)e.getComponent()).dispose();
			}
			public void windowClosed(WindowEvent e) {
				System.out.println("windowClosed---窗体关闭事件");
			}
			
			public void windowActivated(WindowEvent e) {
				System.out.println("windowActivated---窗体激活事件");
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
