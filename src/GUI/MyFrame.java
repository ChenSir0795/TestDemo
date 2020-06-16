package GUI;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame{
//	public static void main(String[] args) {
		JLabel label;
	public MyFrame() {
			//super(title);
		//	public static void main(String[] arges){
		Color color=Color.red;

			setLayout((LayoutManager) new FlowLayout(FlowLayout.LEFT,20,30));
			label=new JLabel("Label");
			getContentPane().add(label);
			JButton button1=new JButton("Button1");
			getContentPane().add(button1);
			JButton button2=new JButton("BUtton2");
			getContentPane().add(button2);
			setSize(350,120);
			setVisible(true);
			setBackground(color);
			button2.addActionListener((event)->{
				label.setText("hello Swing");
			});
			button1.addActionListener((event)->{
				label.setText("hello Swing");
			});
	}
		
		public static void main(String[] args) {
			new MyFrame();

		}
}
