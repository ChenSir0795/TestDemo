package GUI;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		//Color color=Color.red;
		
		JFrame f=new JFrame("GridLayout");
		f.setLayout(new GridLayout(3,3));
		f.setSize(300,300);
		f.setLocation(400,300);
	//	f.setBackground(color);
		for(int i=1;i<=9;i++){
			Button btn=new Button("btn"+i);
			f.add(btn);
		}
       // Button button = new Button();
//
     //  button.setBackground(Color.RED); 
    //   f.add(button);

		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

}


