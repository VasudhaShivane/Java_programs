import java.awt.*;
import java.applet.*;
public class gridlay extends Applet
{
	Button b1,b2,b3,b4,b5;
	GridBagConstraints gbc;
	public void init()
	{
		setLayout(new GridBagLayout());
		gbc.insets = new Insets(5,5,5,5);
		
		b1 = new Button("ONE");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 5;
		gbc.fill = GridBagConstraints.VERTICAL;
		add(b1,gbc);
		
		b2 = new Button("TWO");
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		add(b2,gbc);

        b3 = new Button("THREE");
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		add(b3,gbc);
		
		b4 = new Button("FOUR");
		gbc.gridx = 3;
		gbc.gridy = 3;
		gbc.gridheight = 1;
		add(b4,gbc);

        b5 = new Button("FIVE");
		gbc.gridx = 4;
		gbc.gridy = 4;
		gbc.gridheight = 1;
		add(b5,gbc);
	}
}
/*applet code = "gridlay.class" width = 500 height = 500 ></applet>*/
	