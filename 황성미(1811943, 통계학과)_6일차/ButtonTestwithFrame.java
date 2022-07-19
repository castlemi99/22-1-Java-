import java.awt.*;

public class  ButtonTestwithFrame extends Frame
{
	Button ok;
	Label label;

	public ButtonTestwithFrame(){
		super("Button Test extends Frame : HSM");

		setLayout(new FlowLayout());

		ok = new Button("OK");
		label = new Label("저는 라벨입니당");

		add(ok);
		add(label);
		setSize(300,300);
		setVisible(true);
	}


	public ButtonTestwithFrame(String title){
		super(title);

		setLayout(new FlowLayout());

		ok = new Button("OK");
		label = new Label("저는 라벨입니당22");

		add(ok);
		add(label);
		setSize(300,300);
		setVisible(true);
	}

}
