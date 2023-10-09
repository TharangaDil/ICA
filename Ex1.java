import java.awt.*;
import javax.swing.*;
class Ex1 extends JFrame
{
	Ex1()
	{
		setTitle("First");
		setSize(800,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void paint(Graphics g)
	{
		g.drawRect(200,150,200,100);
		g.drawRect(220,170,160,60);	
		g.drawLine(200,250,300,300);
		g.drawLine(400,250,500,300);
		g.drawLine(300,300,500,300);
	}
	
	public static void main(String args[])
	{
		new Ex1();
	}
}