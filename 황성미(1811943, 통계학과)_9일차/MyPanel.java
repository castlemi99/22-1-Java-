import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel
{
	public MyPanel(){
		//필요한 초기화 기능 설정
		setBorder(BorderFactory.createLineBorder(Color.black));
	}

	public void paintComponent(Graphics g){
		//그림 그리는 코드 구현
		g.drawRect(50,50,50,50);
		g.drawOval(200,50,50,50);
	}
}  

