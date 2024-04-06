import java.awt.*;
import javax.swing.*;
public class ico extends JApplet
{
	Container c;
	JButton b1;
	ImageIcon i1;
	public void init()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		i1 = new ImageIcon("doreamon.png");
		b1 = new JButton("hey you!",i1);
		c.add(b1);
	}
}
/*<applet code = "ico.class" height = 500 width = 500 > </applet>*/
		
