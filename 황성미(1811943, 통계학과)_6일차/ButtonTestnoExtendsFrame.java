import java.awt.*;

public class  ButtonTestnoExtendsFrame extends Frame
{
	Frame f; //모든 생성자에 접근 가능하기 때문에 이렇게 밖에 선언해주는것이 유용
	Button ok;
	Label label;
	

	public ButtonTestnoExtendsFrame(){
		f = new Frame("Button Test no-extends Frame : HSM");

		f.setLayout(new FlowLayout());

		ok = new Button("OK");
		label = new Label("저는 라벨입니당");

		f.add(ok);
		f.add(label);
		f.setSize(300,300);
		f.setVisible(true);
	}


	public ButtonTestnoExtendsFrame(String title){
		f = new Frame(title);

		f.setLayout(new FlowLayout());

		ok = new Button("OK");
		label = new Label("저는 라벨입니당22");

		f.add(ok);
		f.add(label);
		f.setSize(300,300);
		f.setVisible(true);
	}

}
