package GUI;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test4 {
	public static void main(String[] args) {
		final Frame f=new Frame("windowEvent");
		f.setLayout(new FlowLayout());
		f.setSize(300,200);
		f.setLocation(300,200);
		f.setVisible(true);
		Button but=new Button("Butoon");
		f.add(but);
		but.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				System.out.println("mouseReleased-鼠标开放事件");
			}
			public void mousePressed(MouseEvent e) {
				System.out.println("mousePressed-鼠标按下事件");
			}
			public void mouseExited(MouseEvent e) {
				System.out.println("mouseExited-鼠标移除按钮区事件");
			}
			public void mouseEntered(MouseEvent e) {
				System.out.println("mouseEntered-鼠标开放事件");
			}
			public void mouseClicked(MouseEvent e) {
				System.out.println("mouseReleased-鼠标点击完成事件");
			}
		});
	}
}
	
