import java.awt.*;

class ScrollPaneDemo
{
	Frame f;
	ScrollPane sp;
	Panel mp, bp;
	TextArea ta;
	Button ok, cancel;

	ScrollPaneDemo(){
		f = new Frame("ScrollPane Demo : HSM");

		sp = new ScrollPane();
		sp.setSize(200,200);

		mp = new Panel();
		bp = new Panel();

		ta = new TextArea();
		ok = new Button("OK");
		cancel = new Button("Cancel");

		mp.add(ta);
		sp.add(mp);
		bp.add(ok);
		bp.add(cancel);

		f.add(sp, "Center");
		f.add(bp, "South");
		f.setSize(300,300);
		f.setVisible(true);
	}
}
