import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JToggleButtonEx1 extends JApplet implements ItemListener
{
	Container c;
	JToggleButton tb;
	JButton b1;
	ImageIcon i1,j1;
	public void init()
	{
		c  = getContentPane();
		c.setLayout(new FlowLayout());
		
		tb = new JToggleButton("start");
		i1 = new ImageIcon("loading3.gif");
		j1 = new ImageIcon("loading2.jpg");
		b1 = new JButton();
		
		tb.addItemListener(this);
		c.add(tb);
		c.add(b1);
	}
	
	public void itemStateChanged(ItemEvent ae)
	{
		if(tb.isSelected())
		{
			tb.setText("stop");
			b1.setIcon(i1);
		}
		
		else
		{
			tb.setText("start");
			b1.setIcon(j1);
		}
	}
}

/*<applet code = "JToggleButtonEx1.class" height = 500 width = 500> </applet> */
		
		
		
		
