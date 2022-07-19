import javax.swing.*;
import java.awt.*;

public class JComboBoxTest 
{
	JComboBox fruits;

	public JComboBoxTest(){
		JFrame jf = new JFrame("JComboBox Test : 황성미");
		jf.getContentPane().setLayout(new FlowLayout());

		String items[] = {"apple", "grape", "melon", "orange", "banana", "pear"};

		fruits = new JComboBox(items);

		jf.getContentPane().add(fruits);
		jf.setSize(200,200);
		jf.setVisible(true);
	}
}
