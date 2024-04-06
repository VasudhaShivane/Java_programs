import java.awt.*;
import javax.swing.*;
import java.awt.*.event;
public class JToggleButtonEx1 extends JApplet implements ItemListener
{
	Container c;
	JToggleButton tb;
	JButton b1;
	ImageIcon i1,j1;
	public void init()
	{
		c.getContentPane();
		c.setLayout(new FlowLayout());
		
		tb = new JToggleButton("start");
		i1 = new ImageIcon("loading1.gif");
		j1 = new ImageIcon("loading3.gif");
		b1 = new Button();
		
		tb.addItemListener(this);
		c.add(tb);
		c.add(b1);
	}
	
	public void itemStateChanged(ItemEvent)
	{
		if(jtb.isSelected())
		{
			tb.setText("stop");
		}
		
		else
		{
			tb.setText("start");
		}
	}
}

/*<applet code = "JToggleButtonEx1.class" height = 500 width = 500> </applet> */
		
		
		
		
		
	}
} 
