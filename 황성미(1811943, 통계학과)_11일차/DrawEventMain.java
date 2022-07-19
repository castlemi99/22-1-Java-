import javax.swing.*;

public class DrawEventMain {
	JFrame jf;

	public DrawEventMain(String msg){
		jf = new JFrame(msg);
		jf.setSize(800,900);
		jf.add(new DrawEvent());
		jf.setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new DrawEventMain("DrawEvent : HSM");
	}
}