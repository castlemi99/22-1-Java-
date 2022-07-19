import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ColorPanel extends JPanel implements ActionListener{
	//화면설계
	JButton button;
	Color color = new Color(0,0,0);

	public ColorPanel(){
		setLayout(new BorderLayout());
		button = new JButton("Color Change");
		button.addActionListener(this); //event
		add(button, BorderLayout.SOUTH);
	}

	//그림
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(10,10,210,220);
	}


	//이벤트(버튼을 누를 때 마다 바뀌는 랜덤 색깔)
	public void actionPerformed(ActionEvent e){
		color = new Color((int) (Math.random()*255.0),
			(int) (Math.random()*255.0),(int) (Math.random()*255.0));

		repaint(); //계속 paintComponent 함수를 부르는 함수
	}
}
