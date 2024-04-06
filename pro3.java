import java.awt.*;
import javax.swing.*;
public class  pro3 extends JApplet
{
	Container c;
	JProgressBar jb;
	
	
	public void init()
    {	
	    
	
		c = getContentPane();
		c.setLayout(new FlowLayout ());
		jb = new JProgressBar();
		jb.setValue(50);
		jb.setForeground(Color.BLUE);
		jb.setString("loading");
		jb.setStringPainted(true);
		c.add(jb);
	
	}
			
		
}

/*<applet code = "pro3.class" width = 500 height = 500 ></applet>*/
		
	