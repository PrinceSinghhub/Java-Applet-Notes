import java.applet.Applet;
import java.awt.Graphics;
public class Myapplet extends Applet
{
	int count =1;
	public void init()
	{
		System.out.println("init Method "+ count++);
	}
	public void start()
	{
		System.out.println("Start Method "+ count++);
	}
	public void stop()
	{
		System.out.println("Stop Method "+ count++);
	}
	public void destroy()
	{
		System.out.println("Destroy Method "+ count++);
	}
	public void paint(Graphics g)
	{
		System.out.println("Paint Method "+ count++);
		g.drawString("Welcome to Geekyshows", 50, 20);
	}
}

// <APPLET code="Myapplet.class" width = "200" height = "150"> </APPLET>
