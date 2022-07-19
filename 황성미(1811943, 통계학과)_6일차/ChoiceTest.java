import java.awt.*;

public class ChoiceTest
{
	Frame f;
	Choice choice;
	public ChoiceTest(String msg){
		f = new Frame(msg);
		
		f.setLayout(new FlowLayout());
		choice = new Choice();

		choice.add("One");
		choice.add("Two");
		choice.add("Three");
		choice.add("Four");
		choice.add("Five");
		choice.add("Six");

		f.add(choice);
		f.setSize(300,200);
		f.setVisible(true);
	}
}
