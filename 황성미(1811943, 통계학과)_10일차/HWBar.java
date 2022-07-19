import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.*;

public class  HWBar extends JPanel
{
	JLabel title, apr, may, jun, jul, aug,sep, oct;

	public HWBar(){
		setSize(400,500);
		setLayout(null);

		title = new JLabel("<월별 식중독 환자 현황(2020년)>");
		
		apr = new JLabel("4월");
		may = new JLabel("5월");
		jun = new JLabel("6월");
		jul = new JLabel("7월");
		aug = new JLabel("8월");
		sep = new JLabel("9월");
		oct = new JLabel("10월");
		

		title.setBounds(140,25,200,20);
		apr.setBounds(85, 250,30,30);
		may.setBounds(130, 250,30,30);
		jun.setBounds(175, 250,30,30);
		jul.setBounds(220, 250,30,30);
		aug.setBounds(265, 250,30,30);
		sep.setBounds(310, 250,30,30);
		oct.setBounds(355, 250,30,30);

		add(title);
		add(apr);
		add(may);
		add(jun);
		add(jul);
		add(aug);
		add(sep);
		add(oct);

	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2.setPaint(Color.black);
		g2.fill(new Rectangle2D.Float(80,220,30,30));
		g2.fill(new Rectangle2D.Float(125,235,30,15));

		g2.setPaint(Color.orange);
		g2.fill(new Rectangle2D.Float(170,145,30,105));
		g2.fill(new Rectangle2D.Float(215,80,30,170));
		g2.fill(new Rectangle2D.Float(260,195,30,55));

		g2.setPaint(Color.black);
		g2.fill(new Rectangle2D.Float(305,190,30,60));
		g2.fill(new Rectangle2D.Float(350,187,30,63));

		g2.drawLine(75, 250, 400,250);
		g2.drawLine(75,250,75,40);


	}
	
}
