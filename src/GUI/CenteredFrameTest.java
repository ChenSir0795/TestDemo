package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CenteredFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CenteredFrame frame=new CenteredFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
class CenteredFrame extends JFrame{
	public CenteredFrame() {
		Toolkit kit=Toolkit.getDefaultToolkit();
		Dimension scrennSize=kit.getScreenSize();
//		int screenHeight=screenSize.height;
//		int screenWidth=screenSize.width;
//		setSize(screenWidth/2,screenHeigth/2);
//		setLocation(scteenWidth/4,screenHeigth/4);
		Image img=kit.getImage("icon.gif");
		setIconImage(img);
		setTitle("CenteredFrame");
		
		
	}
}
