package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Example03 {
    public static void main(String[] args) {
    	new Cardlayout();
}
    }
class Cardlayout extends JFrame implements ActionListener {
	JPanel cardPanel=new JPanel();
	JPanel controlpaPanel=new JPanel();
	Button nextbutton,preButton;
	CardLayout cardLayout=new CardLayout();
	public Cardlayout() {
		setSize(300,200);
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				Cardlayout.this.dispose();
			}
		});
		cardPanel.setLayout(cardLayout);
		cardPanel.add(new JLabel("��һ������"));
		cardPanel.add(new JLabel("�ڶ�������"));
		cardPanel.add(new JLabel("����������"));
		nextbutton=new Button("��һ�ſ�Ƭ");
		preButton=new Button("��һ�ſ�Ƭ");
		
		
		nextbutton.addActionListener(this);
		preButton.addActionListener(this);
		controlpaPanel.add(preButton);
		controlpaPanel.add(nextbutton);
		this.add(cardPanel,BorderLayout.CENTER);
		this.add(controlpaPanel,BorderLayout.SOUTH);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==nextbutton) {
			cardLayout.next(cardPanel);
		}
		if(e.getSource()==preButton) {
			cardLayout.previous(cardPanel);
		}
	}
	

}
