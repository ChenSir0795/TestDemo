package GUI;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final Frame f=new Frame("BorderLayout");
	f.setLayout(new BorderLayout());
	f.setSize(300,200);
	f.setLocation(300,200);
	f.setVisible(true);
	Button but1=new Button("����");
	Button but2=new Button("����");
	Button but3=new Button("�ϲ�");
	Button but4=new Button("����");
	Button but5=new Button("�в�");
	f.add(but1,BorderLayout.EAST);
	f.add(but2,BorderLayout.WEST);
	f.add(but3,BorderLayout.SOUTH);
	f.add(but4,BorderLayout.NORTH);
	f.add(but5,BorderLayout.CENTER);

	}

}
