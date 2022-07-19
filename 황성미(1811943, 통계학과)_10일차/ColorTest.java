import javax.swing.*;

public class ColorTest extends JFrame {
	public ColorTest(){
		setSize(240,300);
		setTitle("Color Test : HSM");
		setVisible(true);
		JPanel panel = new ColorPanel();
		add(panel);
	}
}
