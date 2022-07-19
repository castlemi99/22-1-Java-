import javax.swing.*;
import java.awt.event.*;

class  EventTestMyFrame4 extends JFrame
{
	private JButton button;
	private JLabel label;

	public EventTestMyFrame4(){
		this.setSize(300,200);
		this.setTitle("Event Programming Style4 : HSM");

		JPanel panel = new JPanel();
		button = new JButton("Click Button");
		label = new JLabel("Please, Click the Button");

		button.addActionListener(new EventTestMyListener(label));
		panel.add(button);
		panel.add(label);

		this.add(panel);
		this.setVisible(true);
	}
	
}