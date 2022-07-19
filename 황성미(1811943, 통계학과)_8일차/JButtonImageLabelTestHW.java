import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonImageLabelTestHW implements ActionListener
{
	JPanel panel;
	JLabel label;
	JButton button;
	JLabel image;
	boolean status = false;

	public JButtonImageLabelTestHW(String msg){
		JFrame jf = new JFrame(msg);
		jf.setTitle(msg);
		jf.setSize(400,400);

		panel = new JPanel();
		label = new JLabel("Click JButton to see Image.");
		image = new JLabel();
		button = new JButton("See Image");
	
		button.addActionListener(this);

		panel.add(label);
		panel.add(button);
		panel.add(image);

		jf.add(panel);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if (status)
		{
			image.setIcon(null);
			label.setText("Click JButton to see Image.");
			button.setText("See Image");
			status = false;
		}else{
			ImageIcon Happy = new ImageIcon("../Image/happy.png");
		
			image.setIcon(Happy);
			label.setText("뒤로가려면 버튼을 클릭하세요");
			button.setText("뒤로가기");
			status = true;
		}
	}
}  
