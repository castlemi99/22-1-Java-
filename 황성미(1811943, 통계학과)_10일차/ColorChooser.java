import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.colorchooser.*;


public class ColorChooser extends JFrame implements ChangeListener 
{
	public JColorChooser color;

	public ColorChooser(){
		setTitle("Color Chooser : HSM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		color = new JColorChooser(); //생성자 호출
		color.getSelectionModel().addChangeListener(this); //리스너 등록
		color.setBorder(BorderFactory.createTitledBorder("Color Select"));
		JPanel panel = new JPanel();
		panel.add(color);
		add(panel);
		pack();
		this.setVisible(true);
	}

	public void stateChanged(ChangeEvent e){
		Color newColor = color.getColor();
	}
}
