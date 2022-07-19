import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.geom.*;

class MyShapePanel extends JPanel 
{
	public MyShapePanel(){
		
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		g.setColor(Color.BLACK);

		int[] xp = new int[] {300,150,100,300,500,450,300};
		int[] yp = new int[] {300,150,300,550,300,150,300};

		g.drawPolyline(xp,yp,7);

		//g.drawLine(50,500,20,100);
	}
}
