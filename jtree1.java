import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
public class jtree1 extends JApplet
{
	Container c;
	DefaultMutableTreeNode root,vnode,fnode,v1,v2,v3,f1,f2,f3;
	JTree jt;
	
	public void init()
	{
		c = getContentPane();
		//c.setLayout(new FlowLayout());
		root = new DefaultMutableTreeNode ("Root");
	    vnode = new DefaultMutableTreeNode ("Vegetable");
	    fnode = new DefaultMutableTreeNode ("Fruit");
	
	    v1 = new DefaultMutableTreeNode ("potato");
	    v1 = new DefaultMutableTreeNode ("onion");
	    v1 = new DefaultMutableTreeNode ("tomato");
		
		f1 = new DefaultMutableTreeNode ("banana");
	    f2 = new DefaultMutableTreeNode ("apple");
	    f3 = new DefaultMutableTreeNode ("mango");
		
		vnode.add(v1);
		vnode.add(v2);
		vnode.add(v3);
		
		fnode.add(f1);
		fnode.add(f2);
		fnode.add(f3);
		
		root.add(vnode);
		root.add(fnode);
		
		jt = new JTree (root);
		c.add(jt);
	}
}

/*<applet code = jtree1.class height = 500 width = 500 > </applet>*/
		