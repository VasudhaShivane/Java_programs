import java.awt.*;
import javax.swing.*;
public class JPbar1 extends JApplet implements Runnable
{
 Container c;
 JProgressBar jp;
 Thread t;
 public void init()
 {
  c=getContentPane();
  c.setLayout(new FlowLayout());
  jp=new JProgressBar(0,1000);
  jp.setValue(0);
  jp.setForeground(Color.RED);
  jp.setStringPainted(true);
  t=new Thread(this);
  t.start();
  c.add(jp);
 }
public void run()
 {
	 try
	 {
		 int i=1;
		 while(i<=1000)
		 {
			 jp.setValue(i);
			 t.sleep(100);
			 i=i+10;
		 }	 
	 }
	 catch(Exception e)
	 {
		 System.out.println(e);
	 }
 }
}
/*<applet code="JPbar1.class" width=500 height=500></applet>*/
