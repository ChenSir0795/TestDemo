package GUI;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.awt.geom.*;
import javax.swing.*;
public class MouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseFrame frame=new MouseFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
class MouseFrame extends JFrame{
	public MouseFrame() {
		setTitle("MouseTest");
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		MousePanel panel=new MousePanel();
		add(panel);
	}
	public static final int DEFAULT_WIDTH=900;
	public static final int DEFAULT_HEIGHT=800;

}
class MousePanel extends JPanel{
	public MousePanel() {
		squares=new ArrayList<Rectangle2D>();
		current=null;
		addMouseListener((MouseListener) new MouseHandler());
		addMouseMotionListener(new MouseMotionHandler());
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		for(Rectangle2D r:squares)
			g2.draw(r);
		
	}
	public void add(Point2D p) {
		double x=p.getX();
		double y=p.getY();
		current=new Rectangle2D.Double(
		x-SIDELEGTH/2,
		y-SIDELEGTH/2,
		SIDELEGTH,
		SIDELEGTH);
		squares.add(current);
		repaint();
	}
	public void remove(Rectangle2D s) {
		if(s==null)return;
		if(s==current) current=null;
		squares.remove(s);
		repaint();
	}
	private static final int SIDELEGTH=10;
	private ArrayList<Rectangle2D> squares;
	private Rectangle2D current;
	private class MouseHandler extends MouseAdapter{
		public void mousePressed(MouseEvent event) {
			current=find(event.getPoint());
			if(current==null)
				add(event.getPoint());
			
		}
		public void mouseClicked(MouseEvent event) {
			current=find(event.getPoint());
			if(current!=null&&event.getClickCount()>=2)
				remove(current);
		}
	}
	private class MouseMotionHandler implements MouseMotionListener{
		public void mouseMoved(MouseEvent event) {
			if(find(event.getPoint())==null)
				setCursor(Cursor.getDefaultCursor());
			else
				setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
			
		}
		public void mouseDragged(MouseEvent event) {
			if(current!=null) {
				int x=event.getX();
				int y=event.getY();
				current.setFrame(
						x-SIDELEGTH/2,
						y-SIDELEGTH/2,
						SIDELEGTH,
						SIDELEGTH);
			repaint();
			}
		}
	}
	public Rectangle2D find(Point point) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
