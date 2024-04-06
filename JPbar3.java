import java.awt.*;
import javax.swing.*;
public class JPbar3 extends JApplet implements Runnable
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
  jp.setStringPainted(true);
  t=new Thread(this);
  t.start();
  c.add(jp);
 }
public void run()
 {
     int i;
	 try
	 {
	  for(i=0;i<=1000;i++)
	  {
	   if(i<=500)
	   {
	    jp.setValue(i);
		jp.setForeground(Color.RED);
	   }
	   else if(i>=500&&i<=750)
	   {
	    jp.setValue(i);
		jp.setForeground(Color.BLUE);
	   }
	   else
	   {
		jp.setValue(i);
		jp.setForeground(Color.GREEN);  
	   }
	   
	   t.sleep(10);
	  }
	 }
	 catch(Exception e)
	  {
		  System.out.println(e);
	  }
 }
}
/*<applet code="JPbar3.class" width=500 height=500></applet>*/
