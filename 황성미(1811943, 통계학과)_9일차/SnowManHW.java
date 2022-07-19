import javax.swing.*;

public class SnowManHW extends JFrame 
{
	public SnowManHW(){
		setSize(600,600);
		setTitle("SnowManHW : HSM");
		JPanel panel = new SnowManPanelHW();
		add(panel);
		setVisible(true);

	}
}