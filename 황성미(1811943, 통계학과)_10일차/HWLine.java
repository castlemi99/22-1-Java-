import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.*;


public class  HWLine extends JPanel
{
	JLabel title, num16, num17, num18, num19, num20, num21;
	JLabel peoplenum, sunny;

	public HWLine(){
		setSize(400,500);
		setLayout(null);

		title = new JLabel("<식중독 환자수와 폭염일수>");
		
		num16 = new JLabel("2016년");
		num17 = new JLabel("2017년");
		num18 = new JLabel("2018년");
		num19 = new JLabel("2019년");
		num20 = new JLabel("2020년");
		num21 = new JLabel("2021년");

		peoplenum = new JLabel(" : 식중독 환자수");
		sunny = new JLabel(": 폭염일수");
		

		title.setBounds(135,10,250,20);
		peoplenum.setBounds(172, 25, 250,20);
		sunny.setBounds(175, 40, 250,20);
		num16.setBounds(85, 250,50,30);
		num17.setBounds(130, 250,50,30);
		num18.setBounds(175, 250,50,30);
		num19.setBounds(220, 250,50,30);
		num20.setBounds(265, 250,50,30);
		num21.setBounds(310, 250,50,30);
		
		

		add(title);
		add(peoplenum);
		add(sunny);
		add(num16);
		add(num17);
		add(num18);
		add(num19);
		add(num20);
		add(num21);
	
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2.setPaint(Color.green);
		g2.drawLine(150,37, 170, 37);
		g2.drawLine(100,150,145,175);
		g2.drawLine(145,175,190,100);
		g2.drawLine(190,100,235,185);
		g2.drawLine(235,185,280,195);
		g2.drawLine(280,195,325,170);
		

		g2.setPaint(Color.orange);
		g2.drawLine(150,52, 170, 52);
		g2.drawLine(100,180,145,205);
		g2.drawLine(145,205,190,130);
		g2.drawLine(190,130,235,215);
		g2.drawLine(235,215,280,225);
		g2.drawLine(280,225,325,200);


		g2.setPaint(Color.black);
		g2.drawLine(75,250,350,250);
		g2.drawLine(75,250,75,40);
	}


}
