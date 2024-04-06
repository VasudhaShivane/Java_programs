import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class card extends Applet implements ActionListener
{
	Button b1,b2,b3,b4;
	Label l1,l2,l3,l4;
	CardLayout c;
	Panel p;
	int currentcard = 1;
	public void init()
	{
		c = new CardLayout(50,50);
		p = new Panel();
		p.setLayout(c);
		l1 = new Label ("Card 1");
		l2 = new Label ("Card 2");
		l3 = new Label ("Card 3");
		l4 = new Label ("Card 4");
		
		b1 = new Button("first");
		b2 = new Button("last");
		b3 = new Button("previous");
		b4 = new Button("next");
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		
		add(p);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
	}
	
	public void actionPerformed (ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			currentcard = 1;
			c.first(p);
		}
		
		if(ae.getSource()==b2)
		{
			currentcard = 2;
			c.last(p);
		}
		
		if(ae.getSource()==b3)
		{
			if(currentcard>1)
			{
				currentcard = currentcard-1;
				c.previous(p);
			}
		}
		if(ae.getSource()==b4)
		{
			if(currentcard<4)
			{
				currentcard = currentcard+1;
				c.next(p);
			}
		}
	}
}
/*<applet code = "card.class" width = 500 height = 500 ></applet>*/
				