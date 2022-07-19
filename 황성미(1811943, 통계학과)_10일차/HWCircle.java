import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.*;

public class  HWCircle extends JPanel
{
	JLabel title, title2, verygood, excellent, good, fair, notsatisfied;

	public HWCircle(){
		setSize(400,500);
		setLayout(null);
		
		title = new JLabel("<상한 것이 의심되는 등 위해가능성이 있는 식품은");
		title2 = new JLabel("아까워도 섭취하지 않는다(2021년)>");
		
		verygood = new JLabel("매우 그렇다");
		excellent = new JLabel("그런 편이다");
		good = new JLabel("그저 그렇다");
		fair = new JLabel("그렇지 않은 편이다");
		notsatisfied = new JLabel("전혀 그렇지 않다");

		title.setBounds(70,15,300,20);
		title2.setBounds(100,30,300,20);
		verygood.setBounds(85,60,120,20);
		excellent.setBounds(85,100,120,20);
		good.setBounds(85,140,120,20);
		fair.setBounds(85,180,120,20);
		notsatisfied.setBounds(85, 220, 120,20);

		add(title);
		add(title2);
		add(verygood);
		add(excellent);
		add(good);
		add(fair);
		add(notsatisfied);
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	
		g2.setPaint(Color.green);
		g2.fill(new Ellipse2D.Float(40,60,20,20));

		g2.setPaint(Color.blue);
		g2.fill(new Ellipse2D.Float(40,100,20,20));

		g2.setPaint(Color.gray);
		g2.fill(new Ellipse2D.Float(40,140,20,20));

		g2.setPaint(Color.orange);
		g2.fill(new Ellipse2D.Float(40,180,20,20));

		g2.setPaint(Color.red);
		g2.fill(new Ellipse2D.Float(40,220,20,20));
	

		g2.setPaint(Color.green);
		g2.fill(new Arc2D.Float(200,70,150,150,90,60,Arc2D.PIE));

		g2.setPaint(Color.blue);
		g2.fill(new Arc2D.Float(200,70,150,150,150,140,Arc2D.PIE));

		g2.setPaint(Color.gray);
		g2.fill(new Arc2D.Float(200,70,150,150,50,-130,Arc2D.PIE));

		g2.setPaint(Color.orange);
		g2.fill(new Arc2D.Float(200,70,150,150,80,-30,Arc2D.PIE));

		g2.setPaint(Color.red);
		g2.fill(new Arc2D.Float(200,70,150,150,90, -10,Arc2D.PIE));
	
	}
	
}
