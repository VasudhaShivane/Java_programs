import javax.swing.*;
import java.awt.*;
public class pro2 
{
	public static void main (String []args)
	{
		Frame f =new Frame();
        f.setVisible(true);
		f.setSize(500,500);
        f.setLayout(new FlowLayout());
		
	    JProgressBar j = new JProgressBar(0,100);
		f.add(j);
		
		j.setStringPainted(true);
	}
	public void run()
	{
		
		int i = 10;
		while(i<=100)
		{
			j.setValue(i);
			try
			{
			     Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			i = i+10;
		}
	}		
	
}

	
		