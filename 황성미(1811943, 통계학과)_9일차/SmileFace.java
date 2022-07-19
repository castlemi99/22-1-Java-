import javax.swing.*;

public class SmileFace extends JFrame 
{
	public SmileFace(){
		setSize(300,300);
		setTitle("Smile-Face : HSM");
		JPanel panel = new SnowManPanel();
		add(panel);
		setVisible(true);

	}
}
