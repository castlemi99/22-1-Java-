import javax.swing.*;
import java.awt.event.*;

class EventTestMyFrame5 extends JFrame
{
	private JButton button;
	private JLabel label;

	public EventTestMyFrame5(){
		this.setSize(300,200);
		this.setTitle("Event Programming Style5 : HSM");

		JPanel panel = new JPanel();
		button = new JButton("Click Button");
		label = new JLabel("Please, Click the Button");
		//가장 간단


		button.addActionListener(e -> {
				label.setText("Clicked the Button");
		});

		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
}
