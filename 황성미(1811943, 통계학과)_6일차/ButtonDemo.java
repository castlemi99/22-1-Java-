import java.awt.*;

public class ButtonDemo 
{
	public ButtonDemo(){
		//Step1. Frame
		Frame f = new Frame("Button Demmo : HSM");
		//Step2. Button
		Button b = new Button("OK");

		f.add(b);
		f.setSize(300,300);
		f.setVisible(true);

	}
}
