import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonImageLabelTest implements ActionListener
{
	JPanel panel;
	JLabel label;
	JButton button;

	public JButtonImageLabelTest(String msg){
		JFrame jf = new JFrame(msg);
		jf.setTitle(msg);
		jf.setSize(400,400);

		panel = new JPanel();
		label = new JLabel("Click JButton to see Image.");
		button = new JButton("See Image");
	
		button.addActionListener(this);

		panel.add(label);
		panel.add(button);

		jf.add(panel);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		ImageIcon Happy = new ImageIcon("../Image/happy.png");
		
		label.setIcon(Happy);
		label.setText(":)");
		button.setText("Good Luck");
	}
}  
