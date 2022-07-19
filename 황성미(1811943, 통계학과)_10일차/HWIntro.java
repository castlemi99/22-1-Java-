import javax.swing.*;
import java.awt.*;

public class HWIntro extends JPanel 
{
	JLabel title, intro;

	public HWIntro(){
		setSize(400,500);
		setLayout(null);
		Panel panel = new Panel();

		title = new JLabel("<뜨거운 여름 안전하게 보내기!>");
		intro = new JLabel("<HTML> <center>" 
			+"5월부터 때이른 무더위가 찾아온 요즘! "
				+"모두들 건강은 잘 지키고 계신가요? "
					+"무더위와 장마가 기승을 부리는 고온다습한 여름엔 "
						+"식중독에 걸리는 사람이 많은데요. "
							+"데이터를 통해 파악한 식중독 현황과 "
								+"어떻게 식중독을 같이 예방할 수 있을지 알아볼까요!?"
									+"</center></HTML>");
	

		title.setBounds(120,25,200,20);
		intro.setBounds(60,60,300,200);
		
		add(title);
		add(intro);
	}
}
