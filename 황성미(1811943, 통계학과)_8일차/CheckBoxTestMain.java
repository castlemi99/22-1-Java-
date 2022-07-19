import javax.swing.*;


public class CheckBoxTestMain 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("checkboxtest : 황성미");

		CheckBoxTest panel = new CheckBoxTest();

		panel.setOpaque(true); //이벤트 작동

		frame.add(panel);
		frame.setSize(500,200);
		frame.setVisible(true);
	}
}
