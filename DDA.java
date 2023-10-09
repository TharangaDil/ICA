import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DDA extends JFrame implements MouseListener
{
	Graphics g;
	int x,y,w,z;
	
	DDA()
	{
		setTitle("DDA");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		addMouseListener(this);
		setVisible(true);
		g = getGraphics();
	}
	
	public void dda(int x,int y,int w,int z)
	{
		int dx,dy;
		double steps,xinc,yinc,x1,y1;
		
		dx = w-x;
		dy = z-y;
		
		if(Math.abs(dx)>Math.abs(dy))
		{
			steps = Math.abs(dx);
		}
		else
		{
			steps = Math.abs(dy);
		}
		
		xinc = dx/steps;
		yinc = dy/steps;
		
		x1=x;
		y1=y;
		
		for(int i=0;i<=steps;i++)
		{
			x1 = x1+xinc;
			y1 = y1+yinc;
			
			g.drawLine((int)Math.round(x),(int)Math.round(y),(int)Math.round(w),(int)Math.round(z));
		
		}
	}
	public void drawLine(int x,int y,int w,int z)
	{
		dda(x,y,x+150,y+150);
	}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
		
		drawLine(x,y,w,z);
	}
	public void mouseReleased(MouseEvent e)
	{
		w=e.getX();
		z=e.getY();
		
	}
	public static void main(String args[])
	{
		new DDA();
	}
}