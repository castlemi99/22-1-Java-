import javax.swing.*;

public class MoreShapes extends JFrame 
{
	public MoreShapes(){
		setSize(600,130);
		setTitle("Java 2D Shapes : HSM");
		JPanel panel = new MyShapePanel();
		add(panel);
		setVisible(true);
	}
}
