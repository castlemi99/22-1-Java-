import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class  RotatePanel extends JPanel
{
	Rectangle2D.Double rect;

	public RotatePanel(){
		rect = new Rectangle2D.Double(10,10,150,50);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;

		g2.draw(rect);
		g2.translate(100,50);
		g2.rotate(Math.PI/10.0);
		g2.draw(rect);

		g2.translate(300,150);
		for (int i = 0; i < 4 ;i++ )
		{
			g2.rotate(Math.PI/5.0);
			g2.drawString("Hello World", 15,0);
		}
	}
}
