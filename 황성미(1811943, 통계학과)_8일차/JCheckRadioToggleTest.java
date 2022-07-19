import javax.swing.*;
import java.awt.*;

public class JCheckRadioToggleTest 
{
	JCheckBox major, submajor, interdis;
	JRadioButton single, married, divorced;
	JToggleButton onoff;


	public JCheckRadioToggleTest(){
		JFrame jf = new JFrame("Check, Radio, Toggle Test :황성미");
		jf.getContentPane().setLayout(new GridLayout(3,3));

		major = new JCheckBox("Major", true);
		submajor = new JCheckBox("Sub Major", false);
		interdis = new JCheckBox("Inter Disciplinary", false);

		ButtonGroup bg = new ButtonGroup();
		single = new JRadioButton("Single", true);
		married = new JRadioButton("Married", false);
		divorced = new JRadioButton("Divorced", false);
		bg.add(single);
		bg.add(married);
		bg.add(divorced);

		onoff = new JToggleButton("On/Off");

		jf.getContentPane().add(major);
		jf.getContentPane().add(submajor);
		jf.getContentPane().add(interdis);
		jf.getContentPane().add(single);
		jf.getContentPane().add(married);
		jf.getContentPane().add(divorced);
		jf.getContentPane().add(onoff);

		jf.setSize(300,200);
		jf.setVisible(true);

	}
}
