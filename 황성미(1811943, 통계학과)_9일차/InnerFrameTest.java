import javax.swing.*;
import java.awt.*;

public class InnerFrameTest
{

	JFrame jf;
	JInternalFrame inframe1, inframe2;
	JDesktopPane desktop; //Inner Frame의 상위 panel
	JButton ok;

	public InnerFrameTest(String msg){
		jf = new JFrame(msg);

		inframe1 = new JInternalFrame("Inner Frame1");
		inframe2 = new JInternalFrame("Inner Frame2");

		desktop = new JDesktopPane();

		//inner frame setting
		ok = new JButton("OK");
		inframe1.getContentPane().add(ok, BorderLayout.SOUTH);
		inframe1.setSize(200,200);
		inframe1.setVisible(true);

		inframe2.setSize(300,300);
		inframe2.setVisible(true);

		//inner frame 붙이기
		desktop.add(inframe1);
		desktop.add(inframe2);

		//JFrame setting
		jf.getContentPane().add(desktop);
		jf.setSize(600,600);
		jf.setVisible(true);
		

	}
}  
