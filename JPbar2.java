import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class JPbar2 extends JApplet implements ActionListener,Runnable
{
 Container c;
 JProgressBar jp;
 JButton b1,b2;
 Thread t;
 public void init()
 {
	c=getContentPane();
    c.setLayout(new FlowLayout());
    jp=new JProgressBar(0,1000);
    jp.setValue(0);
    jp.setForeground(Color.PINK);
    jp.setStringPainted(true);
    b1=new JButton("Start");
    b2=new JButton("Stop");
    t=new Thread(this);	
	b1.addActionListener(this);
	b2.addActionListener(this);     
    c.add(jp);
    c.add(b1);
    c.add(b2);	
 }
 public void actionPerformed(ActionEvent ae)
 {
	if(ae.getSource()==b1)
    {
		t.start();
	}
    if(ae.getSource()==b2)
    {
		t.stop();
	}	
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
/*<applet code="JPbar2.class" width=500 height=500></applet>*/
