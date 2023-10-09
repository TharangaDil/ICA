import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Bresenham extends JFrame implements MouseListener
{
	Graphics g;
	int x,y,w,z;
	
	Bresenham()
	{
		setTitle("New");
		setSize(800,600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMouseListener(this);
		setVisible(true);
		g = getGraphics();
	}
	 public void B(int x,int y,int w,int z)
	 {
		 int dx,dy,x1,y1,xend,yend,d;
		 
		 dx = Math.abs(w-x);
		 dy = Math.abs(z-y);
		 
		 d = 2*dy - dx;
		 
		 if(dx<=dy)
		 {
			 if(x>w)
			 {
				 if(y>z)
				 {
					 x1 = w;
					 y1 = z;
					 xend = x;
					 g.drawLine(x1,y1,x1,y1);
					 for(int i=x1+1;i<=xend;i++)
					 {
						 if(d<0)
						 {
							 d = d+2*dy;
						 }
						 else
						 {
							 y1 = y1+1;
							 d = d+2*(dy-dx);
						 }
						 g.drawLine(i,y1,i,y1);

					 }
				 }
				 else
				 {
					  x1 = w;
					 y1 = z;
					 xend = x;
					 g.drawLine(x1,y1,x1,y1);
					 for(int i=x1+1;i<=xend;i++)
					 {
						 if(d<0)
						 {
							 d = d+2*dy;
						 }
						 else
						 {
							 y1 = y1-1;
							 d = d+2*(dy-dx);
						 }
						 g.drawLine(i,y1,i,y1);

					 }
				 }
			}
			else
			{
				if(y>z)
				 {
					 x1 = x;
					 y1 = y;
					 xend = w;
					 g.drawLine(x1,y1,x1,y1);
					 for(int i=x1+1;i<=xend;i++)
					 {
						 if(d<0)
						 {
							 d = d+2*dy;
						 }
						 else
						 {
							 y1 = y1+1;
							 d = d+2*(dy-dx);
						 }
						 g.drawLine(i,y1,i,y1);

					 }
				 }
				 else
				 {
					  x1 = x;
					 y1 = y;
					 xend = w;
					 g.drawLine(x1,y1,x1,y1);
					 for(int i=x1+1;i<=xend;i++)
					 {
						 if(d<0)
						 {
							 d = d+2*dy;
						 }
						 else
						 {
							 y1 = y1-1;
							 d = d+2*(dy-dx);
						 }
						 g.drawLine(i,y1,i,y1);

					 }
				 }
			}
	 }
	 else
	 {
		 d = 2*dx-dy;
		 if(x>w)
			 {
				 if(y>z)
				 {
					 x1 = w;
					 y1 = z;
					 yend = y;
					 g.drawLine(x1,y1,x1,y1);
					 for(int i=y1+1;i<=yend;i++)
					 {
						 if(d<0)
						 {
							 d = d+2*dx;
						 }
						 else
						 {
							 x1 = x1+1;
							 d = d+2*(dx-dy);
						 }
						 g.drawLine(i,x1,i,x1);

					 }
				 }
				 else
				 {
					  x1 = w;
					 y1 = z;
					 yend = y;
					 g.drawLine(x1,y1,x1,y1);
					 for(int i=y1+1;i<=yend;i++)
					 {
						 if(d<0)
						 {
							 d = d+2*dx;
						 }
						 else
						 {
							 x1 = x1-1;
							 d = d+2*(dx-dy);
						 }
						 g.drawLine(i,x1,i,x1);

					 }
				 }
			}
			else
			{
				if(y>z)
				 {
					 x1 = x;
					 y1 = y;
					 yend = z;
					 g.drawLine(x1,y1,x1,y1);
					 for(int i=y1+1;i<=yend;i++)
					 {
						 if(d<0)
						 {
							 d = d+2*dx;
						 }
						 else
						 {
							 x1 = x1+1;
							 d = d+2*(dx-dy);
						 }
						 g.drawLine(i,x1,i,x1);

					 }
				 }
				 else
				 {
					  x1 = x;
					 y1 = y;
					 yend = z;
					 g.drawLine(x1,y1,x1,y1);
					 for(int i=y1+1;i<=yend;i++)
					 {
						 if(d<0)
						 {
							 d = d+2*dx;
						 }
						 else
						 {
							 x1 = x1-1;
							 d = d+2*(dx-dy);
						 }
						 g.drawLine(i,x1,i,x1);

					 }
				 }
			}
		}
	 }
	 
	 public void drawLine(int x,int y,int w,int z)
	 {
		 B(x,y,x+150,y+150);
	 }
	 
	 public void mouseClicked(MouseEvent e){}
	 public void mouseEntered(MouseEvent e){}
	 public void mouseExited(MouseEvent e){}
	 public void mousePressed(MouseEvent e)
	 {
		 x = e.getX();
		 y = e.getY();
		 drawLine(x,y,w,z);

	 }
	 public void mouseReleased(MouseEvent e)
	 {
		 w = e.getX();
		 z = e.getY();
	 }
	 
	 public static void main(String args[])
	 {
		 new Bresenham();
	 }
}