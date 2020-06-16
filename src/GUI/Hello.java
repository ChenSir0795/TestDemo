package GUI;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建窗口对象
		JFrame frame=new JFrame("MyFrame");
		
		//创建标签
		JLabel label=new JLabel("江西软件职业技术大学");
		//获得窗口的内容面板
		Container contentPane=frame.getContentPane();
		//添加标签到内容面板
		contentPane.add(label);
		frame.setSize(300,300);
		//设置窗口可见
		frame.setVisible(true);
		
	}

}
