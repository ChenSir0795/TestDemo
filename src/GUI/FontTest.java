package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FontTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	FontFrame frame=new FontFrame();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	}

}
class FontFrame extends JFrame{
	public FontFrame() {
		setTitle("FontTest");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGTH);
	FontPanel panel=new FontPanel();
	add(panel);
	}
	public static final int DEFAULT_WIDTH=300;
	public static final int DEFAULT_HEIGTH=300;

}
class FontPanel extends JPanel{
	public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g2=(Graphics2D) g;
	String message="hello world";
	Font f=new Font("Serif",Font.ITALIC,36);
	g2.setFont(f);
	FontRenderContext context=g2.getFontRenderContext();
	//Component bounds = null;
	Rectangle2D bounds=f.getStringBounds(message,context);
	double x=(getWidth()-bounds.getWidth())/2;
	double y=(getHeight()-bounds.getHeight())/2;
	double ascent=-bounds.getY();
	double baseY=y+ascent;
	g2.drawString(message,(int) x,(int)baseY);
	g2.setPaint(Color.red);
	double base = 0;
	g2.draw(new Line2D.Double(x,base,x+bounds.getWidth(),baseY));
	Rectangle2D rect=new Rectangle2D.Double(x,y,bounds.getWidth(),bounds.getHeight());
	g2.draw(rect);
	}
}