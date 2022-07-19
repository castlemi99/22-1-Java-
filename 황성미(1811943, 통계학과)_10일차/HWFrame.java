import javax.swing.*;
import java.awt.*;

public class HWFrame extends JFrame 
{
	public HWFrame(){
		setTitle("차트 그리기 : HSM");
		setSize(1200,600);
		
		setLayout(new GridLayout(0,3));
	
		HWIntro hwintro = new HWIntro();
		add(hwintro);

		HWBar hwbar = new HWBar();
		add(hwbar);

		HWLine hwline = new HWLine();
		add(hwline);

		HWCircle hwcircle = new HWCircle();
		add(hwcircle);

		HWOutro hwoutro = new HWOutro();
		add(hwoutro);

		setVisible(true);
	}
}
