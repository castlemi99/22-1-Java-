import javax.swing.*;
import java.awt.*;

class JButtonTest 
{
	JButton plus, minus, mux, divide;

	public JButtonTest(String msg){
		JFrame jf = new JFrame(msg);
		jf.getContentPane().setLayout(new GridLayout(2,2));

		ImageIcon iplus = new ImageIcon("../Image/plus.png");
		ImageIcon iminus = new ImageIcon("../Image/minus.png");
		ImageIcon imux = new ImageIcon("../Image/mux.png");
		ImageIcon idivide = new ImageIcon("../Image/divide.png");

		plus = new JButton(iplus);
		minus = new JButton(iminus);
		mux = new JButton(imux);
		divide = new JButton(idivide);

		jf.getContentPane().add(plus);
		jf.getContentPane().add(minus);
		jf.getContentPane().add(mux);
		jf.getContentPane().add(divide);

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(400,480);
		jf.setVisible(true);



	}
}
