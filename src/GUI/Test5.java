package GUI;

//import java.awt.Button;
//import java.awt.FlowLayout;
//import java.awt.Frame;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.*;
import java.awt.*;
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Frame f=new Frame("�ҵĴ���");
		f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
		f.setSize(200,300);
		f.setLocation(300,200);
		Button but1=new Button("��һ����ť");
		f.add(but1);
		but1.addActionListener(new ActionListener() {
			private int num=1;
			public void actionPerformed(ActionEvent e) {
				f.add(new Button("��"+ ++num+"����ť"));
				f.setVisible(true);
			}

		});
		f.setVisible(true);
	}

}
