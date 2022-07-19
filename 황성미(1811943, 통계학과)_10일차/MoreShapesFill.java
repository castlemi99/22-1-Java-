import javax.swing.*;

public class MoreShapesFill extends JFrame 
{
	public MoreShapesFill(){
		setSize(600,130);
		setTitle("Java 2D ShapesFill : HSM");
		JPanel panel = new ShapesFillPanel();
		add(panel);
		setVisible(true);
	}
}