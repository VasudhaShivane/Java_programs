import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;
public class jtree extends JApplet
{
	Container c;
	JTree tree;
	public void init()
	{
		c= getContentPane();
		c.setLayout(new FlowLayout());
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("OPTIONS");
		DefaultMutableTreeNode a   = new DefaultMutableTreeNode("A");
		DefaultMutableTreeNode a1  = new DefaultMutableTreeNode("A1");
		DefaultMutableTreeNode a2  = new DefaultMutableTreeNode("A2");
		DefaultMutableTreeNode b   = new DefaultMutableTreeNode("B");
		DefaultMutableTreeNode b1  = new DefaultMutableTreeNode("B1");
		DefaultMutableTreeNode b2  = new DefaultMutableTreeNode("B2");
		DefaultMutableTreeNode b3  = new DefaultMutableTreeNode("B3");
		
		top.add(a);
		a.add(a1);
		a.add(a2);
		top.add(b);
		b.add(b1);
		b.add(b2);
		b.add(b3);
		
		tree = new JTree(top);
		c.add(tree);
		
		//int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		//int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		//JScrollPane jsp = new JScrollPane(tree,v,h);
		
		//c.add(jsp);
	}
}
		
		
/*<applet code = "jtree.class" height = 500 width = 500> </applet> */	
		
		
	