import javax.swing.*;
import java.awt.*;

public class JLabelTest 
{
	JFrame jf;
	JLabel label1, label2;
	ImageIcon logo;

	public JLabelTest(String msg){
		jf = new JFrame(msg);

		jf.setTitle("Image Label Test");
		jf.setSize(600,600);
		jf.getContentPane().setBackground(Color.yellow); //awt

		label1 = new JLabel("숙명여자대학교");
	
		logo = new ImageIcon("sm_logo.png");
		label2 = new JLabel("눈송이 로고", logo, JLabel.LEFT);

		jf.getContentPane().add("North", label1);
		jf.getContentPane().add("Center", label2);
		jf.setVisible(true);

	}
}
