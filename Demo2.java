import java.applet.*;
import java.awt.*;
public class Demo2 extends Applet
{
	Checkbox l1,l2,l3,l4,l5;
	CheckboxGroup cbg;
	public void init()
	{
		l1=new Checkbox ("air",cbg,false);
		l2=new Checkbox("two",cbg,true);
		l3=new Checkbox("three",true,cbg);
		l4=new Checkbox("four",cbg,false);
		l5=new Checkbox("five",cbg,false);
		
		
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
	}
}
//<applet code="Demo2.class" width=500 height=500>
//</applet>