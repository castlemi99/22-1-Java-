import javax.swing.*;
import java.awt.*;

public class HWOutro extends JPanel 
{
	JLabel title, outro ;

	public HWOutro(){
		setSize(400,500);
		setLayout(null);
		Panel panel = new Panel();

		title = new JLabel("<식중독 예방법>");
		outro = new JLabel("<HTML> <center>" 
		+ "위의 차트에서 볼 수 있듯이 폭염일수가 많을수록 식중독 환자도 많아진다고 해요."
			+ "무더위가 예상되는 올 여름도 식중독을 더욱 조심해야겠어요! "
				+ "그러면 어떻게 해야 식중독을 예방할 수 있을까요? "
					+ "첫째, 음식이 이상해졌다 싶으면 아까워도 절대 먹지 말기. "
						+ "둘째, 물은 끓여서 마시기. "
							+"셋째, 비누를 이용해 30초 이상 손 씻기. "
								+ "이것만 지켜도 무더운 여름 식중독 없이 안전하게 보낼 수 있답니다:)"
									+"</center></HTML>");
		

		title.setBounds(160,25,200,20);
		outro.setBounds(60,60,300,200);

		add(title);
		add(outro);
	}
}
