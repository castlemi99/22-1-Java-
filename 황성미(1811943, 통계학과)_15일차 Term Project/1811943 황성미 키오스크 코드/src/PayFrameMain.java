import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class PayFrameMain extends JFrame
{
	public PayFrameMain(){
		setTitle("Sookmyung Cafe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		setContentPane(new Pay());

		setSize(1000,660);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new PayFrameMain();
	}

	
}
