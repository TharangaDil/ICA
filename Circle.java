import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Circle extends JFrame implements MouseListener
{
	int x,y,w,z,r;
	Graphics g;
	
	Circle()
	{
		setTitle("bresenham circle algorithm");
		setSize(800,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setVisible(true);
		g=getGraphics();
	}
	public void bresenham(int x1,int y1,int r)
	{
		int x=0,y=r,d=3-2*r;
		while(x<=y)
		{
			circle(x1,y1,x,y);
			if(d<0)
			{
				d = d+4*x+6;
			}
			else
			{
				d = d+4*(x-y)+10;
				y--;
			}
			x++;
		}
	}	
		public void circle(int x,int y,int w,int z)
		{
			g.drawLine(x+w,y+z,x+w,y+z);
			g.drawLine(x+z,y+w,x+z,y+w);
			g.drawLine(x-z,y+w,x-z,y+w);
			g.drawLine(x-w,y+z,x-w,y+z);
			
			g.drawLine(x-w,y-z,x-w,y-z);
			g.drawLine(x-z,y-w,x-z,y-w);
			g.drawLine(x+z,y-w,x+z,y-w);
			g.drawLine(x+w,y-z,x+w,y-z);
		}
		public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e)
	{
		x=e.getX();
		y=e.getY();
	}
	public void mouseReleased(MouseEvent e)
	{
		w=e.getX();
		z=e.getY();
		
		r=(int)Math.sqrt(Math.abs((x-w)*(x-w)+(y-z)*(z-y)));
		
		int r,gb,b;
		r=(int)Math.floor(Math.random()*256);
		gb=(int)Math.floor(Math.random()*256);
		b=(int)Math.floor(Math.random()*256);
		g.setColor(new Color(r,gb,b));
		
		bresenham(x,y,r);
	}
	
		public static void main(String arhs[])
		{
			new Circle();
		}
}