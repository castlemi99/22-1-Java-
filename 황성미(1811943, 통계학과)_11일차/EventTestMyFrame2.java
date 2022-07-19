import javax.swing.*;
import java.awt.event.*;

class  EventTestMyFrame2 extends JFrame
{
	private JButton button;
	private JLabel label;

	public EventTestMyFrame2(){
		this.setSize(300,200);
		this.setTitle("Event Programming Style2 : HSM");

		JPanel panel = new JPanel();
		button = new JButton("Click Button");
		label = new JLabel("Please, Click the Button");

		//implements for event
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);

		this.add(panel);
		this.setVisible(true);
	}

	//inner class를 만듬(named class) : 여러번 사용할 경우에 좋음
	private class MyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e){
				if (e.getSource() == button)
				{
					label.setText("Clicked the Button");
				}
			}
	}
}
