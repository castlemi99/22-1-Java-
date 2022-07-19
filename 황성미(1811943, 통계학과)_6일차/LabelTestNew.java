import java.awt.*;

public class LabelTestNew //클래스를 계속 만들 것이기 때문에 public으로 설정해주자
{
//	public static void main(String[] args) 
//	{
	//Main을 다른 자바파일에 넣는다면 생성자를 만들어줘야함
	LabelTestNew(){
		Frame f = new Frame("Label Test : HSM");
		Label l = new Label("IT Dept. Hwang Sung Mi");
	
		f.add(l);
		f.setSize(500,500);
		f.setVisible(true);
	}

	//다른 생성자를 만들어줄 수도 있음
	LabelTestNew(String title){
		Frame f = new Frame(title); //초기화 가능
		Label l = new Label("Statistic Dept. Hwang Sung Mi");
	
		f.add(l);
		f.setSize(500,500);
		f.setVisible(true);
	}

//	}
}
