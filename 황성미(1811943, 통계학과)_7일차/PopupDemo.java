import java.awt.*;
import java.awt.event.*;

class PopupDemo implements ActionListener //Event 처리 interface 상속
{
	Frame f;
	PopupMenu pm;
	Button b;
	Menu col;

	public PopupDemo(){
		f = new Frame("Popup Demo : HSM");
		pm = new PopupMenu("Pop-UP");
		b = new Button("POP-UP Test");

		b.addActionListener(this); //Event를 받을 준비 명령

		pm.add(new MenuItem("copy"));
		pm.add(new MenuItem("paste"));

		col = new Menu("Color");
		col.add(new MenuItem("red"));
		col.add(new MenuItem("blue"));

		pm.add(col);

		b.add(pm);

		f.add("Center", b);
		f.setSize(400,400);
		f.setVisible(true);
		
	}

	//implements for ActionListener
	//overriding for methods that defined in ActionListner interface
	public void actionPerformed(ActionEvent e){ //Event 실행
		pm.show(b, 10,10);
	}
	

}
