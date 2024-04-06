import java.awt.*;
import javax.swing.*;
public class  hut extends JApplet implements Runnable
{
	Container c;
	JProgressBar jb;
	Thread t;
	
	public void init()
    {	
		c = getContentPane();
		c.setLayout(new FlowLayout ());
		jb = new JProgressBar(0,1000);
	    jb.setString("Loading");
		jb.setValue(0);
		jb.setStringPainted(true);
		jb.setForeground(Color.BLUE);
		
		c.add(jb);
		
		t = new Thread(this);
		t.start();
		
	}
	
	public void run()
	{
		try
		{
			int i = 1;
		    while(i<=1000)
		    {
			     jb.setValue(i);
				 t.sleep(100);
				 i = i+10;
			}
			 
			
		}
			     
			catch(Exception e)
			{
				System.out.println(e);
			}
	     
			
	
	}	
		
}

/*<applet code = "hut.class" width = 500 height = 500 ></applet>*/
		
	