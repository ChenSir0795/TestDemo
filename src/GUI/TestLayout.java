package GUI;
import java.awt.Button;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class TestLayout {
	public static void main(String[] args) {
		new Layout("GridBagLayout");
	}
}
class Layout extends Frame{
	public Layout(String title) {
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints q = new GridBagConstraints();
		this.setLayout(layout);
		q.fill=GridBagConstraints.BOTH;
		q.weightx=1;q.weighty=1;
		this.addComponent("��ť1",layout,q);
		this.addComponent("��ť2",layout,q);
		this.addComponent("��ť3",layout,q);
		q.gridwidth=GridBagConstraints.REMAINDER;
		this.addComponent("��ť4",layout,q);
		q.weightx=0;q.weighty=0;
		this.addComponent("��ť5",layout,q);
		q.gridwidth=1;
		this.addComponent("��ť6",layout,q);
		q.gridwidth=GridBagConstraints.REMAINDER;
		this.addComponent("��ť7",layout,q);
		q.gridheight=2;q.gridwidth=1;
		q.weightx=2;q.weighty=2;
		this.addComponent("��ť8",layout,q);
		q.gridwidth=GridBagConstraints.REMAINDER;
		q.gridheight=1;
		this.addComponent("��ť9",layout,q);
		this.addComponent("��ť10",layout,q);
		this.pack();
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
	}

	private void addComponent(String string, GridBagLayout layout, GridBagConstraints q) {
		// TODO Auto-generated method stub
		Button button = new Button(string);
		layout.setConstraints(button, q);
		this.add(button);
	}
}

