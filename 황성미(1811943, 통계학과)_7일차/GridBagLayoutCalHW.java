import java.awt.*;

public class GridBagLayoutCalHW
{
	Frame f;
	TextField tf;
	
	public  GridBagLayoutCalHW(){
		f = new Frame("GridBagLayoutCalHW");
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints constraint = new GridBagConstraints();
		f.setLayout(gridbag);

		constraint.fill = GridBagConstraints.BOTH;
		constraint.weightx = 1.0;
		constraint.weighty = 1.5;
		constraint.gridwidth = GridBagConstraints.REMAINDER;
		constraint.gridheight = 2;
		tf = new TextField(100);
		f.add(tf, constraint);
		
		constraint.gridwidth = 1;
		constraint.gridheight = 1;
		f.add(new Button("C"), constraint);
		f.add(new Button("CE"), constraint);
		f.add(new Button("1/x"), constraint);
		constraint.gridwidth = GridBagConstraints.REMAINDER;
		f.add(new Button("DEL"), constraint);

		constraint.gridwidth = 1;
		f.add(new Button("%"), constraint);
		f.add(new Button("/"), constraint);
		f.add(new Button("X"), constraint);
		constraint.gridwidth = GridBagConstraints.REMAINDER;
		f.add(new Button("-"), constraint);

		constraint.gridwidth = 1;
		f.add(new Button("7"), constraint);
		f.add(new Button("8"), constraint);
		f.add(new Button("9"), constraint);
		constraint.gridwidth = GridBagConstraints.REMAINDER;
		f.add(new Button("+"), constraint);

		constraint.gridwidth = 1;
		f.add(new Button("4"), constraint);
		f.add(new Button("5"), constraint);
		f.add(new Button("6"), constraint);
		constraint.gridwidth = GridBagConstraints.REMAINDER;
		f.add(new Button("()"), constraint);

		constraint.gridwidth = 1;
		f.add(new Button("1"), constraint);
		f.add(new Button("2"), constraint);
		f.add(new Button("3"), constraint);
		constraint.gridwidth = GridBagConstraints.REMAINDER;
		f.add(new Button("+/-"), constraint);

		constraint.gridwidth = 1;
		f.add(new Button("0"), constraint);
		f.add(new Button("."), constraint);
		constraint.gridwidth = 2;
		constraint.gridwidth = GridBagConstraints.REMAINDER;
		f.add(new Button("="), constraint);

		f.setSize(400,600);
		f.setVisible(true);
		

	}
}  

