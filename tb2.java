import java.awt.*;
import javax.swing.*;
public class tb2 extends JApplet 
{
    Container c;
    JTabbedPane tb;
    JComboBox b1;
	JCheckBox c1,c2,c3,c4;
	JList j1;
	JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9;
	
	public void init()
	{
		c = getContentPane();
		c.setLayout(new FlowLayout());
		
		tb = new JTabbedPane(JTabbedPane.TOP,JTabbedPane.SCROLL_TAB_LAYOUT);
	    p1 = new JPanel();
        p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p7 = new JPanel();
		p8 = new JPanel();
		p9 = new JPanel();
		 
		b1 = new JComboBox();
		b1.addItem("font");
		b1.addItem("font style");
		b1.addItem("font size");
		p1.add(b1);
		
		c1 = new JCheckBox("subscript");
		c2 = new JCheckBox("superscript");
		c3 = new JCheckBox("strike");
		c4 = new JCheckBox("shadow");
		
		p2.add(c1);
		p2.add(c2);
		p2.add(c3);
		p2.add(c4);
		
		DefaultListModel d1 = new DefaultListModel();
		d1.addElement("spacing");
		d1.addElement("position");
		d1.addElement("margin");
		
		j1 = new JList(d1);
		p3.add(j1);
		
		tb.addTab("font",p1);
		tb.addTab("effects",p2);
		tb.addTab("spacing",p3);
		tb.addTab("lappy",p4);
		tb.addTab("desktop",p5);
		tb.addTab("mouse",p6);
		tb.addTab("keyboard",p7);
		tb.addTab("monitor",p7);
		tb.addTab("CPU",p8);
		tb.addTab("USB",p9);
		
		
		c.add(tb);
    }				
				
}
		
		
    
/*<applet code = "tb2.class" width = 500 height = 500 ></applet>*/