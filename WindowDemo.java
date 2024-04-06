import java.awt.*;
import java.awt.event.*;
public class WindowDemo
{
	Frame f;
	WindowDemo()
	{
		f = new Frame("window adapter");
		f.addWindowListener(new WindowAdapter());
		
			public void windowClosing(WindowEvent e)
			{
				f.dospose();
			}
		
		f.setVisible(true);
		f.setSize(400,400);
		F.setLayout(null);
	}
	public static vois main(String [] args)
	{
		new WindowDemo();
	}
}
	