package GUI;

import javax.swing.JFrame;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import javax.swing.*;
public class FillTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FillFrame frame=new FillFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
class FillFrame extends JFrame{
	public FillFrame() {
		setTitle("FillTest");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		FillPanel panel=new FillPanel();
		add(panel);
	}
	public static final int DEFAULT_WIDTH=400;
	public static final int DEFAULT_HEIGHT=400;
	
}
class FillPanel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		double leftX=100;
		double topY=100;
		double width=100;
		double heigth=150;
		Rectangle2D rect=new Rectangle2D.Double(leftX,topY,width,heigth);
		g2.setPaint(Color.red);
		g2.fill(rect);
		Ellipse2D ellipse=new Ellipse2D.Double();
		ellipse.setFrame(rect);
		g2.setPaint(new Color(0,128,128));
		g2.fill(ellipse);
	}
}
