package GUI;

		import java.awt.*;
		import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Test1{
		public static void main(String[] args){
		Frame f1=new Frame("�ҵĴ���");
		Color color=Color.red;
		JFrame f=new JFrame("MyFrame");
		
		//������ǩ
		JLabel label=new JLabel("�������ְҵ������ѧ");
		//��ô��ڵ��������
		Container contentPane=f.getContentPane();
		//��ӱ�ǩ���������
		contentPane.add(label);
		f1.setSize(400,300);
		f1.setLocation(300,200);
		f1.setVisible(true);
		f1.setBackground(color);
		MyWindowListener mw=new MyWindowListener();
		f1.addWindowListener(mw);
		
		}
		}
		class MyWindowListener implements WindowListener{
		public void windowClosing(WindowEvent e){
		Window window=e.getWindow();
		window.setVisible(false);
		window.dispose();
		}
		public void windowActivated (WindowEvent e){}
		public void windowClosed (WindowEvent e){}
		public void windowDeactivated (WindowEvent e){}
		public void windowDeiconified (WindowEvent e){}
		public void windowlconified (WindowEvent e){}
		public void windowOpened (WindowEvent e){}
		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		}



