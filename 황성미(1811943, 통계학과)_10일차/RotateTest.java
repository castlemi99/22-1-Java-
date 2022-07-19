import javax.swing.*;

class RotateTest extends JFrame 
{
	public RotateTest(){
		setSize(300,330);
		setTitle("Java 2D Rotate Test : HSM");
		JPanel panel = new RotatePanel();
		add(panel);
		setVisible(true);
	}
}
