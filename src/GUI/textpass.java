package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

	public class textpass extends JFrame implements ActionListener {
	private JPanel jp=new JPanel();
	private JLabel[] jlArray={new JLabel("�û���"),
	new JLabel("�ܡ���"),new JLabel("")};
	private JButton[] jbArray={new JButton("��½"),
	new JButton("���")};
	private JTextField jtxtName =new JTextField();
	private JPasswordField jtxtPassword= new JPasswordField();
	
	public textpass(){
	jp.setLayout(null);
	for(int i=0;i<2;i++){
	jlArray[i].setBounds(30, 20+i*50, 80, 26);
	jbArray[i].setBounds(50+i*110, 130, 80,26);
	jp.add(jlArray[i]);
	jp.add(jbArray[i]);
	jbArray[i].addActionListener(this);
	}
	jtxtName.setBounds(80,20,180,30);
	jp.add(jtxtName);
	jtxtName.addActionListener(this);
	jtxtPassword.setBounds(80,70,180,30);
	jp.add(jtxtPassword);
	jtxtPassword.setEchoChar('*');
	jtxtPassword.addActionListener(this);
	jlArray[2].setBounds(10, 180, 300, 30);
	jp.add(jlArray[2]);
	this.add(jp);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setTitle("��½");
	this.setResizable(false);
	this.setBounds(100, 100, 300, 250);
	this.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
	if(e.getSource()==jtxtName){
	jtxtPassword.requestFocus();
	}else if(e.getSource()==jbArray[1]){
	jlArray[2].setText("");
	jtxtName.setText("");
	jtxtPassword.setText("");
	jtxtName.requestFocus();
	}else{
	if(jtxtName.getText().equals("���е߳���")&&String.valueOf(jtxtPassword.getPassword()).equals("250")){
	jlArray[2].setText("��½�ɹ�");
	}else{
	jlArray[2].setText("��½����");
	}
	}
	
	}
	
	public static void main(String[] args) {
	new textpass();
}
}
