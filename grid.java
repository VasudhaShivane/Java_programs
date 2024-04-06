import java.awt.*;
import java.applet.*;
public class grid extends Applet
{
	int g = 0;
	public void init()
	{
		setLayout(new GridLayout(3,3));
		
		for(int i = 0; i< 3; i++)
		{
			for(int j = 0; j< 3; j++)
			{
				add(new Button("  "+g));
				g++;
			}
		}
	}
}

/*<applet code = "grid.class" width = 500 height = 500 ></applet>*/