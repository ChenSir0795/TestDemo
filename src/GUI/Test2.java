package GUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame("我的窗口");
		Color color=Color.red;
		f.setSize(400,300);
		f.setLocation(300,200);
		f.setVisible(true);
		f.setBackground(color);
		Button btn=new Button("退出");
		f.add(btn);
		btn.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});

	}

}
