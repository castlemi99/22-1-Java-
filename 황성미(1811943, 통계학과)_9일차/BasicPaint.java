import javax.swing.*;

public class  BasicPaint
{
	BasicPaint(String msg){
		JFrame f = new JFrame(msg);
		f.add(new MyPanel()); //Create My Draw class
		f.setSize(300,200);
		f.setVisible(true);
	}
}
