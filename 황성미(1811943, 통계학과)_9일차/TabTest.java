import javax.swing.*;
import java.awt.*;

public class TabTest 
{
	JFrame jf;
	JTabbedPane tp;

	public TabTest(String msg){
		jf = new JFrame(msg);

		tp = new JTabbedPane();
		
		//Tab의 수에 따른 Panel 생성 : Tab과 연동하는 Panel 생성
		JPanel one = new JPanel();
		JPanel two = new JPanel();
		JPanel three = new JPanel();

		//Tab 이름 붙이기
		tp.addTab("SMU", one);
		tp.addTab("HAPPY", two);
		tp.addTab("etc", three);

		one.setBackground(Color.red);
		two.setBackground(Color.green);
		//three.setBackground(Color.blue);

		//Tab1 내용 넣기(Panel에 사진 붙이기)
		ImageIcon logo = new ImageIcon("../Image/sm_logo.png");
		JLabel label = new JLabel("SMU Logo", logo, JLabel.RIGHT);
		one.add(label);

		//Tab2 내용 넣기(Panel에 사진 붙이기)
		ImageIcon logo2 = new ImageIcon("../Image/happy.png");
		JLabel label2 = new JLabel("Happy", logo2, JLabel.RIGHT);
		two.add(label2);

		//JFrame visible
		jf.getContentPane().add(tp,BorderLayout.CENTER);
		jf.setSize(400,400);
		jf.setVisible(true);
	}
}
