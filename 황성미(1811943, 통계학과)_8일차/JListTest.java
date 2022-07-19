import javax.swing.*;
import java.awt.*;

public class JListTest
{
	JList fruits;

	public JListTest(){
		JFrame jf = new JFrame("JList Test : 황성미");
		jf.getContentPane().setLayout(new FlowLayout());

		String items[] = {"apple", "grape", "melon", "orange", "banana", "pear"};
		fruits = new JList(items);

		fruits.setVisibleRowCount(4);
		JScrollPane sp = new JScrollPane(fruits);

		jf.getContentPane().add(sp);
		jf.setSize(200,200);
		jf.setVisible(true);
	}
}  