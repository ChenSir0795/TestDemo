package GUI;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������ڶ���
		JFrame frame=new JFrame("MyFrame");
		
		//������ǩ
		JLabel label=new JLabel("�������ְҵ������ѧ");
		//��ô��ڵ��������
		Container contentPane=frame.getContentPane();
		//��ӱ�ǩ���������
		contentPane.add(label);
		frame.setSize(300,300);
		//���ô��ڿɼ�
		frame.setVisible(true);
		
	}

}
