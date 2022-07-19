import javax.swing.*;

public class TextureRendering extends JFrame 
{
	public TextureRendering(){
		setSize(1000,1000);
		setTitle("TextureRendering : HSM");
		JPanel panel = new TexturePanel();
		add(panel);
		setVisible(true);
	}
}
