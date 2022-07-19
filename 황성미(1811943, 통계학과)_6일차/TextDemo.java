import java.awt.*;

public class TextDemo
{
	Frame f;
	TextArea text;
	TextField field;

	public TextDemo(){
		f = new Frame("TextDemo");
		f.setLayout(new FlowLayout());

		text = new TextArea("Hello" , 5, 30);
		f.add(text);

		char c = '*';

		field = new TextField(30);
		field.setEchoChar(c);
		f.add(field);

		f.setSize(300,200);
		f.setVisible(true);
	}
}
