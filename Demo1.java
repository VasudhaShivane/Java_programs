import java.applet.*;
import java.awt.*;
public class Demo1 extends Applet
{
	Label l1,l2,l3,l4,l5;
	public void init()
	{
		l1=new Label("one");
		l2=new Label("two");
		l3=new Label("three");
		l4=new Label("four");
		l5=new Label("five");
		setLayout(null);
		l1.setBounds(100,100,100,30);
		l2.setBounds(100,150,100,30);
		l3.setBounds(100,200,100,30);
		l4.setBounds(100,250,100,30);
		l5.setBounds(100,300,100,30);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
	}
}
//<applet code="Demo1.class" width=500 height=500>
//</applet>
		
	