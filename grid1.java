import java.awt.*;
import java.applet.*;
public class grid1 extends Applet
{
	static final int n = 3;
	public void init()
	{
		setLayout(new GridLayout(n,n));
		setFont(new Font ("SansSerif",Font.BOLD,24));
		add(new Button ("0"));
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				int k = i*n+j;
				if(k>0)
				{
					add(new Button(""+k));
				}
			}
		}
	}
}
/*<applet code = "grid1.class" width = 500 height = 500 > </applet>*/