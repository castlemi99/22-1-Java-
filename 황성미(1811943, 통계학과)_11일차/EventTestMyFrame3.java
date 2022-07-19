import javax.swing.*;
import java.awt.event.*;

class  EventTestMyFrame3 extends JFrame
{
	private JButton button;
	private JLabel label;

	//inner class를 만듬

	public EventTestMyFrame3(){
		this.setSize(300,200);
		this.setTitle("Event Programming Style3 : HSM");

		JPanel panel = new JPanel();
		button = new JButton("Click Button");
		label = new JLabel("Please, Click the Button");

		//implements for event
		button.addActionListener(new ActionListener(){
			//무명씨 class : 한 번만 나타나면 되는 경우에 actionListener 안에 바로 넣어줌
			public void actionPerformed(ActionEvent e){
				if (e.getSource() == button)
				{
					label.setText("Clicked the Button");
				}
			}
		});

		panel.add(button);
		panel.add(label);

		this.add(panel);
		this.setVisible(true);
	}
}
