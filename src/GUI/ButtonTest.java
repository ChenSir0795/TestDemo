package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

import javax.swing.JFrame;

public class ButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonFrame frame=new ButtonFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
class ButtonFrame extends JFrame{
	public ButtonFrame() {
		setTitle("ButtonTest");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		ButtonPanel panel=new ButtonPanel();
		add(panel);
		
	}
	public static final int DEFAULT_WIDTH=300;
	public static final int DEFAULT_HEIGHT=200;
}
class ButtonPanel extends JPanel{
	public ButtonPanel() {
		JButton yellowButton=new JButton("yellow");
		JButton blueButton=new JButton("Bule");
		JButton redButton=new JButton("Red");
		add(yellowButton);
		add(blueButton);
		add(redButton);
		colorAction yellowAction=new colorAction(Color.YELLOW);
		colorAction bluewAction=new colorAction(Color.BLUE);
		colorAction redowAction=new colorAction(Color.red);
		yellowButton.addActionListener(yellowAction);
		blueButton.addActionListener(bluewAction);
		redButton.addActionListener(redowAction);


	}
	private class colorAction implements ActionListener{
		public  colorAction(Color c) {
			backgroundColor=c;
		}
		public void actionPerformed(ActionEvent event) {
			setBackground(backgroundColor);
		}
		private Color backgroundColor;
	}
}
