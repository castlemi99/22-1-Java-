import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.geom.*;

public class SnowManPanelHW extends JPanel 
{
	public SnowManPanelHW(){
		
	}

	public void paintComponent(Graphics g){

		

		g.setColor(Color.WHITE);
		g.fillOval(200,100,150,150); //눈사람 얼굴 원
		g.fillOval(180,200,200,200); //눈사람 몸통 원		

		g.setColor(Color.RED);
		//왼쪽 리본
		int[] xp = new int[] {280, 220, 220, 280};
		int[] yp = new int[] {250, 230, 270, 250};
		g.fillPolygon(xp, yp, 4);

		//오른쪽 리본
		int[] xp2 = new int[] {280, 340, 340, 280};
		int[] yp2 = new int[] {250, 230, 270, 250};
		g.fillPolygon(xp2, yp2, 4);
	
		g.setColor(Color.BLACK);
		g.drawArc(220,150,50,50,180,-180); //왼쪽 눈
		g.drawArc(285,150,50,50,180,-180); //오른쪽 눈
		g.drawArc(240,170,70,40,180,180); //입
		
		g.drawLine(200,290, 130,200); //왼쪽 팔
		g.drawLine(360,290, 410,200); //오른쪽 팔

		g.fillOval(275,275,10,10); //몸통 단추
		g.fillOval(275,300,10,10); //몸통 단추
		g.fillOval(275,325,10,10); //몸통 단추
		
		g.setColor(Color.YELLOW);
		int[] xp3 = new int[] {280, 220, 285, 280};
		int[] yp3 = new int[] {170, 185, 185, 170};
		g.fillPolygon(xp3, yp3, 4); //코

	}
}