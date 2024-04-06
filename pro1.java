import java.awt.*;
import javax.swing.*;
public class  pro1 extends JApplet implements Runnable
{
	Container c;
	JProgressBar jb;
	public void init()
    {	
		c = getContentPane();
		c.setLayout(new FlowLayout ());
		jb = new JProgressBar();
	    //jb.setString("Loading");
		//jb.setValue(0);
		jb.setStringPainted(true);
		jb.setForeground(Color.BLUE);
		c.add(jb);
		
	}
	
	public void run()
	{
		int i = 10;
		while(i<=100)
		{
			jb.setValue(i);
			
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

/*<applet code = "pro1.class" width = 500 height = 500 ></applet>*/
		
	