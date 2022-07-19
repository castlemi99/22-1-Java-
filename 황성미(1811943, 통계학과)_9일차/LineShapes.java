import javax.swing.*;

public class  LineShapes extends JFrame
{
	public LineShapes(){
		setSize(600,600);
		setTitle("Poly-Line Shapes");
		JPanel panel = new MyShapePanel();
		add(panel);
		setVisible(true);
	}
}
