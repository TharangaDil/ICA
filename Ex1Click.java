import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Ex1Click extends JFrame implements MouseListener
{
	Graphics g;
	int x,y,w,z;
	Ex1Click()
	{
		setTitle("Lap");
		setSize(800,600);
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setVisible(true);
		g = getGraphics();
	}
	
	public void DDA(int x,int y,int w,int z)
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
			steps = Math.abs(dx);
		}
		
		xinc =dx/steps;
		yinc = dy/steps;
		
		x1=x;
		y1 = y;
		
		
		g.drawLine((int)Math.round(x),(int)Math.round(y),(int)Math.round(w),(int)Math.round(z));
		
		
		
		
	}	
		public void DDA1(int x,int y,int w,int z)
		{
		
			g.drawRect((int)Math.round(x),(int)Math.round(y),(int)Math.round(w),(int)Math.round(z));
		
		}		
	
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e)
	{
		x = e.getX();
		y = e.getY();
		drawRect(x,y,w,z);
		drawLine(x,y,w,z);
		
	}
	public void mouseReleased(MouseEvent e)
	{
		w = e.getX();
		z = e.getY();
		
		
	}
	public void drawRect(int x,int y,int w,int z)
	{
		DDA1(x,y,200,100);
		DDA1(x+20,y+20,160,60);	
		
	}
	public void drawLine(int x,int y,int w,int z)
	{
		DDA(x,y+100,x+100,y+150);
		DDA(x+200,y+100,x+300,y+150);
		DDA(x+100,y+150,x+300,y+150);
	}
		
	public static void main(String args[])
	{
		new Ex1Click();
	}
}