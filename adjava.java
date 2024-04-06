import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class adjava extends Applet implements MouseListener
{
	Font f1;
	int size = 10;
	
    public void init()
	{
		
		
		addMouseListener(this);
		
		
	}
	public void mouseClicked(MouseEvent me)
	{
		size=size+2;
		Font f1= new Font ("Arial",Font.BOLD,size);
		setFont(f1);
		repaint();
				
	}
	
	public void mousePressed(MouseEvent me)
	{
	}
	public void mouseReleased(MouseEvent me)
	{
	}
	public void mouseEntered(MouseEvent me)
	{
	}
	public void mouseExited(MouseEvent me)
	{
	}
	public void paint(Graphics g)
	{
		
		
		g.drawString("wwwwwwwwwwww",100,100);
	}
	
}
/*<applet code = "adjava.class" width = 500 height = 500 > </applet>*/
    		