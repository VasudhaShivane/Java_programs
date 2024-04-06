import java.awt.*;
import javax.swing.*;
import java.util.*;
public class jcombo extends JApplet
{
	Container c;
	JComboBox cb1,cb2,cb3;
	public void init()
	{
		c = getContentPane();
		c.setLayout ( new FlowLayout ());
		
		cb1 = new JComboBox();
		cb1.addItem("C");
		cb1.addItem("C++");
		cb1.addItem("JAVA");
		cb1.addItem("PYTHON");
		
		String str[] = {"RED" , "GREEN", "BLUE"};
		cb2 = new JComboBox(str);
		
		Vector v = new Vector();
		v.add("SSC");
		v.add("HSC");
		v.add("POLY");
		v.add("BE");
		cb3 = new JComboBox(v);
		
		c.add(cb1);
		c.add(cb2);
		c.add(cb3);
	}
}
/*<applet code = "jcombo.class" height = 500 width = 500 > </applet>*/
	
		
	