/*import java.awt.*;
import java.applet.*;
public class ddd extends Applet
{
	Label l1,l2;
	TextField t1,t2;
	Button b1;
	public void init()
	{
		l1 = new Label("Username");
		l2 = new Label("Password");
		t1 = new TextField();
		t2 = new TextField();
		b1 = new Button ("Login");
		setLayout (null);
		
		l1.setBounds(100,100,100,30);
		l2.setBounds(100,150,100,30);
		
		t1.setBounds(230,100,100,30);
		t2.setBounds(230,150,100,30);
	
	    b1.setBounds(230,200,100,30);
		t2.setEchoChar('*');
		add(l1);
		add(l2);
		add(t1);
		add(t2);
		add(b1);
	}
}*/
/*<applet code = "ddd.class" width = 500 height = 500 > </applet>*/
import java.awt.*;
import java.applet.*;
public class ddd extends Applet
{	
	Scrollbar s1,s2;
    public void init()
	{
		s1 = new Scrollbar();
		s2 = new Scrollbar(Scrollbar.HORIZONTAL,150,50,0,300);
		setLayout(null);
		s1.setBounds(100,100,20,100);
		s2.setBounds(150,100,200,30);
		add(s1);
		add(s2);
	}
}

/*<applet code = "ddd.class" width = 500 height = 500 > </applet>*/
		
		
		
		
		
		