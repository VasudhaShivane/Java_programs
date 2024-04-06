import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class ad1 extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Button b1;
	public void init()
	{
		t1=new TextField(10);
        t2=new TextField(10);
        t3= new TextField(10);
        b1=new Button("Set Color");
        b1.addActionListener(this);
        add(t1);
        add(t2);
        add(t3);
        add (b1);	
    }
	public void actionPerformed(ActionEvent ae)
	{
		
		repaint();
	}
	
	public void paint(Graphics g)
    {
		int a = Integer.parseInt(t1.getText());
		int b = Integer.parseInt(t2.getText());
	    int c = Integer.parseInt(t3.getText());
	    Color c1 = new Color(a,b,c);
	    this.setBackground(c1);      
	}
	
	
	
}	
/*<applet code = "ad1.class" width = 500 height = 500 > </applet>*/