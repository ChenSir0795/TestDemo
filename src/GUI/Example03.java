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
		cardPanel.add(new JLabel("第一个界面"));
		cardPanel.add(new JLabel("第二个界面"));
		cardPanel.add(new JLabel("第三个界面"));
		nextbutton=new Button("下一张卡片");
		preButton=new Button("上一张卡片");
		
		
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
